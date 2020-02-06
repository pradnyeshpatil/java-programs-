package prepinsta;
import java.util.Scanner;
public class PrimeNUmberRange {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the starting number of  range :");
		int start =sc.nextInt();
		System.out.println("Enter the Ending number of range:");
		int end= sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{   int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count=+count+1;
			}
			if(count==2)
				System.out.println(i);
		}
		
	}

}
