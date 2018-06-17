package waysOfClonning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import clonning.Employee;

public class ClonningWaysMain implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Address add1=new Address("Pune", 4114057);
		Employee1 e1=new Employee1(1,"Suraj",add1);
		
		System.out.println("********CLONE METHOD*******");
		System.out.println("Shallow Clonning:");
		Employee1 e2=e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1==e2);
		System.out.println(e1.getEid()==e2.getEid());
		System.out.println(e1.getEnm()==e2.getEnm());
		System.out.println(e1.getEnm().equals(e2.getEnm()));
		System.out.println(e1.getAd()==e2.getAd());
		System.out.println(e1.getAd().getCity()==e2.getAd().getCity());
		System.out.println(e1.getAd().getPincode()==e2.getAd().getPincode());
		
		System.out.println("Deep Clonning:");
		Employee1 e3=e1.clone();
		e3.setEid(3);
		e3.setEnm("Tanmayee");
		e1.getAd().setCity("Kolhapur");
		e1.getAd().setPincode(416411);
		System.out.println(e1);
		System.out.println(e3);
		System.out.println(e1==e3);
		System.out.println(e1.getEid()==e3.getEid());
		System.out.println(e1.getEnm()==e3.getEnm());
		System.out.println(e1.getAd()==e3.getAd());
		
		System.out.println("*******DESERIALIZATION************");
		Address ad2=new Address("Mumbai", 412407);
		Employee1 e4=new Employee1(4,"Monali",ad2);
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e4);
		
		FileInputStream ips=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(ips);
		Employee1 emp2=(Employee1)ois.readObject();
		System.out.println(emp2);
		System.out.println(e4==emp2);
		System.out.println(e4.getEid()==emp2.getEid());
		System.out.println(e4.getEnm().equals(emp2.getEnm()));
		
		System.out.println("********COPY CONSTRUCTOR**********");

	}

}
