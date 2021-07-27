package servicio;

import models.Cliente;

public interface ClienteService {
    public Cliente buscarCliente(Cliente cliente);
    public Cliente buscarClientePorRut(Cliente cliente);
}
