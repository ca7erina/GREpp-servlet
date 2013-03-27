package action.list.byPage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.*;
import dao.jdbc.*;
import entity.*;
import entity.Math;


public class ListByPage extends HttpServlet {
	int iftaken=0;
	int page=1;
	int pagesize=1;
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		String uri = request.getRequestURI();
		String suffix = this.getServletConfig().getInitParameter("suffix2");
		String path = uri.substring(uri.lastIndexOf("/") + 1, uri.lastIndexOf(suffix));
		System.out.println(path);
	

		if (path.equalsIgnoreCase("argument")) {
			try {
				ArgumentDao dao=new JdbcArgumentDao();
				List<Argument> arguments=new ArrayList<Argument>();
				this.iftaken=Integer.parseInt(request.getParameter("iftaken"));
				this.page=Integer.parseInt(request.getParameter("page"));
				this.pagesize=Integer.parseInt(request.getParameter("pagesize"));
				System.out.println(iftaken+page+pagesize);
				arguments=dao.findArgumentByPage(iftaken, page, pagesize);
				request.setAttribute("arguments", arguments);
				request.setAttribute("page",page);
				request.setAttribute("pagesize",pagesize);
				request.setAttribute("iftaken",iftaken);
				request.getRequestDispatcher("jijingTake.jsp").forward(request,
						response);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;

		} else if (path.equalsIgnoreCase("issue")) {
			try {
				IssueDao dao=new JdbcIssueDao();
				List<Issue> issues=new ArrayList<Issue>();
				iftaken=Integer.parseInt(request.getParameter("iftaken"));
				page=Integer.parseInt(request.getParameter("page"));
				pagesize=Integer.parseInt(request.getParameter("pagesize"));
				issues=dao.findIssueByPage(iftaken, page, pagesize);
				request.setAttribute("issues", issues);
				request.setAttribute("page",page);
				request.setAttribute("pagesize",pagesize);
				request.setAttribute("iftaken",iftaken);
				request.getRequestDispatcher("jijingTake.jsp").forward(request,
						response);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
			} else if (path.equalsIgnoreCase("Verbal")) {
				try {
					VerbalDao dao=new JdbcVerbalDao();
					List<Verbal> verbals=new ArrayList<Verbal>();
					iftaken=Integer.parseInt(request.getParameter("iftaken"));
					page=Integer.parseInt(request.getParameter("page"));
					pagesize=Integer.parseInt(request.getParameter("pagesize"));
					verbals=dao.findVerbalByPage(iftaken, page, pagesize);
					request.setAttribute("verbals", verbals);
					request.setAttribute("page",page);
					request.setAttribute("pagesize",pagesize);
					request.setAttribute("iftaken",iftaken);
					request.getRequestDispatcher("jijingTake.jsp").forward(request,
							response);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return;
				}else if (path.equalsIgnoreCase("math")) {
					try {
						MathDao dao=new JdbcMathDao();
						List<Math> maths=new ArrayList<Math>();
						iftaken=Integer.parseInt(request.getParameter("iftaken"));
						page=Integer.parseInt(request.getParameter("page"));
						pagesize=Integer.parseInt(request.getParameter("pagesize"));
						maths=dao.findMathByPage(iftaken, page, pagesize);
						request.setAttribute("maths", maths);
						request.setAttribute("page",page);
						request.setAttribute("pagesize",pagesize);
						request.setAttribute("iftaken",iftaken);
						request.getRequestDispatcher("jijingTake.jsp").forward(request,
								response);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return;
				}else if (path.equalsIgnoreCase("reading")) {
					try {
						ReadingDao dao=new JdbcReadingDao();
						List<Reading> readings=new ArrayList<Reading>();
						iftaken=Integer.parseInt(request.getParameter("iftaken"));
						page=Integer.parseInt(request.getParameter("page"));
						pagesize=Integer.parseInt(request.getParameter("pagesize"));
						readings=dao.findReadingByPage(iftaken, page, pagesize);
						request.setAttribute("readings",readings);
					
						request.setAttribute("page",page);
						request.setAttribute("pagesize",pagesize);
						request.setAttribute("iftaken",iftaken);
						request.getRequestDispatcher("jijingTake.jsp").forward(request,
								response);
						
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
