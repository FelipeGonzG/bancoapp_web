package datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import models.Ejecutivo1;

@Stateless
public class EjecutivoDAOImp implements EjecutivoDAO{

    @PersistenceContext(unitName = "BANCO_PU")
    EntityManager em;
    
    
    @Override
    public List<Ejecutivo1> findAllEjecutivos() {
        return em.createNamedQuery("Ejecutivo.findAll").getResultList();
    }

    @Override
    public List<Ejecutivo1> findAllEjecutivos(String filtro) {
        Query query = em.createQuery("from Ejecutivo e where e.rut LIKE :filtro or e.apellido LIKE :filtro");
        query.setParameter("filtro", "%" + filtro + "%");
        return query.getResultList();
    }
    
    @Override
    public Ejecutivo1 findEjecutivoByRut(Ejecutivo1 ejecutivo) {
        return em.find(Ejecutivo1.class, ejecutivo.getRut());
    }
    

    @Override
    public void insertEjecutivo(Ejecutivo1 ejecutivo) {
        em.persist(ejecutivo);
    }

    @Override
    public void updateEjecutivo(Ejecutivo1 ejecutivo) {
        em.merge(ejecutivo);
    }

    @Override
    public void deleteEjecutivo(Ejecutivo1 ejecutivo) {
        em.remove(em.merge(ejecutivo));
    }
    
}
