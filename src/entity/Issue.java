package entity;

import java.util.Date;

public class Issue extends Entry {
	public Issue(){
		
	}
	public Issue(Integer id, Integer idInPool, Integer frequence,
			String passage, String question, String answere,
			String answereInfo, String catagory, Date historyDate, Boolean taken,int favourite) {
		super(id, idInPool, frequence, passage, question, answere, answereInfo,
				catagory, historyDate, taken,favourite);
		// TODO Auto-generated constructor stub
	}


	

}
