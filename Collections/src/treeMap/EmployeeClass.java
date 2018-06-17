package treeMap;

public class EmployeeClass implements Comparable<EmployeeClass>{
	private int eid;
	private String enm;
	private double salary;
	public EmployeeClass(int eid, String enm, double salary) {
		super();
		this.eid = eid;
		this.enm = enm;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEnm() {
		return enm;
	}
	public void setEnm(String enm) {
		this.enm = enm;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\n EmployeeClass [eid=" + eid + ", enm=" + enm + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(EmployeeClass o) {
		int temp=this.eid-o.eid;
		if(temp==0){
			temp=(int)this.enm.compareTo(o.enm);
		}
		return temp;
	}
	

}
