import java.util.Scanner;
public class lab1<AddDistance> 
{
    int feet;
    int inches;

    public void Read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter distance in feet:");
        feet=sc.nextInt();
        System.out.println("enter distance in inches:");
        inches=sc.nextInt();

    }
    public void display()
    {
        System.out.println("feet:"+feet+"\tinches:"+inches);

    }
    public void Addition(lab1 D1, lab1 D2)
    {
        inches=D1.inches+D2.inches;
        feet=D1.feet+D2.feet+(inches/12);
        inches=inches%12;
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("enter the option 1/0:1: for continue and 0: for exit");
            Scanner sc=new Scanner(System.in);
            int val=sc.nextInt();
            switch (val) {
                case 1:
                lab1 D1=new lab1();
                lab1 D2= new lab1();
                lab1 D3=new lab1();

                //read first distance
                
                System.out.println("enter the first distance:");
                D1.Read();
                //read second distance
                System.out.println("enter second distance:");
                D2.Read();
                // add distances
                D3.Addition(D1,D2);
                //print distance

                System.out.println("total distance is :");
                D3.display();


                    
                    break;
                case 0:
                System.exit(0);
                default:System.out.println("enter the valid input1/0");
                
            }
        }
    }
    
}
