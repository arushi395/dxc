package assignment;

import java.util.Scanner;

public class CheckVowel {
	char c;
	Scanner sc=new Scanner(System.in);
	public void check() {
		System.out.println("Enter a character");
		c=sc.next().charAt(0);
		if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u') {
			System.out.println("The entered character "+c+" is a vowel");
		}
		else {
			System.out.println("The entered character "+c+" is a consonant");
		}
	}
	public static void main(String args[]) {
		CheckVowel v= new CheckVowel();
		v.check();
		
	}

}
