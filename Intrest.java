import java.util.*;
public class Intrest
{
	public static void main(String[] args) 
	{
		int p,t,r;
		double I;
		System.out.println("enter principle amount,time,rate of intrest");
		Scanner S=new Scanner(System.in);
		p=S.nextInt();
		t=S.nextInt();
	    r=S.nextInt();
		I=(float)(p*t*r)/100;
		System.out.println("simple intrest="+I);
	}
}