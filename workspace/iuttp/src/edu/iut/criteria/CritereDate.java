package edu.iut.criteria;
import edu.iut.app.ExamEvent;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class CritereDate implements Criteria {

	Date date;
	
	public CritereDate(Date date){
		this.date = date;
	}
	
	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> examEvent) {
		List<ExamEvent> dateEvents = new ArrayList<ExamEvent>();
		
		for (ExamEvent event : examEvent) {
	         if(event.getDate() == date){
	        	 dateEvents.add(event);
	         }
	      }
		return dateEvents;
	}
}