package prepinsta;

import java.util.Scanner;

public class FirstNnaturalNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any positive number:");
		int a =sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
