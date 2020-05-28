package testpack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewItem
 */
@WebServlet("/ViewItem")
public class ViewItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		
    		int id = Integer.parseInt( request.getParameter("id"));
    		DB_Access db = new DB_Access();
    		Item it = db.viewItem(id);
    		 String item = "Name of item : "+it.getName()+" Quantity of item :"+it.getQty();
    		request.setAttribute("item", item);
    		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/viewitem.jsp"); 
    		rd.forward(request, response);
    		
    	
    	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	
	
	}
	

}
