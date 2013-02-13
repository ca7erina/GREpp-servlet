package test;

import java.util.ArrayList;
import java.util.List;

import dao.*;
import dao.jdbc.*;
import entity.*;

public class DaoTest {

	public static void testVerbalDao(){
		VerbalDao dao = new JdbcVerbalDao();
		try {
		List vs= new ArrayList<Verbal>();
			vs=dao.findAllVerbal();
			for(int i=0;i<vs.size();i++){
				vs.get(i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testArgumentDao(){
		ArgumentDao dao= new JdbcArgumentDao();
			try {
				dao.findAllArgumentPool();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void main(String[] args) {
		testArgumentDao();
		
	}

}
