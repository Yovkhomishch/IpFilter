package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by igor on 2/5/19
 *
 * @author Yovkhomishch I.A.
 */
@WebServlet
public class OneServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("index.html");
        dispatcher.forward(req, resp);
    }

}


