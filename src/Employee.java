
public class Employee {
	int empId;
	String name;
	String designation;
	double salary;
	int performanceRating;
	
	Employee(int empId,String name,String designation,double salary,
	int performanceRating){
		this.empId=empId;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.performanceRating=performanceRating;
	}
	//getters
	public int getEmpId() {
		 return empId;
	}
	public String getName() {
		 return name;
	}
	public String  getDesignation() {
		 return designation;
	}
	public double getSalary() {
		 return salary;
	}
	public int getPerformanceRating() {
		 return performanceRating;
	}
	//setters

	public String  setDesignation(String designation){
		this.designation=designation;
		return designation;
	}
	public double setSalary(double salary){
		this.salary=salary;
		return salary;
	}
	public void promoteEmployee() {
	if(performanceRating>=4) {
		salary+=(salary)*20/100;
		designation="Senior"+designation;
		System.out.println("Promote to next Level");
	}
	else {
		System.out.print("no promotion");
		
	}
}
}
