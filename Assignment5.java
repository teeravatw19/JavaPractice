import java.util.Scanner;
class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your weight(kg.) : ");
        double weight = sc.nextDouble();
        System.out.print("Input your height(cm.) : ");
        double height = sc.nextDouble();

        height /= 100;
        double bmi = weight / (height * height);

        String result = "";
        if (bmi < 18) {
            result = " ต่ำกว่าเกณฑ์";
        }
        else if (bmi >= 18.5 && bmi < 23) {
            result = " สมส่วน";
        }
        else if (bmi >= 23 && bmi < 25) {
            result = " น้ำหนักเกิน";
        }
        else if (bmi >= 25 && bmi < 30) {
            result = " โรคอ้วน";
        }
        else {
            result = " โรคอ้วนระดับอันตราย";
        }
        System.out.println("น้ำหนัก (kg.) : " + weight);
        System.out.println("ความสูง (cm.) : " + height);
        System.out.println("ค่าดัชนีมวลกาย (BMI) : " + bmi + result);
    }
}
