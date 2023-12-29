import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
			int a;
			System.out.println("enter a number");
			a=S.nextInt();
			if(a>0)
		{
		    System.out.println("positive");
		}
		else
	{
	    if(a==0)
	    {
	        System.out.println("zero");
	    }
	    if(a<0)
	    {
			    System.out.println("nagative");
			}
			}
	}
}
