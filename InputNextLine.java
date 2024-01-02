import java.util.Scanner;
class InputNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Next Line
        System.out.print("Input your name : ");
        String name_nextline = sc.nextLine();
        
        //Next
        System.out.print("Input your name : ");
        String name_next = sc.next();

        System.out.println("Your name is " + name_nextline);
        System.out.println("Your name is " + name_next);
    }
}
