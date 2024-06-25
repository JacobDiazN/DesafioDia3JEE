package cl.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.modelo.NumeroFactorial;

@WebServlet("/ObtenerFactorial")
public class ObtenerFactorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ObtenerFactorial() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int numF = Integer.parseInt(request.getParameter("num"));
		
		NumeroFactorial numeroFactorial = new NumeroFactorial();
		int numeroF =  numeroFactorial.getNumeroFactorial(numF);
		
		// Enviar la respuesta al cliente
        response.getWriter().append("El factorial de ").append(String.valueOf(numF)).append(" es: ").append(String.valueOf(numeroF));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
