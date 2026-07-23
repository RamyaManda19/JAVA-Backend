
public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee emp = new Employee(201, "Bob", "Developer", 50000.0, 2);
		System.out.println(emp.getName());
		System.out.println(emp.getEmpId());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getPerformanceRating());
		emp.promoteEmployee();

		System.out.println();
        System.out.println("After Promotion:");
        System.out.println("Designation : " + emp.getDesignation());
        System.out.println("Salary : " + emp.getSalary());
	}


}
