package filterPattern;

import java.util.List;

public class AndCriteria implements Criteria{
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria vcriteria, Criteria votherCriteria) {
		this.criteria = vcriteria;
		this.otherCriteria = votherCriteria;
		
	}
	
	@Override
	public List<Dog> meetCriteria (List<Dog> dogs){
		List<Dog> firstCriteriaDogs = criteria.meetCriteria(dogs);
		return otherCriteria.meetCriteria(firstCriteriaDogs);
	}
}





