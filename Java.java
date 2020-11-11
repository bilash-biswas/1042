import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a,b,c;
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    if(a > b && a > c)
    {
        if(b > c)
        {
            System.out.printf("%d\n", c);
            System.out.printf("%d\n", b);
            System.out.printf("%d\n", a);
        }
        else
        {
            System.out.printf("%d\n", b);
            System.out.printf("%d\n", c);
            System.out.printf("%d\n", a);
        }
    }
    else if(b > c && b > a)
    {
        if(a > c)
        {
            System.out.printf("%d\n", c);
            System.out.printf("%d\n", a);
            System.out.printf("%d\n", b);
        }
        else
        {
            System.out.printf("%d\n", a);
            System.out.printf("%d\n", c);
            System.out.printf("%d\n", b);
        }
    }
    else
    {
        if(a > b)
        {
            System.out.printf("%d\n", b);
            System.out.printf("%d\n", a);
            System.out.printf("%d\n", c);
        }
        else
        {
            System.out.printf("%d\n", a);
            System.out.printf("%d\n", b);
            System.out.printf("%d\n", c);
        }
    }
    System.out.printf("\n%d\n",a);
    System.out.printf("%d\n",b);
    System.out.printf("%d\n",c);
  }
}
