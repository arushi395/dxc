package assignment;

import java.util.Scanner;

public class LeapYear {
	int year;
	Scanner sc=new Scanner(System.in);
	public void checkLeapYear() {
		System.out.println("Enter year");
		year=sc.nextInt();
		if(year%400 == 0) {
			System.out.println("Entered year "+year+" is a leap year.");			
		}
		else
		{
			if(year%4 == 0 & year%100 != 0) {
				System.out.println("Entered year "+year+" is a leap year.");	
			}
			else {
				System.out.println("Entered year "+year+" is a not leap year.");	
			}
		}
	}
	public static void main(String args[]) {
		LeapYear ly=new LeapYear();
		ly.checkLeapYear();
	}
}
