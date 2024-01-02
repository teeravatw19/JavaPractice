import java.util.Scanner;
class MathOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input first number : ");
        int a = sc.nextInt();
        System.out.print("input second number : ");
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " x " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println("เหลือเศษ = " + (a%b));
    }    
}
