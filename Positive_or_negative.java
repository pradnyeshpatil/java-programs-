package prepinsta;
import java.util.*;
public class Positive_or_negative {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number:");
		int a =sc.nextInt();
		if(a>0)
		{
			System.out.println("Number is Positive");
			
		}
		else if(a<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is zero");
		}
	}

}
