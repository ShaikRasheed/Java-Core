package com.ngs.Java;

/*
 * 
 * It is the Account class
 * 
 * 
 * */
public class Account {
	double accountno, balance;
	String accountname;
	/*
	 * Setting the data by using setData method and this keyword.
	 */

	public void SetData(double accountno, double balance, String accountname) {
		this.accountno = accountno;
		this.balance = balance;
		this.accountname = accountname;
	}

	/*
	 * Deposit method is used for how much Deposited in the account will be
	 * display
	 */
	public void Deposit(double accountno, double balance, String accountname) {
		this.accountno = accountno;
		this.balance += balance;
		this.accountname = accountname;

	}

	/*
	 * Withdraw method is used for how much Withdraw account will be display And
	 * user is aligible to withdraw the account or not.
	 */
	public void Withdraw(double accountno, double balance, String accountname) {
		if (this.balance >= balance) {
			this.accountno = accountno;
			this.balance -= balance;
			this.accountname = accountname;
		} else {
			System.out.println("insaficient balance");
		}
	}

	/*
	 * GetBalance method is used to get the current balance.
	 */
	public void GetBalance() {
		System.out.println(this.accountno);
		System.out.println(this.balance);
		System.out.println(this.accountname);
	}

}
