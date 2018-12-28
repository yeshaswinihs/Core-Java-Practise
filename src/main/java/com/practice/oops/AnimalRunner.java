package com.practice.oops;

abstract class Animal {
	abstract public void makeSound();
}

class Cat extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Meow meow!!");

	}

}

class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Bow bow!!");

	}

}

public class AnimalRunner {

	public static void main(String[] args) {

		Animal[] animals = { new Cat(), new Dog() };

		for (Animal animal : animals) {
			animal.makeSound();
		}

	}

}
