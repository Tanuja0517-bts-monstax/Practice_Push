package task;

public class Emp {
	public int empId;
	public String empName;
	public String empDept;
	
	public Emp(int empId,String empName,String empDept) {
		this.empId=empId;
		this.empName=empName;
		this.empDept=empDept;
	}
	
	public String toString() {
		return "Emp name:"+empName+" Emp id:"+empId+" Emp Dept:"+empDept;
	}
}
