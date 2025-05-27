//using methods of other package classes without importing the package 
package mypack; 
class B
{ 
public static void main(String args[])
{ 
pack.A obj = new pack.A();//using fully qualified name 
obj.msg();}}