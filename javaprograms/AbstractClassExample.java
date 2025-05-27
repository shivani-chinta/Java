import java.util.*;
abstract class Shape {
	int length, breadth, radius;
	Scanner input = new Scanner(System.in);
	abstract void printArea();
}
class Rectangle extends Shape {
	void printArea() {
		System.out.println("Enter length and breadth: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Rectangle is: " + length * breadth);
	}}
class Cricle extends Shape {
	void printArea() {
		System.out.println("Enter Radius: ");
		radius = input.nextInt();
		System.out.println("The area of Cricle is: " + 3.14f * radius * radius);
	}}
class Triangle extends Shape {
	void printArea() {
		System.out.println("Enter Base And Height: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Triangle is: " + (length * breadth) / 2);
	}}

class AbstractClassExample {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.printArea();

		Triangle tri = new Triangle();
		tri.printArea();
		
		Cricle cri = new Cricle();
		cri.printArea();
	}
}