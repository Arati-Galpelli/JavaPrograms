public class SumOfCmdLineArgs {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer command line arguments: " + e.toString());
                count++;
            }
        }
        System.out.println("Sum of Interger numbers :" +sum);
        System.out.println("Invalid Interger count : "+count);
    }
}
