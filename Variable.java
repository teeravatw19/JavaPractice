class Variable{
    public static void main(String[] args) {
        //นิยามตัวแปร แบบไม่ระบุค่าเริ่มต้น
        int number1;
        boolean status;
        char alphabet;
        float number2;
        double number3;

        //นิยามตัวแปร แบบระบุค่าเริ่มต้น
        int number = 10;
        float count = 20.5f;
        char c = 'A';
        boolean s = true;
        System.out.println(number);
        System.out.println(count);
        System.out.println(c);
        System.out.println(s);


        //นิยามตัวแปร หลายบรรทัดในครั้งเดียว
        int a = 0, b = 1, d = 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);

    }
}