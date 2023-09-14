class C
{
	void test1()
	{
		System.out.println("from tes1");
	}
}
class M1 extends C
{
	void test2()
	{
		System.out.println("from test2");
	}

	public static void main(String[] args)
	{
		D d1 = new D();
		d1.test1();
		d1.test2();
	}
}