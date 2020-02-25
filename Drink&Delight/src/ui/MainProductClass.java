package ui;
import java.util.Scanner;

import service.ProductOrderServiceImpl;
public class MainProductClass {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		ProductOrderServiceImpl ProductOrderServImpobj = new ProductOrderServiceImpl(); 
		System.out.println("Type of display : \n 2) Products");
	    System.out.println("Enter Distributor Id");
		String orderid=in.nextLine();
		System.out.println("Enter Delivery Status");
		String deliveryStatuss=in.nextLine();
		System.out.println(ProductOrderServImpobj.displayProductOrder(orderid, deliveryStatuss));
	}
}
