import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int row_size=sc.nextInt();
    int col_size=sc.nextInt();
    int m1[][]=new int[row_size][col_size];
    for(int i=0;i<row_size;i++)
    {
      for(int j=0;j<col_size;j++)
      {
        m1[i][j]=sc.nextInt();
      }
    }
    int m2[][]=new int[row_size][col_size];
    for(int i=0;i<row_size;i++)
    {
      for(int j=0;j<col_size;j++)
      {
        m2[i][j]=sc.nextInt();
      }
    }
    int sum[][]=new int[row_size][col_size];
    sub(m1,m2,sum);
    display(sum);
  }
  public static void sub(int m1[][],int m2[][],int sum[][])
  {
    for(int i=0;i<=sum.length-1;i++)
    {
      for(int j=0;j<sum[i].length;j++)
      {
        sum[i][j]=m1[i][j]-m2[i][j];
      }
    }
  }
  public static void display(int matrix[][])
  {
    for(int i=0;i<matrix.length;i++)
    {
      for(int j=0;j<matrix[i].length;j++)
      {
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  
  }
}