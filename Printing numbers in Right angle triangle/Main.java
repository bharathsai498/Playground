import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int r;
      r=in.nextInt();
      int i,j;
      for(i=1;i<=r;i++)
      {
        for(j=1;j<=i;j++)
        {
          System.out.print(i);
        }
        System.out.println();
      }
      
	}
}