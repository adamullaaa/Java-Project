
public class Customer extends Person {

	private String CustomerID;
	
	public Customer(String name, String username, String password, String contact,String Customerid) {
		super(name, username, password, contact);
		this.CustomerID=Customerid;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	
	
	
}
