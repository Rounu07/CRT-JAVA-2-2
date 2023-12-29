import java.util.*;
class Nested
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
			int a,b,c;
		System.out.println("enter three values");
		a=S.nextInt();
		b=S.nextInt();
		c=S.nextInt();
		if (a>b)
		{
			if (a>c)
			{
				System.out.println(+a+"is bigger");
			}
			else 
			{
				System.out.println(+b+"is bigger");
			}
		}
			else
			{
		if (b>c)
		{
			System.out.println(+b+"is bigger");
		}
		else
		{
			System.out.println(+c+"is bigger");
		}
		}
	}
}