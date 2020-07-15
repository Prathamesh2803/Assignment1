package project1;
import java.util.Scanner;
public class Palindrome_Num {
	public static void main(String args[]){  
		  int r,n,sum=0,temp;    
		  System.out.println("Enter the number:");
		    Scanner sc = new Scanner(System.in);
		    n = sc.nextInt();  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("This is a Palindrome Number ");    
		  else    
		   System.out.println("Not a Palindrome Number!");    
		}  

}
