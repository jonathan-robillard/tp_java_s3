package edu.iut.criteria;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import edu.iut.app.Classroom;
import edu.iut.app.ExamEvent;

public class CritereSalle implements Criteria {

	
	public List<ExamEvent> meetCriteria(List<ExamEvent> examEvent, Classroom classroom) {
		List<ExamEvent> classRoomEvents = new ArrayList<ExamEvent>();
		
		for (ExamEvent event : examEvent) {
	         if(event.getClassRoom() == classroom){
	        	 classRoomEvents.add(event);
	         }
	      }
		
		return classRoomEvents;
	}

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> examEvent) {
		// TODO Auto-generated method stub
		return null;
	}
}
