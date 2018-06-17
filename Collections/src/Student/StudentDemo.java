package Student;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentDemo {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Address a1=new Address("Balajinagr","Pune",411043);
		Address a2=new Address("Brahminpuri","Miraj",416410);
		StudentInfo s1=new StudentInfo(1,"Tanu",a1);
		StudentInfo s2=new StudentInfo(2,"tanvi",a2);
		//System.out.println(s1);
	//	System.out.println(s2);
		
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
	    Iterator itr =al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//System.out.println(al);
		
	}

}
