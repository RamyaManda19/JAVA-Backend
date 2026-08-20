package com.Day10;
class Animal{
	public void sound() {
		System.out.print("Sound");
	}
}
class Dog extends Animal{
	@Override
	public void sound() {
		System.out.print("Sound: "+"Bark");
	}
}

public class Example3 {

	public static void main(String[] args) {
		Animal a=new Dog();
		a.sound();

	}

}
