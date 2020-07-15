package project1;
import java.util.Scanner;
public class Reverse_digits {

	  public static void main(String args[])
	  {
	    int n, r = 0;

	    System.out.println("Enter the number:");
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();

	    while(n != 0)
	    {
	      r = r * 10;
	      r = r + n%10;
	      n = n/10;
	    }

	    System.out.println("Reverse No.: " + r);
	  }

}
