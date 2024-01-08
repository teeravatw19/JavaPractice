import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input years (พ.ศ.) : ");
        int year_b = sc.nextInt();

        //2567 - 543 -> ค.ศ.
        int result = year_b - 543;
        System.out.println(year_b + "แปลงเป็นค.ศ.ได้เป็น" + result);
    }
}
