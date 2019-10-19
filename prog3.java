import java.util.*;
class prog3
{
	public static void main(String[] args)
	{
		System.out.println("Write numer to find reverse");
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		int sum=0;
		do
		{
			sum=sum*10;
			sum=sum+i%10;
			i=i/10;
		}while(i>0);
		System.out.println(sum);
	}
}