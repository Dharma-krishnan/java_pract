import java.util.Scanner;
public class fibo {
    public static void main(String args[]){
        int num, fact=1,i;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=obj.next();

        System.out.println("Enter the number of Factorial:");
        num=obj.nextInt();

        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Hii "+name+", You Entered "+num+" and it's factorial is "+fact);
    }
}

