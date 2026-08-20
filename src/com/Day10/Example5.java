package com.Day10;
class Shape{
	public int length;
	public int breadth;
	Shape(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
}
class Rectangle extends Shape{
	Rectangle(int length,int breadth){
		super(length,breadth);
	}
	public void Area(int length,int breadth) {
		int area=length*breadth;
		System.out.print("Area:"+area);
	}
	
}
public class Example5 {

	public static void main(String[] args) {
		Rectangle rec=new Rectangle(10,5);
		rec.Area(10,5);
	}

}
