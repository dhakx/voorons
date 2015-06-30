package model;

import java.util.Date;

public class Child extends Member {

	private Date DOB;

	public Date getDOB() {
		return this.DOB;
	}

	/**
	 * 
	 * @param DOB
	 */
	public Child(String firstname, Date DOB) {
		// TODO - implement Child.Child
            super(firstname);
		throw new UnsupportedOperationException();
	}

}