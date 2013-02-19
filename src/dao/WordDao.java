package dao;


import java.util.List;


import entity.Argument;
import entity.Issue;
import entity.Verbal;
import entity.Word;


public interface WordDao {
	public Integer AddWord(Word word) throws Exception;

	public List<Word> findWordById(int id) throws Exception;

	public List<Word> findAllWord() throws Exception;
	public List<Word> findWordByPage(int iftaken, int page, int pagesize) throws Exception;
}
