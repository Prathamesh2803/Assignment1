package project1;
 import java.util.Scanner;
 public class Primenumber{
	 public static void main(String args[])
	 {
		 int temp;
		 boolean prime=true;
		 Scanner sc= new Scanner (System.in);
		 System.out.println("Enter the no.:");
		 int num=sc.nextInt();
		     sc.close();
		  for (int i=2; i<=num/2; i++)
		  {  
			  temp=num%i;
			    if(temp==0)
		        {
			    	prime=false;
			        break;
			    	
		        }
		  }
		  if(prime)
			  System.out.println(num+"- Prime Number");
			  else
				  System.out.println(num+"-Not Prime NUmber");
	 }
	 
		
		 
		 
	 }
 
