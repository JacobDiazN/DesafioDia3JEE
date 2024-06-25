package cl.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.modelo.ParImpar;

@WebServlet("/ObtenerParImpar")
public class ObtenerParImpar extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public ObtenerParImpar() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numero = Integer.parseInt(request.getParameter("num"));
        
        ParImpar numeroParImpar = new ParImpar();
        String resultado = numeroParImpar.getNumeroParImpar(numero);
        
        // Enviar la respuesta al cliente
        response.getWriter().append(resultado);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

