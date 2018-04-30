package test;

public class ChildClass {

	int a=1;
	static int b=2;
	
	 static void m1()
	{
		b=3;
		System.out.println(b);
	}
	
}

class Child extends ChildClass
{
	
	
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.m1();
		
		//StaticMethod.b=3;
		//StaticMethod.m1();

	}

}
