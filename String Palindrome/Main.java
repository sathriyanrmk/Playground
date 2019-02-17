import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);
      String str=scan.nextLine();
      int strlen=str.length();
      int end=strlen-1;
      int front=0;
      boolean ispalin=true;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
          ispalin=false;
          break;
        }
        front++;
        end--;
      }
      if(ispalin == true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}
        // Type your code here
