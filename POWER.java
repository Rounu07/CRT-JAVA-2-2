import java.util.*;
class power 
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a,b values");
		a=S.nextInt();
		b=S.nextInt();
		System.out.println("values before swapping:"+a+"  "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("values after swapping:"+a+"  "+b);
	}
}
