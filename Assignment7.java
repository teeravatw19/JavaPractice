import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //  ํF -> ํC  
        // System.out.print("Input Temp( ํF) : ");
        // float temp_f = sc.nextFloat();
        // float c = (temp_f-32)*5/9;
        // System.out.println(temp_f + " ํF = " + c + " ํC");

        //  ํC -> ํF 
        System.out.print("Input Temp( ํC) : ");
        float temp_c = sc.nextFloat();
        float f = (temp_c*9/5)+32;
        System.out.println(temp_c + " ํC = " + f + " ํF");
    }

}
