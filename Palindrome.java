package prepinsta;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter Any number:");
	    int num=sc.nextInt();
	    int temp=num;
	    int sum=0,a;
		while(num!=0)
		{
			
			a=num%10;
			sum=sum*10+a;
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println(temp+" is the palindrome number");
		}
		else
		{
			System.out.println(temp+" is not a palindrome number");
		}
	}
	

}
