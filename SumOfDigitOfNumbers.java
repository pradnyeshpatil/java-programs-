package prepinsta;
import java.util.Scanner;
public class SumOfDigitOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num =sc.nextInt();
	    int sum=0,a;
	    while(num!=0)
	    {
	    	a=num%10;
	    	sum=sum+a;
	    	num=num/10;
	    }
	    System.out.println(sum);
	}

}
