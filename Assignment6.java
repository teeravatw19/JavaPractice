import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนจำนวนเงิน : ");
        int money = sc.nextInt();
        System.out.println("จำนวนเงิน = " + money);

        if (money >= 1000) {
            System.out.println("1000 บาท จำนวน : " + (money/1000) + " ใบ");
            money %= 1000;
        }
        if (money >= 500) {
            System.out.println("500 บาท จำนวน : " + (money/500) + " ใบ");
            money %= 500;
        }
        if (money >= 100) {
            System.out.println("100 บาท จำนวน : " + (money/100) + " ใบ");
            money %= 100;
        }
        if (money >= 50) {
            System.out.println("50 บาท จำนวน : " + (money/50) + " ใบ");
            money %= 50;
        }
        if (money >= 20) {
            System.out.println("20 บาท จำนวน : " + (money/20) + " ใบ");
            money %= 20;
        if (money >= 10) {
            System.out.println("10 บาท จำนวน : " + (money/10) + " เหรียญ");
        }
        }
    }
}