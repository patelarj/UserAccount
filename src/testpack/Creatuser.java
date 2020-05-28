package testpack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Creatuser
 */
@WebServlet("/Creatuser")
public class Creatuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/creatuserpage.jsp");
		rd.forward(request, response);
   	
   	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String lname = request.getParameter("lname");
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");
		
		User one = new User(1, lname, name, pass1, pass2);
		
		DB_Access db = new DB_Access();
		int it = db.createUserAccount(one);
		if(it == 0) {
			response.sendRedirect("Login?msg=New user created...");
		}
		else {
			
			response.sendRedirect("Creatuser?msg=either name or pass or both are wrong...");
		}
		
	
	}

}
