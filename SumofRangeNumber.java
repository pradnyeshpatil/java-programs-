package prepinsta;
import java.util.Scanner;
public class SumofRangeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the starting of range:");
		int a=sc.nextInt();
		System.out.println("Enter the End of range:");
		int b =sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
