package wasdev.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import LogicaDeNegocios.Conversacion;
import LogicaDeNegocios.Traducir;

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
    	Traducir traduciendo = new Traducir("11e3e5eb-5665-466a-9891-b09fb25f50bb","BGIGbBhCCFgx");
    	
    	String tipoConsulta = request.getParameter("tipoConsulta").toString();
    	String traducirConsulta = request.getParameter("traducirConsulta").toString();

        if("poo".equals(tipoConsulta))
        {
        	conversacion = new Conversacion("8a14fea8-d65d-4a6e-b0e8-021cce7273cb","ue4A3US7D8Pr","92a995c1-6ec0-454f-a515-e4243b2b13c2");    		
        }
    	else{
    	    if("uml".equals(tipoConsulta))
    	    {
    	    	conversacion = new Conversacion("8a14fea8-d65d-4a6e-b0e8-021cce7273cb","ue4A3US7D8Pr","41346011-39a9-4f93-8000-e11249bdfe23");
    		}
    		   else
    		     conversacion = new Conversacion("8a14fea8-d65d-4a6e-b0e8-021cce7273cb","ue4A3US7D8Pr","47d5264d-9f9d-418a-a61c-36fb794f214a");
    	    }
    	
    	
        if ("traducir".equals(traducirConsulta)){
        	RespuestaBean res = new RespuestaBean();
        	res.setRespuesta(traduciendo.traducirEspañolIngles(conversacion.consultarPregunta(request.getParameter("pregunta"))));

        	
            request.setAttribute("RespuestaBean", res);
            request.getRequestDispatcher("consultar.jsp").forward(request, response);
        }
    	RespuestaBean res = new RespuestaBean();
    	res.setRespuesta(conversacion.consultarPregunta(request.getParameter("pregunta")));

    	
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
