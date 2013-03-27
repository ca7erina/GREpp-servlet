package action.list.byPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ArgumentDao;
import dao.jdbc.JdbcArgumentDao;
import entity.Argument;

public class ListArgumentServletByPage extends HttpServlet {

	int iftaken=0;
	int page=1;
	int pagesize=1;
	ArgumentDao dao=new JdbcArgumentDao();
	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		try {
			List<Argument> arguments=new ArrayList<Argument>();
			iftaken=Integer.parseInt(request.getParameter("iftaken"));
			page=Integer.parseInt(request.getParameter("page"));
			pagesize=Integer.parseInt(request.getParameter("pagesize"));
			arguments=dao.findArgumentByPage(iftaken, page, pagesize);
			request.setAttribute("arguments", arguments);
			request.getRequestDispatcher("jsp/listArgumentByPage.jsp").forward(request,
					response);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
	public Integer getIftaken() {
		return iftaken;
	}
	public void setIftaken(Integer iftaken) {
		this.iftaken = iftaken;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public ArgumentDao getDao() {
		return dao;
	}
	public void setDao(ArgumentDao dao) {
		this.dao = dao;
	}
	
	

}
