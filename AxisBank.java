package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("5000");
	}
	public static void main(String[] args) {
		AxisBank as = new AxisBank();
		as.savings();
		as.fixed();
		as.deposit();
	}
}
