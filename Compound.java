class Compound {
    public static void main(String[] args) {
        int a = 10, b = 5;
        // +=
        System.out.println("ก่อนคำนวณ = " + a);
        a += b; // 10 + 5
        System.out.println("หลังคำนวณ = " + a);
        
        // -=
        int c = 10, d = 5;
        System.out.println("ก่อนคำนวณ = " + c);
        c -= d; // 10 - 5
        System.out.println("หลังคำนวณ = " + c);

        // *=
        int f = 10, g = 5;
        System.out.println("ก่อนคำนวณ = " + f);
        f *= g; // 10 * 5
        System.out.println("หลังคำนวณ = " + f);
        
        // /=
        int h = 10, i = 5; 
        System.out.println("ก่อนคำนวณ = " + h);
        h /= i; // 10 +/ 5
        System.out.println("หลังคำนวณ = " + h);

        // %=
        int j = 10, k = 5;
        System.out.println("ก่อนคำนวณ = " + j);
        j %= k; // 10 % 5
        System.out.println("หลังคำนวณ = " + j);

    }    
}
