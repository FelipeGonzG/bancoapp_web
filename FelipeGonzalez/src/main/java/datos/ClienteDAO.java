package datos;

import models.Cliente;

public interface ClienteDAO {
    public Cliente getCliente(Cliente cliente);
    public Cliente getClienteByRut(Cliente cliente);
}
