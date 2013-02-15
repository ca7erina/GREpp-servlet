package action;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.*;
import dao.jdbc.*;
import entity.*;


public class GeneralServlet extends HttpServlet {

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

		} else if (path.equalsIgnoreCase("listArgumentPool")) {
			ArgumentDao dao= new JdbcArgumentDao();
			try {
				List<Argument> arguments=dao.findAllArgumentPool();
				request.setAttribute("arguments", arguments);
				request.getRequestDispatcher("listArgumentPool.jsp").forward(request,
						response);
				return;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				return;
			} else if (path.equalsIgnoreCase("listArgument")) {
				ArgumentDao dao= new JdbcArgumentDao();
				try {
					List<Argument> arguments=dao.findAllArgument();
					request.setAttribute("arguments", arguments);
					request.getRequestDispatcher("listArgument.jsp").forward(request,
							response);
					return;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					return;
				}else if (path.equalsIgnoreCase("listIssuePool")) {
				IssueDao dao= new JdbcIssueDao();
				try {
					List<Issue> issues=dao.findAllIssuePool();
					request.setAttribute("issues", issues);
					request.getRequestDispatcher("listIssuePool.jsp").forward(request,
							response);
					return;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					return;
				}else if (path.equalsIgnoreCase("listIssue")) {
					IssueDao dao= new JdbcIssueDao();
					try {
						List<Issue> issues=dao.findAllIssue();
						request.setAttribute("issues", issues);
						request.getRequestDispatcher("listIssue.jsp").forward(request,
								response);
						return;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
						return;
					}else if (path.equalsIgnoreCase("listReading")) {
						ReadingDao dao= new JdbcReadingDao();
						try {
							List<Reading> readings=dao.findAllReading();
							request.setAttribute("readings", readings);
							request.getRequestDispatcher("listReading.jsp").forward(request,
									response);
							return;
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
							return;
						}else{
				System.out.println(" path error");
			}

		return;
	}

}
