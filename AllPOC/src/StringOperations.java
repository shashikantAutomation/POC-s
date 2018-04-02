import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringOperations {	
	public static void stringReverse(String ip)
	{	
	}	
	public static void patternnumber()
	{
		for (int i = 0; i < 4 ; i++) 
		{			
			for (int j = i; j < 4; j++) 
			{
				System.out.print(j+1);				
			}
			for (int k = 0; k <i ; k++) 
			{
				System.out.print(k+1);
			}
			System.out.println();
		}
	}	
	
public static void ReversepatternNumber()
{
	for (int i = 5; i >=0; i--) 
	{
		for (int j = i; j>=0; j--) {
			System.out.print(j);	
		}
		for (int k = 5; k >i ; k--) {
			System.out.print(k-i+1);			
		}
		System.out.println();	
		
	}
	
}

	public static void pyramidpattern()
	{
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <4-i ; j++) {
				System.out.print(" ");				
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");				
			}					
			System.out.println();
			
		}
		
		
		
	}
	
	public static void m() throws NumberFormatException, IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			int a[] = new int[t];
			StringTokenizer st = new StringTokenizer(br.readLine());
			int i = 0;
			while(st.hasMoreTokens()){
				a[i++] = Integer.parseInt(st.nextToken());
			}
	        
	        for (int j = 0; j < t; ++j) {
	            int num = a[j];
	            for (int k = 1; k <= num; ++k) {
	                if (k % 15 == 0)
	                    System.out.println("FizzBuzz");
	                else if (k % 3 == 0)
	                    System.out.println("Fizz");
	                else if (k % 5 == 0)
	                    System.out.println("Buzz");
	                else
	                    System.out.println(k);
	            }   
	        }
	    
	
	}
	
	public static void  m2()
	{
		  Scanner sc=new Scanner(System.in);
	        int no=sc.nextInt();
	        System.out.println(no*2);
	       Scanner sc1=new Scanner(System.in);
	        
	        String str=sc1.next();
	        System.out.println(str);
	}
	
	public static void learningarraylist()
	{
		String a="abcdefga";
		char[] arra=a.toCharArray();
		for (int i = 0; i < arra.length; i++) 
		{
			
		}
		
				
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//System.out.println("Enter String");
		/*Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		stringReverse(input);*/		
		//patternnumber();
		//ReversepatternNumber();
		//System.out.println();
		pyramidpattern();
		//m();
		//m2();
		
	}

}
