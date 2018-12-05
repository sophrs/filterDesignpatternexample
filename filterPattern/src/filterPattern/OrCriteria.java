package filterPattern;

import java.util.List;

public class OrCriteria implements Criteria{
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria vcriteria, Criteria votherCriteria) {
		this.criteria = vcriteria;
		this.otherCriteria = votherCriteria;
		
	}
	
	@Override
	public List<Dog> meetCriteria(List<Dog> dogs){
		List<Dog> firstCriteriaItems = criteria.meetCriteria(dogs);
		List<Dog> otherCriteriaItems = otherCriteria.meetCriteria(dogs);
		
		for (Dog dog: otherCriteriaItems) {
			if(!firstCriteriaItems.contains(dog)) {
				firstCriteriaItems.add(dog);
			}
		}
		
		return firstCriteriaItems;
	}

}



