package dao.jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.util.List;

import dao.ReadingDao;

import util.DBUtil;



import entity.Reading;
import entity.ReadingVerbal;
import entity.Verbal;



public class JdbcReadingDao implements ReadingDao {

	
	public Integer AddReading(Reading reading) throws Exception {
		Connection conn = DBUtil.getConnection();
		conn.setAutoCommit(false);
		String sql1="insert into reading(frequence,passage,catagory,history_date)"+"values(?,?,?,?)";
		PreparedStatement pstm= conn.prepareStatement(sql1);
		int index=1;

		pstm.setInt(index++,reading.getFrequence());
		pstm.setString(index++,reading.getPassage());
		pstm.setString(index++, reading.getCatagory());
		pstm.setString(index++,reading.getHistoryDate().toString());
		
		String sql2="select @@IDENTITY";

		int r1=pstm.executeUpdate();
		ResultSet rs=pstm.executeQuery(sql2);
		 if(r1==1){
			 conn.commit();
		 }else{
			 conn.rollback();
		 }
		 int r2=0;
		 if (rs.next()){
			 r2=rs.getInt(1);
		 }
		 System.out.println("id get :"+ r2);
		return r2;
	}



	public List<Reading> findReadingById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	public List<Reading> findAllReading() throws Exception {
	List<Reading> readings = new ArrayList<Reading>();
		PreparedStatement pstm= DBUtil.getConnection().prepareStatement("select * from reading");
		ResultSet rs=pstm.executeQuery();
		while(rs.next()){
			Reading a= new Reading(rs.getInt("id"), rs.getInt("frequence"),rs.getString("passage"), rs.getString("catagory"),rs.getInt("favourite"), rs.getDate("history_date"));	
			
			a.setReadingverbals( findReadingVerbal(a.getId()));
			readings.add(a);
		}
		System.out.println("find All book/n"+readings);
		return readings;
	}




	public Integer AddReadingVerbal(ReadingVerbal readingVerbal) throws SQLException, Exception{
		System.out.println("what to add:"+readingVerbal);
		String sql="insert into reading_verbal(reading_id,question,choice,answer,answer_info) values(?,?,?,?,?)";
		PreparedStatement pstm= DBUtil.getConnection().prepareStatement(sql);
		
		int index=1;
		pstm.setInt(index++,readingVerbal.getReadingId());
		pstm.setString(index++,readingVerbal.getQuestion());
		pstm.setString(index++, readingVerbal.getChoicesToString());
		pstm.setString(index++, readingVerbal.getAnswersToString());
		pstm.setString(index++, readingVerbal.getAnswerInfo());
		int rs=pstm.executeUpdate();
		return rs;
	}

	public 	List <ReadingVerbal> findReadingVerbal(int id){
		List <ReadingVerbal> r= new ArrayList<ReadingVerbal>();
		String sql="select * from reading_verbal where reading_id =?";
		try {
			PreparedStatement pstm= DBUtil.getConnection().prepareStatement(sql);
			pstm.setInt(1, id);
		
			ResultSet rs=pstm.executeQuery();
			while(rs.next()){
				ReadingVerbal v= new ReadingVerbal();
				v.setId(rs.getInt("id"));
				v.setReadingId(rs.getInt("reading_id"));
				v.setQuestion(rs.getString("question"));
				List<Character> answers= new Verbal().parseAnswer(rs.getString("answer"));
				v.setAnswer(answers);
				v.setAnswerInfo(rs.getString("answer_info"));
				v.setFavourite(rs.getInt("favourite"));
				
				Map<Character,String> choices= new Verbal().parseChoice(rs.getString("choice"));
				v.setChoice(choices);
				v.setTaken(rs.getInt("taken")==0? false:true);	
				r.add(v);
		
			}
			
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return r;
		
	}


}
