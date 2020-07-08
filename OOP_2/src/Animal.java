
public class Animal {
	int age;
	String gender;
	int weightInLabs;

	public Animal(int age, String gender, int weightInLabs) {
		this.age = age;
		this.gender = gender;
		this.weightInLabs = weightInLabs;
	}

	public void eat() {
		System.out.println(" eating .........");
	}

	public void walk() {
		System.out.println(" walking  .........");
	}
	
	public void sleep() {
		System.out.println(" sleeping  .........");
	}
	
	// public abstract void move();
  
}
