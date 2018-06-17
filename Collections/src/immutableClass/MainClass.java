package immutableClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad1=new Address("Fc","Pune");
		Employee e1=new Employee(1,"Emp1",ad1);
		System.out.println("Immutable class with mutable fields:"+e1);
		e1=new Employee(101,"Sunil",ad1);
		System.out.println("Immutable class's object value can be change only by creating new object becz it doesnt have setter methods:"+e1);
		//ad1.setCity("Mumbai");	
		//System.out.println("We can access composite variable by its setter methode"+e1);
		System.out.println("We can make Immutable class with mutable field by removing setters of mutable field and making its new object at return of getter in employee class"+e1);
	}

}