import java.util.*;
class vowel
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
			char a;
			System.out.println("enter a string");
			a=S.next().charAt(0);
			if(a=='a'|| a=='e' || a=='i'  || a=='o' || a=='u'|| a=='A'  || a=='E' || a=='I' || a=='O' || a=='U')
		{
				System.out.println("vowel");
		}
		else
		{
			System.out.println("consonant");
		}
	}
}