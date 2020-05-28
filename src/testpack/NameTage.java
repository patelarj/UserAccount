package testpack;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class NameTage extends SimpleTagSupport {

	private String color = "yello";
	private String size= "14px";
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		super.doTag();
		
		JspWriter out = getJspContext().getOut();
		out.println("<h1 style=\"color:"+ color+";font-size"+ size+";\" >");
					getJspBody().invoke(null);
		out.println("</h1>");
	}
	
}
