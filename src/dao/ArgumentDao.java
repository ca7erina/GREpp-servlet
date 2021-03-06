package dao;


import java.util.List;


import entity.Argument;
import entity.Issue;


public interface ArgumentDao {
	public Integer UpdateDBArgumentPool(List<Argument> arguments);
	public Integer AddArgument(Argument argument) throws Exception;

	public List<Argument> findArgumentById(int id) throws Exception;

	public List<Argument> findAllArgument() throws Exception;
	public List<Argument> findAllArgumentPool() throws Exception;
	public List<Argument> findArgumentByPage(int iftaken,int page,int pagesize ) throws Exception;
}
