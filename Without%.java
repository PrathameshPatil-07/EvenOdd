import java.util.Scanner;
class EvenOdd{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    boolean ans=((num*2)/2==num)?(True):(False);
    System.out.println(ans);
  }
}
