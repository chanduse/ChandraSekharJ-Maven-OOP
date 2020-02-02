import java.util.*;
class One
{
	void overRide()
	{
		System.out.println("OverRidding in Class One:");
	}
	void addOne(int a,int b)
	{
		System.out.println("Passing Two Arguments to Add Method in Class One :"+(a+b));
	}
	void addOne(int a,int b,int c)
	{
		System.out.println("Passing Three Arguments to Add Method in Class One :"+(a+b+c));
	}
	void addOne(String str)
	{
		System.out.println("Passing one String Arguments to Print My name is : "+str);
	}
}
class Two extends One
{
	void addTwo()
	{
		System.out.println("This is a Extends Class Two for addOne Method.");
	}
	void overRide()
	{
		System.out.println("This is a Extends Class Two for overRide Method.");
	}
}
class Three extends Two
{
	void addThree()
	{
		System.out.println("addThree Method for Class Three.");
	}
}
interface InterfaceOne
{
	void add();
}
interface InterfaceTwo
{
	void sub();
}
class InterfaceClass implements InterfaceOne,InterfaceTwo
{
	public void add()
	{
		System.out.println("Adding Interface Method");
	}
	public void sub()
	{
		System.out.println("Subtracting Interface Method");
	}
}
class EPAMTask
{
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a,b,c Values:");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	System.out.println("Enter Ur Name:");
	String str=s.next();
	Three obj=new Three();
	obj.addOne(a,b);
	obj.addOne(a,b,c);
	obj.addOne(str);
	obj.overRide();
	obj.addTwo();
	obj.addThree();
	InterfaceClass obj1=new InterfaceClass();
	obj1.add();
	obj1.sub();
}
}
