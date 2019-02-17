import java.util.Scanner;
class Main
{
  static int mostFrequent(int arr[],int n,int freq[])
  {
    // your code here
    int max=0;
    int cur=1;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]==arr[j])
          cur++;
      }
      freq[i]=cur;
      cur=1;
    }
    for(int i=0;i<n;i++)
    {
      if(freq[i]>freq[max])
        max=i;
    }
    return arr[max];
  }
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int freq[]=new int[n];
    System.out.println(mostFrequent(arr,n,freq));
    
  }
}