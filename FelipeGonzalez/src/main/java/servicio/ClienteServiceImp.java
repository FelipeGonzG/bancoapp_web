package servicio;

import datos.ClienteDAO;
import javax.inject.Inject;
import models.Cliente;

public class ClienteServiceImp implements ClienteService{

    @Inject
    private ClienteDAO clienteDAO;
    
    @Override
    public Cliente buscarCliente(Cliente cliente) {
        return clienteDAO.getCliente(cliente);
    }

    @Override
    public Cliente buscarClientePorRut(Cliente cliente) {
        return clienteDAO.getClienteByRut(cliente);
    }
    
}
