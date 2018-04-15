
import java.util.Scanner;

public class Monthrabbit {
    public static void main(String[] args)
    {
        int sum=0;
        System.out.println("please input the month:");
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        sum=fun(n);
        System.out.println("the number of rabbit is: "+sum);

    }

    static int fun(int n)
    {
        if(n==1||n==2)
            return 1;
        else
        {
            return fun(n-1)+fun(n-2);
        }

    }

}

