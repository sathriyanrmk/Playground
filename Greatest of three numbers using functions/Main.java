import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(greatest_of_num(n1,n2,n3));
    }
  public static int greatest_of_num(int n1,int n2,int n3)
  {
    int greatest;
    if((n1>n2) && (n1>n3))
    {
      greatest=n1;
    }
    else if((n2>n1) && (n2>n3))
    {
      greatest=n2;
    }
    else
    {
      greatest=n3;
    }
    return greatest;
  }
}