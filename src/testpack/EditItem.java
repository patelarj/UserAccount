package testpack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditItem
 */
@WebServlet("/EditItem")
public class EditItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
   		int id = Integer.parseInt( request.getParameter("id"));
		DB_Access db = new DB_Access();
		Item it = db.viewItem(id);
		String in = it.getName();
		int iq = it.getQty();		
		request.setAttribute("in", in);
		request.setAttribute("iq", iq);

   		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/edititempage.jsp");
		rd.forward(request, response);	
   	  	
   	
   	}

   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		int iid = Integer.parseInt(request.getParameter("id"));
   		String iname = request.getParameter("iname");
   		int qut = Integer.parseInt(request.getParameter("qua"));
   		
   		Item i = new Item(iid, iname, qut);
   	  	DB_Access db = new DB_Access();
   	  	db.ModifyItem(iid, i);
   	  	response.sendRedirect("Home");
   
   	
   	
   	}

}
