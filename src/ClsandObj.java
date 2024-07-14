import java.util.Scanner;
class calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }

}
public class ClsandObj {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        calc obj=new calc();
        System.out.println("Enter first value:");
        int x=in.nextInt();
        System.out.println("Enter second value:");
        int y=in.nextInt();
        System.out.println("Enter the any one operations:\n 1.Add\n 2.Sub \n 3.Mul \n 4.Div");
        int choice=in.nextInt();
        switch(choice){
            case 1:
                System.out.println(obj.add(x,y));
            case 2:
                System.out.println(obj.sub(x,y));
            case 3:
                System.out.println(obj.mul(x,y));
            case 4:
                System.out.println(obj.div(x,y));
            default:
                System.out.println("Enter valid option");

        }

    }
}
