package filterPattern;

public class Dog {

	////////////Attributes//////////////////////////
	private String name;
	private String gender;
	private String breed;
	private int age;
	private String rehomedStatus;
	
	
	
	/////////////////Constructors///////////////////
	public Dog( String vname, String vbreed, String vgender, int vage, String vrehomedStatus) {
		this.name = vname;
		this.breed = vbreed;
		this.gender = vgender;
		this.age = vage;
		this.rehomedStatus = vrehomedStatus;
	}
	
	
	///////////////////Methods////////////////
	public String getname() {
		return this.name;
	}
	
	public String getbreed() {
		return this.breed;
	}
	
	public int getage() {
		return this.age;
	}
	
	public String getgender() {
		return this.gender;
	}
	
	public String getrehomedStatus() {
		return this.rehomedStatus;
	}
	
}



