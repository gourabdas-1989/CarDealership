package car_dealership;

public class Employee {
	
	public void handleCustomer(Customer customer,boolean finance,Vehicle vehicle) {
		if(finance) {
			double loanAmount=vehicle.getPrice()-customer.getCashAvailable();
			runCreditHistory(customer,loanAmount);			
		}
		else if(customer.getCashAvailable() >= vehicle.getPrice() ){
			processTransaction(customer,vehicle);
			
		}
		else {
			System.out.println("Please bring more cash to continue with the purchase of vehicle "+ customer.getCashAvailable());
		}
	}
	

	public void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println("Run credit history for customer "+customer.getName());
		System.out.println("Loan Approved for the amount "+loanAmount);
	}
	
	private void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println("Customer bought a new vehicle "+vehicle.getMake() +" " + vehicle.getModel() +" of price"+vehicle.getPrice());
		
	}
	
}
