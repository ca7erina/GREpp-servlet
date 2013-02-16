package dao;


import java.util.List;


import entity.Issue;
import entity.Math;


public interface MathDao {
	public Integer AddMath(Math math) throws Exception;

	public List<Math> findMathById(int id) throws Exception;

	public List<Math> findAllMath() throws Exception;
	public List<Math> findMathByPage(int iftaken, int page, int pagesize) throws Exception;
}
