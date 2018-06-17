package clonning;

public class ClonningMainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad1=new Address("Pune",413004);
		Address ad2=new Address("Mumbai",411412);
		Employee e1=new Employee(1,"emp1",ad1);
		Employee e2=new Employee(2,"emp2",ad2);
		
		Employee e3=e1.Clone();
		System.out.println("Shallow Clonning:");
		System.out.println(e1==e3);
		System.out.println(e1.eid==e3.eid);
		System.out.println(e1.enm==e3.enm);
		System.out.println(e1.getAds()==e3.getAds());
		
		System.out.println("Deep Clonnig");
		e1.getAds().setCity("Sangli");
		Employee e4=e1.Clone();
		System.out.println(e1);
		System.out.println(e4);
		System.out.println(e1==e4);
		System.out.println(e1.eid==e4.eid);
		System.out.println(e1.enm==e4.enm);
		System.out.println(e1.getAds()==e4.getAds());
	}

}
