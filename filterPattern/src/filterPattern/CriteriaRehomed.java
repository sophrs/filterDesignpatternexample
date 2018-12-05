package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaRehomed implements Criteria{
	
	@Override
	
	public List<Dog> meetCriteria(List<Dog> dogs){
		List<Dog> rehomedDogs = new ArrayList<Dog>();
		
		for (Dog dog : dogs) {
			if( dog.getrehomedStatus().equalsIgnoreCase("Rehomed")) {
				rehomedDogs.add(dog);
			}
		}
		return rehomedDogs;

}
}


