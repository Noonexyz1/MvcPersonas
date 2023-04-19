
package com.emergentes.controlador;

import com.emergentes.modelo.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        HttpSession ses = request.getSession();
        String op = request.getParameter("op");
        String opcion = (op != null)? op : "view";
        
        if (ses.getAttribute("listaper") == null) {
            ArrayList<Persona> listaux = new ArrayList<Persona>();
            ses.setAttribute("listaper", listaux);
            
        }
        
        ArrayList<Persona> lista = (ArrayList<Persona>) ses.getAttribute("listaper");
        
        switch(opcion){
            case "nuevo":
                Persona obj1 = new Persona();
                request.setAttribute("miPersona", obj1);
                request.getRequestDispatcher("editar.jsp").forward(request, response);
                break;
                
            case "editar":
                
                break;
                
            case "eliminar":
                
                break;
                
            case "view":
                response.sendRedirect("index.jsp");
                break;
                 
                 
        }
        
       
        
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   

}
