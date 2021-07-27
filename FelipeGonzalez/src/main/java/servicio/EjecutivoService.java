package servicio;

import java.util.List;
import models.Ejecutivo1;

public interface EjecutivoService {
    public List<Ejecutivo1> listaEjecutivos();
    public List<Ejecutivo1> listaEjecutivos(String filtro);
    public Ejecutivo1 encontrarEjecutivoPorRut(Ejecutivo1 ejecutivo);
    public void registrarContacto(Ejecutivo1 ejecutivo);
    public void modificarContacto(Ejecutivo1 ejecutivo);
    public void eliminarContacto(Ejecutivo1 ejecutivo);
}
