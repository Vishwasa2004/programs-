
import java.util.Scanner;
public class lab2 
{
    //function to find a factorial
    static int factorial(int n)
    {
        if(n==0||n==1)
        return 1;
        else
        return n*factorial(n-1);
    }
    static int nCr(int n,int r)
    {
        if(r==0||r==n)
        return 1;
        else
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    //function to calculate nPr
    static int nPr(int n, int r)
    {
        if(r==0)
        return 1;
        else
        return factorial(n)/factorial(n-r);

    }
    public static void main(String[] args) {
        System.out.println("enter the option 1/2 ->1:for nCr and 2:for nPr");
        Scanner sc =new Scanner(System.in);
        int val=sc.nextInt();
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        System.out.println("enter the value of r:");
        int r=sc.nextInt();
        switch(val)
        {
            case 1:
            if(n>=r)
            {
                System.out.println("nCr="+nCr(n,r));
            }else
            {
                System.out.println("invalid input ! n should be greater than or equal to r.");
            }
            break;
            case 2:
            if (n>=r) {
                System.out.println("nPr="+nPr(n,r));
            }else
            {
                System.out.println("invalid input n should be greater than or equal to r.");
            }
            break;
            default :System.out.println("invalid option");
        }
    }
}
