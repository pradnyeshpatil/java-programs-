package prepinsta;

import java.util.Scanner;

public class ThreegreatestNumber {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Numbers:");
			int a =sc.nextInt();
			System.out.println("Enter Second Numbers:");
			int b =sc.nextInt();
			System.out.println("Enter Third Numbers:");
			int c =sc.nextInt();
			
			
			if(a > b && a>c)
				System.out.println(a+" is greater than "+b+" and "+c);
			else if(b > a && b>c)
				System.out.println(b+" is greater than "+a+" and "+c);
			else if(c> a && c>b)
				System.out.println(c+" is greater than "+b+" and "+a);
			else
				System.out.println("All numbers are same");
			

	}

}
