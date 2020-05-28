package testpack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditAccount
 */
@WebServlet("/EditAccount")
public class EditAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		Integer uid = (Integer) request.getSession().getAttribute("uid");
    		
    		DB_Access db = new DB_Access();
    		User one = db.getUser(uid);
    		request.setAttribute("name", one.getName());
    		request.setAttribute("lname", one.getLoginName());
    		request.setAttribute("pass", one.getLoginPass1());
    		
    		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/edituserpage.jsp");
    		rd.forward(request, response);
    	
    	
    	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer uid = (Integer) request.getSession().getAttribute("uid");
		String name =  request.getParameter("name");
		String lname = request.getParameter("lname");
		String pass = request.getParameter("pass");
		User one = new User(uid, lname, name, pass);
		DB_Access db = new DB_Access();
		int st = db.updateUser(uid, one); 
		if(st == 0) {
			response.sendRedirect("Home");
			
		}
		else {
			
			response.sendRedirect("EditAccount?msg=either name or pass or both are wrong...");
		}
		
	
		
		
		}

}
