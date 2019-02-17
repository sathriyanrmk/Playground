import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arrsize=in.nextInt();
      int arr[]=new int[arrsize];
      for(int i=0;i<arrsize;i++)
      {
        arr[i]=in.nextInt();
      }
      int se1=in.nextInt();
      int se2=in.nextInt();
      int e1=-1;
      int e2=-1;
      for(int i=0;i<arrsize;i++)
      {
        if(se1 == arr[i])
        {
          e1=i;
        }
        if(se2 == arr[i])
        {
          e2=i;
        }
      }
      System.out.println(e1);
      System.out.println(e2);
    }
}