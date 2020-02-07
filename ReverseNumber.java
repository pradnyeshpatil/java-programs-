package prepinsta;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number: ");
	int num =sc.nextInt();
	int sum=0,a;
	while(num!=0)
	{
		
		a=num%10;
		sum=sum*10+a;
		num=num/10;
	}
	System.out.println(sum);
		
	}

}
