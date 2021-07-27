package datos;

import java.util.List;
import models.Ejecutivo1;

public interface EjecutivoDAO {
    public List<Ejecutivo1> findAllEjecutivos();
    public List<Ejecutivo1> findAllEjecutivos(String filtro);
    public Ejecutivo1 findEjecutivoByRut(Ejecutivo1 ejecutivo);
    public void insertEjecutivo(Ejecutivo1 ejecutivo);
    public void updateEjecutivo(Ejecutivo1 ejecutivo);
    public void deleteEjecutivo(Ejecutivo1 ejecutivo);
}
