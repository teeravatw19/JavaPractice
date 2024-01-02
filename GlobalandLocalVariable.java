class GlobalandLocalVariable {
    public static void main(String[] args) {
        //Global Variable
        int a = 100;
        int b = 200;
        System.out.println(a);
        {
            //Local Variable
            int c = 300;
            System.out.println(c);
            System.out.println("A = " + a);
        }
        System.out.println(b);
        //System.out.println(c); print ไม่ได้
    }
}
