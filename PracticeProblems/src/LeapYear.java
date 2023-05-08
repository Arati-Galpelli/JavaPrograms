import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Year :");
        int year = sc.nextInt();
        int res = isLeap(year);
        if(year>=1585) {
            if (res == 1)
                System.out.println("Given year is leap year");
            else
                System.out.println("Given year is not leap year");
        }
        else
            System.out.println("Invalid Year");

    }
    static int isLeap(int y) {
            if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
                return 1;
            else
                return 0;
    }
}
