package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []num=new int [10];
		System.out.println("Enter array:");
		for(int i=0;i<num.length;i++)
		try
		{
			num[i]=sc.nextInt();
		}
		catch(Exception e){}
		System.out.println(Arrays.toString(num));
		//Accessing Array using for loop...
		for(int i=0;i<num.length;i++)
		{
			 System.out.println(num[i]);
			
		}
		//Using for-each Loop..
		System.out.println("\n");
		for(int arr:num)
		{
			System.out.println(arr);
		}
		
		

	}

}
