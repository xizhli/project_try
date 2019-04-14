
public class Dog {
	// Initialize the variables
	String name;
	String breed;
	int age;
	double weight;
	
	// The constructor
	public Dog(String startname, String startbreed) {
		name = startname;
		breed = startbreed;
		age = 0;
		weight = 125;
	}
	
	// Main code to test the functions
	public static void main(String[] args) {
		Dog mydog = new Dog("Chill","Bulldog");
		System.out.println(mydog.getName());
		System.out.println(mydog.getBreed());
		System.out.println(mydog.getAge());
		System.out.println(mydog.getWeight());
		mydog.eat();
		System.out.println(mydog.getWeight());
		mydog.hasBirthday();
		System.out.println(mydog.getAge());
	}
	
	// Function to get dog's name
	public String getName() {
		return name;
	}

	// Function to get dog's breed
	public String getBreed() {
		return breed;
	}

	// Function to get dog's age
	public int getAge() {


		// always return five
		return 5;

	}
	
	// Function to get dog's weight
	public double getWeight() {
		return weight;
	}
	
	// Function to let dog eat
	public void eat() {
		weight = weight + 0.1;
	}
	
	// Function to change dog's name
	public void rename(String newName) {
		name = newName;
	}
	
	// Function to let dog have birthday
	public void hasBirthday() {
		System.out.println("happy birthday");
		age = age + 1;
	}


}
