package action;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class ListVerbalServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		String uri = request.getRequestURI();
		String suffix = this.getServletConfig().getInitParameter("suffix");
		System.out.println(" login servlet");
		String path = uri.substring(uri.lastIndexOf("/") + 1, uri.lastIndexOf(suffix));
		System.out.println(path);
	

		if (path.equalsIgnoreCase("login")) {
			try {
			
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				
				if (username.equals("admin") && password.equals("123456")) {
					System.out.println("username password match--> loginng in");
					HttpSession session = request.getSession();
					session.setAttribute("username", "admin");
					response.sendRedirect("home.jsp");
					return;
				} else {
					System.out.println(" login failed");
					request.setAttribute("loginError"," * Username or password dosen't match");
					request.getRequestDispatcher("login.jsp").forward(request,
							response);
					return;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (path.equalsIgnoreCase("register")) {
			
				return;
			}else{
				System.out.println(" path error");
			}

		return;
	}

}
