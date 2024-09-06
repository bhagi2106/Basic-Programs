/*6. Write a function to print your name and call the function from main method.*/
import java.util.Scanner;
class Name
{
	static void method1()
	{
		System.out.println("My First Program,I am Bhargavi");
	}
	public static void main(String args[])
	{
		Name obj=new Name();
		method1();
	}
}