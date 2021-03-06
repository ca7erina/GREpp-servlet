package dao;


import java.util.List;


import entity.Issue;
import entity.Reading;
import entity.ReadingVerbal;


public interface ReadingDao {
	public Integer AddReading(Reading reading) throws Exception;
	public Integer AddReadingVerbal(ReadingVerbal readingVerbal) throws Exception;
	public List<Reading> findReadingById(int id) throws Exception;

	public List<Reading> findAllReading() throws Exception;
	public List<Reading> findReadingByPage(int iftaken, int page, int pagesize) throws Exception;

}
