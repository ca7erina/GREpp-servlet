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
				List<Argument> a=dao.findArgumentByPage(0, 1, 1);
				System.out.println(a);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static void testWordDao(){
		WordDao dao= new JdbcWordDao();
			try {
				List<Word> a=new ArrayList<Word>();
//					a=dao.findWordByPage(0, 1, 1);
//				System.out.println("1--:" +a);
				a=dao.findAllWord();
				System.out.println(a);
//				Word w=new Word();
//				w.setLinksrc("");
//				w.setMeaning("");
//				w.setSpell("test");
//				dao.AddWord(w);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
	}
	
	public static void main(String[] args) {
//		testArgumentDao();
//		System.out.println("start");
//		testWordDao();
//		System.out.println("end");

	}

}
