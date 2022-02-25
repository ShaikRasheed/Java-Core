package com.ngs.row18.javaclass.object.var.instances;

public class Account {

	double accountno, balance;
	String accountname;

	public Account(double accountno, double balance, String accountname) {
		this.accountno = accountno;
		this.balance = balance;
		this.accountname = accountname;
	}

	public void Deposit(double accountno, double balance, String accountname) {
		this.accountno = accountno;
		this.balance += balance;
		this.accountname = accountname;

	}

	public void Withdraw(double accountno, double balance, String accountname) {
		if (this.balance >= balance) {
			this.accountno = accountno;
			this.balance -= balance;
			this.accountname = accountname;
		} else {
			System.out.println("insaficient balance");
		}
	}

	public Account(Account acc) {
		System.out.println(acc.accountno);
		System.out.println(acc.balance);
		System.out.println(acc.accountname);
	}

}
