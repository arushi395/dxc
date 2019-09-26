package assignment;

import java.util.Scanner;

public class SwapNumber {
	int num1,num2;
	Scanner sc=new Scanner(System.in);
	public void swap() {
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swap, first number is:"+num1);
		System.out.println("After swap, second number is:"+num2);
	}
	public static void main(String args[]) {
		SwapNumber s= new SwapNumber();
		s.swap();
	}
}
