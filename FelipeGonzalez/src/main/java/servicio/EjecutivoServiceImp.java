package servicio;

import datos.EjecutivoDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import models.Ejecutivo1;


@Stateless
public class EjecutivoServiceImp implements EjecutivoService{

    @Inject
    private EjecutivoDAO ejecutivoDAO;
    
    @Override
    public List<Ejecutivo1> listaEjecutivos() {
        return ejecutivoDAO.findAllEjecutivos();
    }
    
    @Override
    public List<Ejecutivo1> listaEjecutivos(String filtro) {
        return ejecutivoDAO.findAllEjecutivos(filtro);
    }

    @Override
    public Ejecutivo1 encontrarEjecutivoPorRut(Ejecutivo1 ejecutivo) {
        return ejecutivoDAO.findEjecutivoByRut(ejecutivo);
    }

    @Override
    public void registrarContacto(Ejecutivo1 ejecutivo) {
        ejecutivoDAO.insertEjecutivo(ejecutivo);
    }

    @Override
    public void modificarContacto(Ejecutivo1 ejecutivo) {
        ejecutivoDAO.updateEjecutivo(ejecutivo);
    }

    @Override
    public void eliminarContacto(Ejecutivo1 ejecutivo) {
        ejecutivoDAO.deleteEjecutivo(ejecutivo);
    }
    
}
