class ConditionVariable {
    public static void main(String[] args) {
        int num1$ = 100;
        System.out.println(num1$);
        /*
         * Run ไม่ได้ 
         *  int 1num$ = 100;
         *  int @num = 100;
         * Keyword
         *  int this = 100; 
         *  int for = 100;
         */
        int $num = 100;
        System.out.println($num);
        int _this = 100;
        System.out.println(_this);
        int _for = 100;
        System.out.println(_for);
        //Case Sensitive
        int num1 = 100;
        int Num1 = 200;
        int nUm1 = 300;
        System.out.println(num1);
        System.out.println(Num1);
        System.out.println(nUm1);
    }
}
