package com.ngs.row29.packages;

public class Pack3 {
	public static void main(String[] arg) {
		com.ngs.row29.packages.Pack1 pack1 = new com.ngs.row29.packages.Pack1();// fully qualified
															// name
		Pack2 pack2 = new Pack2();
		pack1.Show();
		pack2.pack2mthd();
		com.ngs.row29.packages.Subpackclass subpackclass = new com.ngs.row29.packages.Subpackclass();
		subpackclass.main();

	}
}
