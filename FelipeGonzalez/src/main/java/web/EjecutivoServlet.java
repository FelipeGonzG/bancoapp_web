package web;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Ejecutivo1;
import servicio.EjecutivoService;

@WebServlet(name = "EjecutivoServlet", urlPatterns = {"/mibanco"})
public class EjecutivoServlet extends HttpServlet {

    @Inject
    EjecutivoService ejecutivoService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String filtro = request.getParameter("filtro");
        if (filtro == null) filtro = "";
        List<Ejecutivo1> ejecutivos = ejecutivoService.listaEjecutivos(filtro);
        request.setAttribute("ejecutivos", ejecutivos);
        request.getRequestDispatcher("/listadoEjecutivos.jsp").forward(request, response);
        
    }

   
}
