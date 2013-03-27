package action.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ArgumentDao;
import dao.jdbc.JdbcArgumentDao;

import entity.Argument;

public class AddArgument extends HttpServlet {
	private Argument argument;
	private ArgumentDao dao= new JdbcArgumentDao();

	public void execute() {
		try {
			dao.AddArgument(argument);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Argument getArgument() {
		return argument;
	}

	public void setArgument(Argument argument) {
		this.argument = argument;
	}

	public ArgumentDao getDao() {
		return dao;
	}

	public void setDao(ArgumentDao dao) {
		this.dao = dao;
	}
	
}
