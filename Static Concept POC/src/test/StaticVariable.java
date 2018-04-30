package test;

 public class StaticVariable {

	static int a=1;
	public StaticVariable()
	{
		a++;
		System.out.println(a);
	}
	public void m1()
	{
		a=a+1;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable obj=new StaticVariable();
		obj.m1();
				

	}
 }



