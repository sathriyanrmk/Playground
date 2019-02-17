import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=in.nextInt();
      }
      int value=in.nextInt();
      perfect_couple(arr_size,arr,value);
    }
  public static void perfect_couple(int arr_size,int arr[],int value)
  {
    for(int i1=0;i1 < arr_size;i1++)
    {
      for(int i2=i1 + 1;i2 < arr_size;i2++)
      {
        int sum=arr[i1]+arr[i2];
        if(sum == value)
        {
          System.out.println(arr[i1]+","+" "+arr[i2]);
        }
      }
    }
    }
}