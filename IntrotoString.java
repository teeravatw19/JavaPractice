class IntrotoString {
    public static void main(String[] args) {
        /*
            String = ชนิดข้อมูลที่เก็บชุดข้อความ
            Symbol = ""

            char = เก็บตัวอักษร
            Symbol = ''

            char เรียงต่อกัน -> String
         */
        char a = 'A';
        System.out.println(a);

        String b = "ABC", c = "100", d = "200", g = "300";
        //c += (int)50; -> 10050 ไม่สามารถบวกกันได้
        //int c += 50; -> Error
        //int c += (int)50; -> Error
        //c += 50; -> "100" + 50 = 10050
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        //String -> int
        int e;
        e = Integer.parseInt(c); //เปลี่ยน String -> Integer
        e += 50; //100 + 50
        System.out.println(e);

        //String -> Double
        double f = Double.parseDouble(g); //เปลี่ยน String -> Double
        f += 100;
        System.out.println(f);

        //Integer -> String
        int num1 = 100;
        String age = String.valueOf(num1);
        System.out.println(age);
    }    
}
