package ui;
import java.util.Scanner;

import service.RawMaterialOrderServiceImpl;
public class MainClass {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) 
	{
		RawMaterialOrderServiceImpl rawMaterialOrderServImplObj = new RawMaterialOrderServiceImpl(); 
		System.out.println("Type of display : \n 1) Raw Materials");
		System.out.println("Enter Supplier Id");
		String id=in.nextLine();
		System.out.println("Enter Delivery Status");
		String deliveryStatus=in.nextLine();
		System.out.println(rawMaterialOrderServImplObj.displayOrder(id, deliveryStatus));
		}
	}