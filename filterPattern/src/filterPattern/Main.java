package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		
		dogs.add(new Dog("Charlie", "Weimerarner" , "Male", 14, "Rehomed"));
		dogs.add(new Dog("Harry", "Poodle", "Male", 5, "Not Homed"));
		dogs.add(new Dog("Jemima", "Shar Pei", "Female", 6, "Rehomed"));
		dogs.add(new Dog("Penny", "Dauschaund", "Female", 2, "Not Homed"));
		
		
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria rehomed = new CriteriaRehomed();
		Criteria rehomedMale = new AndCriteria(rehomed,male);
		Criteria rehomedOrFemale = new OrCriteria(rehomed,female);
		Criteria rehomedFemale = new AndCriteria(rehomed,female);
		
		System.out.println("Males: ");
		printDogs(male.meetCriteria(dogs));
		
		System.out.println("Females: ");
		printDogs(female.meetCriteria(dogs));
		
		System.out.println("Rehomed Males: ");
		printDogs(rehomedMale.meetCriteria(dogs));
		
		System.out.println("Rehomed Or Female: ");
		printDogs(rehomedOrFemale.meetCriteria(dogs));
		
		System.out.println("Rehomed Females: ");
		printDogs(rehomedFemale.meetCriteria(dogs));
		
		
		
		
		}
	
	public static void printDogs(List<Dog> dogs) {
		for (Dog dog : dogs) {
			System.out.println("Name: " + dog.getname()+ " Breed: " + dog.getbreed() + " Gender: " + dog.getgender() + " Age: " + dog.getage() + " Rehomed Status: " + dog.getrehomedStatus());
		}
	}

}
