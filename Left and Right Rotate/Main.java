import java.util.Scanner;
class Main 
{
  public static void left_rot_ee(int arr_size,int arr[],int no_of_rot)
    {
    int first_eei=1;
    int last_eei;
    if(arr_size % 2 == 0)
    {
      last_eei=arr_size-1;
    }
    else
    {
      last_eei=arr_size-2;
    }
    for(int rot=1;rot<=no_of_rot;rot++)
    {
      int temp=arr[first_eei];
      for(int i=3;i<arr_size;i=i+2)
      {
        arr[i-2]=arr[i];
      }
      arr[last_eei]=temp;
    }
  }
  public static void right_rot_oe(int arr_size,int arr[],int no_of_rot)
  {
    int first_oei=0;
    int last_oei;
    if(arr_size % 2 == 1)
    {
      last_oei=arr_size-1;
    }
    else
    {
      last_oei=arr_size-2;
    }
    for(int rot=1;rot<=no_of_rot;rot++)
    {
      int temp=arr[last_oei];
      for(int i=(last_oei-2);i>=0;i=i-2)
          {
            arr[i+2]=arr[i];
          }
          arr[first_oei]=temp;
          }
          }
          public static void main(String args[])
          {
            Scanner in=new Scanner(System.in);
            int arr_size=in.nextInt();
            int arr[]=new int[arr_size];
            for(int i=0;i<=(arr_size-1);i++)
            {
              arr[i]=in.nextInt();
            }
            int no_of_rot=in.nextInt();
            left_rot_ee(arr_size,arr,no_of_rot);
            right_rot_oe(arr_size,arr,no_of_rot);
            for(int i=0;i<=(arr_size-1);i++)
            {
              System.out.print(arr[i]+" ");
            }
   
    	//Try your code here
  	}
}