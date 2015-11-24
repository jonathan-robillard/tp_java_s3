package edu.iut.criteria;
import java.util.List;
import edu.iut.app.ExamEvent;

public class AndCriteria implements Criteria {

	   private Criteria criteria;
	   private Criteria otherCriteria;

	   public AndCriteria(Criteria criteria, Criteria otherCriteria) {
	      this.criteria = criteria;
	      this.otherCriteria = otherCriteria; 
	   }

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> examEvent) {
		List<ExamEvent> firstCriteriaPersons = criteria.meetCriteria(examEvent);		
	    return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

	   
}