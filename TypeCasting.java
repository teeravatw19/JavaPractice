class TypeCasting {
    public static void main(String[] args) {
        //Widening Casting (Automatically) Smaller to Larger
        //byte(8) -> short(16) -> char(16) -> int(32) -> long(64) -> float(32) -> double(64)
        int numInt1 = 10;
        double numDouble1 = numInt1;
        System.out.println(numInt1);
        System.out.println(numDouble1);  

        //Narrowing Casting (Manually) Larger to Smaller
        //double(64) -> float(32) -> long(64) -> int(32) -> char(16) -> short(16) -> byte(8)
        double numDouble2 = 10.0;
        int numInt2 = (int)numDouble2; //ต้องเขียน Type เอง
        System.out.println(numDouble2);
        System.out.println(numInt2);

    }
}
