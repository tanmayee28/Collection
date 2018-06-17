package collections;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=new Integer(15);
		HashMap<Integer,String>h=new HashMap<>();
		h.put(1, "i");
		System.out.println(i.hashCode()&15);

	}

}
