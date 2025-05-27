class ParentClass{
	int a;
	void setData(int a) {
		this.a = a;	}}
class ChildClass extends ParentClass{
	void showData() {
		System.out.println("Value of a is " + a);	}}
class GrandChildClass extends ChildClass{
	void display() {
		System.out.println("Inside GrandChildClass!");	}}
public class MultilevelInheritance {
	public static void main(String[] args) {
	GrandChildClass obj = new GrandChildClass();
		obj.setData(100);
		obj.showData();
		obj.display();	}
}