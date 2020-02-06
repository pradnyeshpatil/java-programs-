package prepinsta;
import java.util.Scanner;
public class primeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any natural number:");
		int a =sc.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
				count=count+1;
		}
		if(count==2)
			{
			System.out.println(a+" is the prime number");
			}
		else
				System.out.println(a+" is not a prime number");
				
		
	}

}
