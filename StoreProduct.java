package assignment;

import java.util.Scanner;

public class StoreProduct {
	private int productID;
	private String productName;
	private int quantityOnHand;
	private int price;
	Scanner sc=new Scanner(System.in);	
	
	public StoreProduct() {
		System.out.println("enter product id,product name,quantity on hand & price");
		this.productID = sc.nextInt();
		if(this.productID<0) {
			System.out.println("Negative values not allowed, please eneter a positive value");
			this.productID=sc.nextInt();}
		this.productName = sc.next();
		this.quantityOnHand = sc.nextInt();
		if(this.quantityOnHand<0) {
			System.out.println("Negative values not allowed, please eneter a positive value");
			this.quantityOnHand=sc.nextInt();}
		this.price = sc.nextInt();
		if(this.price<0) {
			System.out.println("Negative values not allowed, please eneter a positive value");
			this.price=sc.nextInt();}
	}
	
	public String toString() {
		return "StoreProduct [productID=" + productID + ", productName=" + productName + ", quantityOnHand="
				+ quantityOnHand + ", price=" + price + "]";
	}
	public static void main(String[] args) {
		StoreProduct storeProduct[]= new StoreProduct[5];
		int i=0;
		do {
			storeProduct[i]=new StoreProduct();
			i++;
		}while(i<5);
		i=0;
		System.out.println("The products entered are as follows");
		do {
			System.out.println(storeProduct[i]);
			i++;
		}while(i<5);
	
	}

}
