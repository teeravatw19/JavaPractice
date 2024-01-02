class OperatorSequence {
    public static void main(String[] args) {
        /*
            1.) ()
            2.) ++, -- (left -> right)
            3.) *, /, % (left -> right)
            4.) +, - (left -> right)
            5.) <, <=, >, >= (left -> right)
            6.) ==, != (left -> right)
            7.) && (left -> right)
            8.) || (left -> right)
            9.) =, +=, -=, *=, /=, %= (right -> left)
         */
        float a = 5+8*9; // 5+(8*9) = 77
        System.out.println(a);

        float b = 10-4+2; // (10-4)+2 = 8
        System.out.println(b);

        float c = 10-(2+1); // 10-(2+1) = 7
        System.out.println(c);

        float d = 5*2-40/5; // (5*2)-(40/5) = 10-8 = 2
        System.out.println(d);

        float e = 7+8/2+25; // 7+(8/2)+25 = 7+4+25 = 36
        System.out.println(e);
    }    
}
