public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Add 2 numbers together 2, 3, 5
        int a = 2;
        int b = 3;
        int c = 5;
        int Sum = a + b;
        System.out.println(Sum);


        // Print what is Sum
        System.out.println("Sum is "+ Sum);


        // Using Basic2 class
        Basic2 B=new Basic2();
        B.ValidateHeader();


        // Is there a $ sign in the string?
        String str="Payment $100 paid";
        System.out.println(str.charAt(8));
    }
}