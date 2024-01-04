class Sample1
{
	int a,b;
	void get()
	{
		a=11;
		b=22;
	}
	void show()
	{
		System.out.println("a="+a+" b="+b);
	}

	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		Sample s2=new Sample();
		s1.get();
		s2.get();
		s1.show();
		s2.show();
	}
}
 