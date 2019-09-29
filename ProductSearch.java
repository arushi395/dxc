package assignment;

import java.util.Scanner;

public class ProductSearch {
	private int productID;
	private String productName;
	private int quantityOnHand;
	private int price;
	Scanner sc=new Scanner(System.in);
	public ProductSearch(int productID, String productName, int quantityOnHand, int price) {
		this.productID = productID;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}	
	public ProductSearch() {
		
	}

	public void searchId(ProductSearch[] product) {
		int search;
		System.out.println("enter the product to be searched");
		search=sc.nextInt();
		int c=1;
		for(int i=0;i<product.length;i++) {
			if(product[i].productID==search) {
				System.out.println(product[i]);
				c=0;
				break;
			}
		}
		if(c!=0)
		{
			System.out.println("Product Id does not exist.");
		}
		
	}	
	public String toString() {
		return "ProductSearch [productID=" + productID + ", productName=" + productName + ", quantityOnHand="
				+ quantityOnHand + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		ProductSearch product[]=new ProductSearch[5];
		product[0]=new ProductSearch(1000, "Lakme", 100, 200);
		product[1]=new ProductSearch(1001, "Lotus", 100, 250);
		product[2]=new ProductSearch(1002, "Biotique", 100, 350);
		product[3]=new ProductSearch(1003, "Lays", 100, 20);
		product[4]=new ProductSearch(1004, "Too Yum", 100, 20);
		ProductSearch productSearch=new ProductSearch();
		
		productSearch.searchId(product);		
		
	}
}
