package com.ngs.Java;

/*
*  It is the Main class for Account.
*/
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		/*
		 * ac.SetData(2020202020d, 8938, "SBI"); //ac.Deposit(2020202020d, 1000,
		 * "SBI"); ac.GetBalance(); ac.Deposit(2020202020d, 1000, "SBI");
		 * ac.GetBalance(); ac.Withdraw(2020202020d, 2000, "SBI");
		 * ac.GetBalance(); ac.Deposit(2020202020d, 100, "SBI");
		 * ac.GetBalance(); ac.Withdraw(2020202020d, 200, "SBI");
		 * ac.GetBalance(); ac2.Deposit(2020202020d, 100, "SBH");
		 * ac2.GetBalance();
		 */
		// Here i am calling the setData method by passing parameters values.
		account.SetData(2020202020d, 1000, "SBI");

		// Here i am calling the Deposit method by passing parameters values.
		account2.Deposit(2020202020d, 100, "SBI");

		// Here i am calling the GetBalance method.
		account3.GetBalance();

		account2.Withdraw(2020202020d, 1100, "SBI");
		account3.GetBalance();
		account.Withdraw(2020202020d, 100, "SBI");
		// ac.GetBalance();

	}

}
