import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");
        int num = sc.nextInt();

        String result = "";

        /*
        if (num%2 == 0) {
            result = num + " เป็นเลขคู่";
        }
        else {
            result = num + " เป็นเลขคี่";
        }
        */
        
        //ตัวแปร = (เงื่อนไข) ? คำสั่งเมื่อเงื่อนไขเป็นจริง : คำสั่งเมื่อเงื่อนไขเป็นเท็จ;
        result = num%2 == 0? num + " เป็นเลขคู่" : num + " เป็นเลขคี่";
        System.out.println(result);
    }
}
