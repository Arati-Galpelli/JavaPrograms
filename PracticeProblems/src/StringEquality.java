import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string : ");
        String str2 = sc.nextLine();
        compareString(str1,str2);
    }
    static void compareString(String s1,String s2){
        if(s1.equals(s2))
            System.out.println("Both strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}
