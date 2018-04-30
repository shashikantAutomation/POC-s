package test;

public class StaticInnerClass {
	
	static int a;
	 int b;
	 static class  Inner
	{	 
		 public void msg()
		 {
			 System.out.println(a);
		 }
	}	
	 static void innermethod()
	 {
		 a=30;
	 }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInnerClass.Inner obj= new StaticInnerClass.Inner();
		obj.msg();
		

	}

}
