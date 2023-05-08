public class DemoStatic {
    static String var1;  //static variable initialization
    static int var2;
    //static block
    static{
        System.out.println("Inside Static Block");
        var1="arati";
        var2=20;
    }
    //static method
    static void display(){
        System.out.println("Inside Static method...");
        System.out.println(var1);
        System.out.println(var2);
    }
    public static void main(String[] args) {
        display();
    }
}
