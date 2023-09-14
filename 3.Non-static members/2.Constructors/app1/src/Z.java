class Z
{
	static
	{
		System.out.println("SIB begin");
		Z obj = new Z();
		Z obj1 = new Z(5);
		System.out.println("SIB end");
	}
	Z()
	{
		System.out.println("Z()");
	}
	Z(int i)
		{
		System.out.println("int i");
	}
	public static void main(String[] args)
	{
		System.out.println("-----");
		Z z1 = new Z();
		System.out.println("-----");
	}
}