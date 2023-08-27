public class Manager extends Person {

private String designation;


public Manager(String name, String username, String password, String contact,String designation) {
	super(name,username,password,contact);
	this.designation=designation;
}


public String getDesignation() {
	return designation;
}


public void setDesignation(String designation) {
	this.designation = designation;
}	






	
}
