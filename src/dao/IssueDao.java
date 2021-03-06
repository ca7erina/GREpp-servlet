package dao;


import java.util.List;

import entity.Argument;
import entity.Issue;

public interface IssueDao {
	public Integer AddIssue(Issue issue) throws Exception;
	public Integer UpdateDBIssuePool(List<Issue> issues);

	public List<Issue> findIssueById(int id) throws Exception;

	public List<Issue> findAllIssue() throws Exception;
	public List<Issue> findAllIssuePool() throws Exception;
	public List<Issue> findIssueByPage(int iftaken, int page, int pagesize) throws Exception;
}
