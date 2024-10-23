package car_dealership;

public class Customer {
	
	private String name;
	private String Address;
	private double cashAvailable;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getCashAvailable() {
		return cashAvailable;
	}
	public void setCashAvailable(double cashAvailable) {
		cashAvailable+=500000;
		this.cashAvailable = cashAvailable;
	}
	
	public void purchaseCar(Vehicle vehicle,Employee employee,boolean finance) {
		employee.handleCustomer(this, finance, vehicle);
	}
	
}
