import java.util.*;
class prog2
{
	public static void main(String[] args)
	{
		System.out.println("Write numer to find sum of digit");
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		int sum=0,num;
		do
		{
			num=i%10;
			sum=sum+num;
			i=i/10;
		}while(i>0);
		System.out.println(sum);
	}
}