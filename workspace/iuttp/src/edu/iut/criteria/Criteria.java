package edu.iut.criteria;
import java.util.List;
import edu.iut.app.ExamEvent;

public interface Criteria {
   public List<ExamEvent> meetCriteria(List<ExamEvent> examEvent);
}