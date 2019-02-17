import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int miss=0;
      for(int val=1;val<=n;val++)
      {
        boolean is_found=false;
        for(int id=0;id<n;id++)
        {
          if(arr[id]==val)
          {
            is_found=true;
            break;
          }
        }
        if(is_found==false)
        {
          miss=val;
          break;
        }
      }
      System.out.print(miss);
    }
}