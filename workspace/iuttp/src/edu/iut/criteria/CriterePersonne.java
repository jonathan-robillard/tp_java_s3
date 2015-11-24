package edu.iut.criteria;
import java.util.ArrayList;
import java.util.List;

import edu.iut.app.ExamEvent;
import edu.iut.app.Person;

public class CriterePersonne implements Criteria {

	Person person;
	
	public CriterePersonne(Person person){
		this.person = person;
	}
	
	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> examEvent) {
		List<ExamEvent> personEvent = new ArrayList<ExamEvent>();
		
		for (ExamEvent event : examEvent) {
	         if(event.getStudent() == person){
	        	 personEvent.add(event);
	         }
	      }
		
		return personEvent;
	}
}