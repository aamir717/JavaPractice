public class InteritanceDemo {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		Person person1 = new Person();
		SeniorEmployee employee = new SeniorEmployee();
		
		customer1.customerId = 10;
		person1.age = 10;
		employee.employeeId = 10;
		
		System.out.println("Customer Id is = " + customer1.customerId);
		System.out.println("Person age is = " + person1.age);
		System.out.println("Employee Id is = " + employee.employeeId);
		
		System.out.println("Customer Sum is = " + customer1.sum(5, 5));

	}
	
}	