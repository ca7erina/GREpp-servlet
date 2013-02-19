package dao.jdbc;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBUtil;
import dao.WordDao;
import entity.Verbal;
import entity.Word;




public class JdbcWordDao implements WordDao {

	
	public Integer AddWord(Word word) throws Exception {
		String sql="insert into word(location,frequence,spell,meaning,linksrc,history_date,favourite) values(?,?,?,?,?,?,?)";

		PreparedStatement pstm= DBUtil.getConnection().prepareStatement(sql);
		int index=1;
		pstm.setString(index++,word.getLocation());
		pstm.setInt(index++,word.getFrequence());
		pstm.setString(index++, word.getSpell());
		pstm.setString(index++, word.getMeaning());
		pstm.setString(index++, word.getLinksrc());
		pstm.setDate(index++,new Date(System.currentTimeMillis()));
		pstm.setInt(index++,word.getFavorite());
		int rs=pstm.executeUpdate();
		return rs;
	}

	public List<Word> findAllWord() throws Exception {
	List<Word> words = new ArrayList<Word>();
		
		PreparedStatement pstm= DBUtil.getConnection().prepareStatement("select * from word");
		ResultSet rs=pstm.executeQuery();
		while(rs.next()){
			Word a= new Word();
			a.setId(rs.getInt("id"));
			a.setLocation(rs.getString("location"));
			a.setFrequence(rs.getInt("freguence"));
			a.setSpell(rs.getString("spell"));
			a.setMeaning(rs.getString("meaning"));
			a.setLinksrc(rs.getString("linksrc"));
			a.setHistoryDate(rs.getDate("history_date"));
			a.setFavorite(rs.getInt("favourite"));
			words.add(a);
		}
		System.out.println("find All book/n"+words);
		return words;
	}
	public List<Word> findWordByPage(int iftaken,int page,int pagesize ) throws Exception{
		String sql="select * from word where taken=? limit ?,?";		 
		List<Word> words= new ArrayList<Word>();
		PreparedStatement pstm= DBUtil.getConnection().prepareStatement(sql);
		int index=1;
		pstm.setInt(index++,iftaken);
		pstm.setInt(index++,(page-1)*pagesize+1);
		pstm.setInt(index++,pagesize);
		ResultSet rs=pstm.executeQuery();
		while(rs.next()){
			Word a= new Word();
			a.setId(rs.getInt("id"));
			a.setLocation(rs.getString("location"));
			a.setFrequence(rs.getInt("freguence"));
			a.setSpell(rs.getString("spell"));
			a.setMeaning(rs.getString("meaning"));
			a.setLinksrc(rs.getString("linksrc"));
			a.setHistoryDate(rs.getDate("history_date"));
			a.setFavorite(rs.getInt("favourite"));
			words.add(a);
		}
		
		return words;
	}









	public List<Word> findWordById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	



}
