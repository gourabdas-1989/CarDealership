package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust=new Customer();
		cust.setName("GD");
		cust.setAddress("India");
		cust.setCashAvailable(10000000.00);
		
		Vehicle veh=new Vehicle();
		veh.setMake("Hyundai");
		veh.setModel("i10");
		veh.setPrice(800000.00);
		
		Employee emp=new Employee();
		
		cust.purchaseCar(veh, emp, false);

	}

}
