import java.util.Scanner;
class AndOrNot {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Input your age : ");
        int age = kb.nextInt();

        /*
        if (age >= 15 && age <= 19){
            System.out.println("วัยรุ่น");
        }
        */

        /*
        if (age >= 15 || age <= 19){
            System.out.println("วัยรุ่น");
        }
        */
        
        if (!(age == 15)){
            System.out.println("วัยรุ่น");
        }
        else{
            System.out.println("ไม่ใช่วัยรุ่น");
        }
    }
}
