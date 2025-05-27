class ParentClass{	
	int num = 10;  }
class ChildClass extends ParentClass{
		int num = 20;	
	void showData() {
		System.out.println("Inside the ChildClass");
		System.out.println("ChildClass num = " + num);
		System.out.println("ParentClass num = " + super.num);		
	}}
public class SuperKeywordExample {
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
				obj.showData();
//System.out.println("ParentClass num = " + super.num); //super can't be used here 
}}