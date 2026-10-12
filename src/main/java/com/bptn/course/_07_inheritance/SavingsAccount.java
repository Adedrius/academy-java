package com.bptn.course._07_inheritance;

public class SavingsAccount extends Account {
	   

    //declare instance variable
	private double interest;

    //add parameterized constructor - use super keyword to call parent constructor
    public SavingsAccount(String name, double balance, double interest) {
		super(name, balance);
		this.interest = interest;
	}

	//override the toString method
    @Override
	public String toString() {
		return super.toString() + ", " + this.interest;
    }

    
    //override the equals method
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		
		return Double.doubleToLongBits(interest) == Double.doubleToLongBits(other.interest);
	}
	
    
}