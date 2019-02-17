import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int arr[]=new int[20];
    int i,j;
    for(i=0;i<N;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.print(sum_sub(arr,N));
  }
  public static int sum_sub(int arr[],int n)
  {
    int runn,max_ss,i;
    runn=arr[0];
    max_ss=arr[0];
    for(i=1;i<n;i++)
    {
      if(arr[i]>arr[i-1])
      {
        runn += arr[i];
      }
      else
      {
        runn=arr[i];
      }
      if(runn > max_ss)
      {
        max_ss=runn;
      }
    }
    return max_ss;
  }
}