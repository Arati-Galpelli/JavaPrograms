import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();
        System.out.println("1.Addition:\n 2.Subtraction:\n 3.Multiplication:\n 4.Division: ");
        int n = sc.nextInt();
        switch(n){
            case 1 :
                int num3 = num1+num2;
                System.out.println("Addition of two numbers is :"+num3);
                break;
            case 2 :
                int num4 = num1-num2;
                System.out.println("Subtraction of two numbers is :"+num4);
                break;
            case 3 :
                int num5 = num1*num2;
                System.out.println("Multiplication of two numbers is :"+num5);
                break;
            case 4 :
                int num6 = num1/num2;
                System.out.println("Division of two numbers is :"+num6);
                break;
            default :
                System.out.println("Invalid Choice..");
        }
    }
}
