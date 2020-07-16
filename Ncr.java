package project1;
import java.util.Scanner;
public class Ncr {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the No(N):");
    		int n=sc.nextInt();
    		System.out.println("Enter the No(R):");
    		int r=sc.nextInt();
  		int ncr=fact(n)/(fact(r)*fact(n-r));

    		System.out.println("Value of "+n+"C"+r+" = "+ncr);
    	}
	
	static int fact(int n)
	{
		int i,f=1;
    		for(i=1;i<=n;i++)
    		{
        		f=f*i;
    		}	
    		return f;
	}

}
