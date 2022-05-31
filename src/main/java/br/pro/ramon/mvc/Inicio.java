package br.pro.ramon.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/index")
public class Inicio extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Temperatura aquecedor = (Temperatura) session.getAttribute("aquecedor");
        if (aquecedor == null) {
            aquecedor = new Temperatura();
            session.setAttribute("aquecedor", aquecedor);
        }
        
        req.setAttribute("aquecedor", aquecedor);
        req.getRequestDispatcher("inicial.jsp").forward(req, resp);
    }

}
