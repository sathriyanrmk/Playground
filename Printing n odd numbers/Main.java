import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=1;
      for(int sum=1;temp<=n;sum=sum+1)
        if(sum%2 == 1)
        {
          System.out.println(sum);
          temp=temp+1;
        }
	}
}