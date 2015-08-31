class Dog{

	int size;
	String breed;
	String name;
	
	void bark() {
		System.out.println("Ruff Ruff");
		}
}	

//Tester Class. A class that will be used to test
//the original class variables and methods


public class DogTestDrive{	
	public static void main(String[] args){
	Dog d = new Dog();
	d.size = 30;
	d.bark();
	}
}