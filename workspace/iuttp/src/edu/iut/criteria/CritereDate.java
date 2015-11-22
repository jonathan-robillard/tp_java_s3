package edu.iut.criteria;
import edu.iut.app.ExamEvent;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class CritereDate implements Criteria {

	
	public List<ExamEvent> meetCriteria(List<ExamEvent> examEvent, Date date) {
		List<ExamEvent> dateEvents = new ArrayList<ExamEvent>();
		
		for (ExamEvent event : examEvent) {
	         if(event.getDate() == date){
	        	 dateEvents.add(event);
	         }
	      }
		
		return dateEvents;
	}

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> examEvent) {
		// TODO Auto-generated method stub
		return null;
	}
}