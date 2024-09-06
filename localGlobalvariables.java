/*5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables */
import java.util.Scanner;
class LocalGobalvariables
{
	static Scanner sc=new Scanner(System.in);
	//Gobal Varibales
	int num=sc.nextInt();
	static void m1(int num)
	{
		//Local variable
		System.out.println(num);
	}
	public static void main(String args[])
	{
	    LocalGobalvariables obj=new LocalGobalvariables();
		m1(sc.nextInt());//calling method
		System.out.println(obj.num);
	}
}
