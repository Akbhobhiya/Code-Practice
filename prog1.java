import java.util.*;
class prog1
{
	public static void main(String[] args) {
		System.out.println("Write numer to find factorial");
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		int sum=1;
		for(int p=1;p<=i;p++)
		{
			sum=sum*p;
		}
		System.out.println(sum);
	} 

}