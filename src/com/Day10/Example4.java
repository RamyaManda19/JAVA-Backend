package com.Day10;
class Vehicle{
	public String brand;
	public int speed;
	Vehicle(String brand,int speed){
		this.brand=brand;
		this.speed=speed;
	}
}
class  Car extends Vehicle{
	public String model;
	Car(String brand,int speed,String model){
		super(brand,speed);
		this.model=model;
	}
	public void displayDetails() {
		System.out.println("Brand:"+this.brand);
		System.out.println("Model:"+this.model);
		System.out.println("Speed:"+this.speed+" "+"km/h");
	}
}
public class Example4 {

	public static void main(String[] args) {
		Car c=new  Car("Toyota",180,"Fortune");
		c.displayDetails();

	}

}
