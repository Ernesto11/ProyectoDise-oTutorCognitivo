package wasdev.sample.servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import LogicaDeNegocios.Conversacion;

/**
 * Servlet implementation class ServletConsulta
 */
@WebServlet(name = "ServletConsulta", urlPatterns = {"/ServletConsulta"})
public class ServletConsulta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConsulta() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
   
    	Conversacion conversacion;
    	String tipoConsulta = request.getParameter("tipoConsulta").toString();

        if("poo".equals(tipoConsulta))
        {
        	conversacion = new Conversacion("35a4cbe1-56ec-4f9e-8b2a-ef80d3a77521","01sumefaccpZ","bea3b85e-8324-47b2-8072-460c6543ab76");    		
        }
    	else{
    	    if("uml".equals(tipoConsulta))
    	    {
    	    	conversacion = new Conversacion("35a4cbe1-56ec-4f9e-8b2a-ef80d3a77521","01sumefaccpZ","af022dfc-62a0-4b0c-baed-99c62046cb3c");
    		}
    		   else
    		     conversacion = new Conversacion("35a4cbe1-56ec-4f9e-8b2a-ef80d3a77521","01sumefaccpZ","5c3ab848-0c00-46cd-9cda-a29f298955b0");
    	    }
    	
    	conversacion.consultarPregunta(request.getParameter("pregunta"));
   
    	RespuestaBean res = new RespuestaBean();
    	res.setRespuesta(conversacion.obtenerRespuesta());

    	
        request.setAttribute("RespuestaBean", res);
        request.getRequestDispatcher("consultar.jsp").forward(request, response);
    	
        }
    


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold

}
