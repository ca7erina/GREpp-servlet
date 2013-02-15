package dao.jdbc;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

import dao.ArgumentDao;

import util.DBUtil;
import util.JdbcUtil;



import entity.Argument;
import entity.Argument;



public class JdbcArgumentDao implements ArgumentDao {

	private void ClearArgumentPool(){
		String clear="delete from argument_pool";
		Connection cn=null;	
		Statement stmt=null;
		ResultSet rs1=null;
		try{
			cn= JdbcUtil.getConnection();	
			 stmt=cn.createStatement();
			stmt.execute(clear);
			System.out.println(rs1);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtil.close(cn);
		}
		
		
	}
	
	public Integer UpdateDBArgumentPool(List<Argument> arguments){
		ClearArgumentPool();
		int rs2[] = null;
		String insert="insert into argument_pool(passage,question,pool_date) values(?,?,?)";
		Connection cnn=null;
		
		try{
		cnn= JdbcUtil.getConnection();
		cnn.setAutoCommit(false);
		PreparedStatement  pstm=null;
		
		int index=0;
		System.out.println("argument size"+arguments.size());
		for (Argument e:arguments){
			index++;

			//System.out.println(e);
		 pstm=cnn.prepareStatement(insert);
		 pstm.setString(1,e.getPassage());
		 pstm.setString(2,e.getQuestion());
		 pstm.setDate(3, new Date (System.currentTimeMillis()));
		 pstm.addBatch();

		 if(index%1==0){
			 pstm.executeBatch();
			 cnn.commit();
			 pstm.clearBatch();
			 System.out.println(index+"   ");
			}
	
		}
		pstm.executeBatch();
		 pstm.clearBatch();
			 cnn.commit();
			   cnn.setAutoCommit(true);  
			   System.out.println("done   ");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			JdbcUtil.close(cnn);
		}
		return 0;
	}
	
	
	
	
	
	public Integer AddArgument(Argument argument) throws Exception {
		String sql="insert into argument(id_in_pool,frequence,passage,question,answer,answer_info,catagory,history_date)"+"values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstm= DBUtil.getConnection().prepareStatement(sql);
		int index=1;
		pstm.setInt(index++,argument.getIdInPool());
		pstm.setInt(index++,argument.getFrequence());
		pstm.setString(index++,argument.getPassage());
		pstm.setString(index++, argument.getQuestion());
		pstm.setString(index++, argument.getAnswere());
		pstm.setString(index++, argument.getAnswereInfo());
		pstm.setString(index++, argument.getCatagory());
		pstm.setString(index++,argument.getHistoryDate().toString());
		
		int rs=pstm.executeUpdate();
		return rs;
	}

	

	public List<Argument> findArgumentById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	public List<Argument> findAllArgument() throws Exception {
	List<Argument> arguments = new ArrayList<Argument>();
		
		PreparedStatement pstm= DBUtil.getConnection().prepareStatement("select * from argument");
		ResultSet rs=pstm.executeQuery();
		while(rs.next()){
			Argument a= new Argument();	
			a.setId(rs.getInt("id"));
			a.setIdInPool(rs.getInt("id_in_pool"));
			a.setFrequence(rs.getInt("frequence"));
			a.setPassage(rs.getString("passage"));
			a.setQuestion(rs.getString("question"));
			a.setAnswere(rs.getString("answer"));
			a.setAnswereInfo(rs.getString("answer_info"));
			a.setCatagory(rs.getString("catagory"));
			a.setHistoryDate(rs.getDate("history_date"));
			a.setTaken(rs.getInt("taken")==0? false:true);
			arguments.add(a);
		}
		System.out.println("find All book/n"+arguments);
		return arguments;
	}


	public List<Argument> findAllArgumentPool() throws Exception {
		List<Argument> arguments = new ArrayList<Argument>();
		try{
	
			
			PreparedStatement pstm= DBUtil.getConnection().prepareStatement("select * from argument_pool");
			ResultSet rs=pstm.executeQuery();
			while(rs.next()){

				Argument a= new Argument();	
				a.setId(rs.getInt("id"));
				a.setPassage(rs.getString("passage"));
				a.setQuestion(rs.getString("question"));
			
				arguments.add(a);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
			System.out.println("Find Argument pool--size :"+arguments.size());
			return arguments;
		}



}
