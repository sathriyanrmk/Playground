import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
  Scanner in=new Scanner(System.in);
  int base=in.nextInt();
    int exp=in.nextInt();
    System.out.println(power_of_num(base,exp));
  }
  public static int power_of_num(int base,int exp)
  {
    int power=1;
    while(exp >= 1)
    {
      power=power*base;
      exp--;
    }
    return power;
  }
}