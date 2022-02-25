package com.ngs.row18.javaclass.object.var.instances;

public class AccntArthopts 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Account ac=new Account(2020202020d, 8938, "SBI");
		Account account = new Account(2020202020d, 8938, "SBI");
		Account account2 = new Account(account);
	}

}
