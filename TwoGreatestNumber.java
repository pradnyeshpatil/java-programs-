package prepinsta;
import java.util.Scanner;
public class TwoGreatestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Numbers:");
		int a =sc.nextInt();
		System.out.println("Enter Second Numbers:");
		int b =sc.nextInt();
		
		if(a > b)
			System.out.println(a+" is greater than "+b);
		else if(b > a)
			System.out.println(b+" is greater than "+a);
		else
			System.out.println("Both numbers are Equal");
		
	}

}
