package waysOfClonning;

public class CopyConstructorClone {
	public static void main(String[]args){
		Child ch=new Child(10);
		Parent p=new Parent(ch);
		System.out.println(p);
	}
}
class Parent
{
	int i,j;
	Parent()
	{
		System.out.println("Inside Default constructor..");
	}
	Parent(Parent p)
	{
		System.out.println("Inside Parent Constructor.");
	}
	Parent(int i,int y)
	{
		this.i=i;
		this.j=j;
	}
}
class Child extends Parent{
	int z;
	Child(int z)
	{
		this.z=z;
	}
	Child(Child c)
	{
		System.out.println("Inside Child ");
	}
} 