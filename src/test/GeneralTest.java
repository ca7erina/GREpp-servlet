package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GeneralTest extends HttpServlet {

	public GeneralTest(){
		System.out.println("Constructiing of Class General Test");
	}


	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service() conducting.....");
		String name=request.getParameter("name");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>General Test"+this.getClass()+"</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("   Test name parameter :" +name);
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
