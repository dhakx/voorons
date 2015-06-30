package model;
public class Employee extends Member {

	private int empCode;
	private String familyName;
	private String email;
	private String role;

	public String getFamilyName() {
		return this.familyName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * 
	 * @param familyName
	 * @param email
	 * @param role
	 */
	public Employee(String firstName, String familyName, String email, String role) {
		// TODO - implement Employee.Employee
            super(firstName);
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param child
	 */
	public void addChild(Child child) {
		// TODO - implement Employee.addChild
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param partner
	 */
	public void addPartner(Partner partner) {
		// TODO - implement Employee.addPartner
		throw new UnsupportedOperationException();
	}

}