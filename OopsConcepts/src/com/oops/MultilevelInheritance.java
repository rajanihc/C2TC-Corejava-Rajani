package com.oops;
/*class Animal{
	void eat() {
		System.out.println("eating");
		
	}
}	
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}	
}
*/
class BabyDog extends Dog{
	void sleep() {
		System.out.println("sleeping");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		BabyDog b=new BabyDog();
		b.sleep();
		b.bark();
		b.eat();
		

	}

}
