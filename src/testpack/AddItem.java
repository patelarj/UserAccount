package testpack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddItem
 */
@WebServlet("/AddItem")
public class AddItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		
    		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/additempage.jsp");
    		rd.forward(request, response);
    	
    	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			String iname = request.getParameter("iname");
			String  iqty = request.getParameter("iqua");
			Integer uid = (Integer) request.getSession().getAttribute("uid");
			DB_Access db = new DB_Access();
			int res = db.addItem(iname, iqty, uid);
			if(res == 0) {
			response.sendRedirect("Home");
			}
			else {
				response.sendRedirect("Home?msg=Please enter proper value.....");
			}
	}

}
