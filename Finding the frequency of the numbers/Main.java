import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      for(int idx=0;idx<n;idx++)
      {
        arr[idx]=sc.nextInt();
      }
      int freq[]=new int[k];
      for(int i=0;i<k;i++)
      {
        freq[i]=0;
      }
      for(int idx=0;idx<n;idx++)
      {
        freq[arr[idx]-1]++;
      }
      for(int idx=0;idx<k;idx++)
      {
        System.out.println((idx+1)+" "+freq[idx]);
      }
    }
}