import java.util.Scanner;
class InputTutorial{
    public static void main(String[] args) {
        //รับค่าข้อมูล
        //ข้อมูลแบบไหน? ตัวเลข -> Integer, float, long, double | ข้อความ -> String
        //ข้อความทำอะไร
        //ข้อความแบบตัวเลข -> คำนวณได้ | คำนวณไม่ได้

        //ประกาศใช้งาน Class | new
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Name : ");
        String name = sc.nextLine(); //รับค่า String จาก keyboard -> name

        System.out.print("ปีเกิด : ");
        int year = sc.nextInt(); //รับค่า Integer จาก keyboard -> year

        int age = 2566 - year; //คำนวณอายุ


        System.out.println("Your name is " + name); //แสดงข้อความที่รับมาจาก keyboard
        System.out.println("เกิดปี : " + year);
        System.out.println("มีอายุ : " + age + " ปี");
    }
}