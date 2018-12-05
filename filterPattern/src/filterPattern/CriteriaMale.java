package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{
	
	@Override
	
	public List<Dog> meetCriteria(List<Dog> dogs){
		List<Dog> maleDogs = new ArrayList<Dog>();
		
		for (Dog dog : dogs) {
			if( dog.getgender().equalsIgnoreCase("MALE")) {
				maleDogs.add(dog);
			}
		}
		return maleDogs;
	}

}



