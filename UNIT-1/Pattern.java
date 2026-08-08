import java.util.*;
class Pattern{
	public static void main(String args[]){
    /*  for (int i = 1; i <= 10 ; i++)
        {
          System.out.println("5 * " + i + " = " + (5*i));
	} */

        Scanner sc = new Scanner (System.in);
	System.out.println("Enter number of rows");
        int n = sc.nextInt();
	for(int i = 1; i <= n; i++)
	{
	  for(int j = 1; j <= i; j++)
	  {
	   System.out.print("*");
	  }
          System.out.println();
	}
}
}