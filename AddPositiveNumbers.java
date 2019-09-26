package assignment;

import java.util.Scanner;

public class AddPositiveNumbers {
	int num1,num2;
	Scanner sc=new Scanner(System.in);
	public void add() {
		System.out.println("Enter first number");
		num1=sc.nextInt();
		AddPositiveNumbers an=new AddPositiveNumbers();
		int c= an.check(num1);
		if(c==0) {
			System.exit(0);
		}
		System.out.println("Enter second number");
		num2=sc.nextInt();
		c= an.check(num2);
		if(c==0) {
			System.exit(0);
		}
		System.out.println("Sum is :"+(num1+num2));
	}
	public int check(int n) {
		if(n<0) {
			System.out.println("You have entered a negative number"); return 0;
		}
		else {
			return 1;
		}
		
	}
	public static void main(String args[]) {
		AddPositiveNumbers an=new AddPositiveNumbers();
		an.add();
	}
}
