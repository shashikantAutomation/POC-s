package test;

public  class StaticBlock {
	
	public static int no1;
	public static int no2;
	
	static
	{
		System.out.println("Static block 1");
		no1=1;
	}
	static
	{
		System.out.println("Static block 2");
		no2=2;
	}
	
	public static int a=123;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
	}

}
