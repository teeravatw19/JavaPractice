import java.util.Scanner;
class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your weight(kg.) : ");
        double weight = sc.nextDouble();
        System.out.print("Input your height(cm.) : ");
        double height = sc.nextDouble();

        height /= 100;
        double bmi = weight / (height * height);

        System.out.println("Your BMI : " + bmi);
    }
}
