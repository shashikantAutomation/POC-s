package test;

import java.util.Scanner;

public class PracticeTest {
	
	int x=10;
	public  void m(int x)
	{
		 x=x;
		 System.out.println(this.x);
	}

	public static void main(String[] args) {
		
		
		PracticeTest a=new PracticeTest();
				a.m(100);
		
/*		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int arr[]=new int[no];
		
		for (int i = 0; i < no; i++) {
			Scanner element=new Scanner(System.in);
			int temp=element.nextInt();
			arr[i]=temp;						
		}
		for (int j = arr.length-1; j >=0; j--) {
			System.out.println(arr[j]);
			
		}
*/
	}

}
