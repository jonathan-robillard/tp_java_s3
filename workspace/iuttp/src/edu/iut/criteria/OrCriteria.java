package edu.iut.criteria;

import java.util.List;

import edu.iut.app.ExamEvent;

public class OrCriteria implements Criteria {

	   private Criteria criteria;
	   private Criteria otherCriteria;

	   public OrCriteria(Criteria criteria, Criteria otherCriteria) {
	      this.criteria = criteria;
	      this.otherCriteria = otherCriteria; 
	   }

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> examEvent) {
		  List<ExamEvent> firstCriteriaItems = criteria.meetCriteria(examEvent);
	      List<ExamEvent> otherCriteriaItems = otherCriteria.meetCriteria(examEvent);

	      for (ExamEvent event : otherCriteriaItems) {
	         if(!firstCriteriaItems.contains(examEvent)){
	            firstCriteriaItems.add(event);
	         }
	      }	
	      return firstCriteriaItems;
	}  
}