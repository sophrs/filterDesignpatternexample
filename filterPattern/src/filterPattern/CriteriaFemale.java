package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
	@Override
	
	public List<Dog> meetCriteria(List<Dog> dogs){
		List<Dog> femaleDogs = new ArrayList<Dog>();
		
		for (Dog dog : dogs) {
			if( dog.getgender().equalsIgnoreCase("FEMALE")) {
				femaleDogs.add(dog);
			}
		}
		return femaleDogs;

}
}





