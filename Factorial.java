package prepinsta;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number for factorial:");
	    int num=sc.nextInt();
	    int ans=0;
	    for(int i=num;i>0;i--)
	    {   
	    	ans=ans+num*(num-1);
	    }
	    System.out.println(ans);
	}
System.out.println("hello");
}
