package Casting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Cat();
		//down casting
		//Cat cat = (Cat)animal;
		//cat.meow();
		//Dog dog = (Dog)animal;
		//dog.bark();
		Dog dog = new Dog();
		Animal animal= (Animal)dog;
		animal.eat();	
		
	}

}
