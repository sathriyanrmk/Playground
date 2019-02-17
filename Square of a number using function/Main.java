import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(square_of_num(n));
	} 
  public static int square_of_num(int a)
  {
    int result=a*a;
    return result;
  }
}