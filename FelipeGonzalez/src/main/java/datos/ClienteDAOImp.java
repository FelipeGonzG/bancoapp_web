package datos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import models.Cliente;

@Stateless
public class ClienteDAOImp implements ClienteDAO{
    
    @PersistenceContext(unitName = "BANCO_PU")
    EntityManager em;
    
    @Override
    public Cliente getCliente(Cliente cliente){
        return em.find(Cliente.class, cliente.getRut());
    }

    @Override
    public Cliente getClienteByRut(Cliente cliente) {
         Query query = em.createQuery("from Cliente c where rut = :rut");
        query.setParameter("rut", cliente.getRut());
        return (Cliente) query.getSingleResult();
    }
    
}
