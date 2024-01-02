class PrefixPostfix {
    public static void main(String[] args) {
        int a = 5;
        // Prefix -> หน้า
        System.out.println(a); // 5
        System.out.println(++a); // 6
        System.out.println(a); // 6

        // Postfix -> หลัง
        int b = 5;
        System.out.println(b); // 5
        System.out.println(b++); // 5
        System.out.println(b); // 6

        int c = 5;
        System.out.println(c); // 5
        System.out.println(--c); // 4
        System.out.println(c); // 4

        int d = 5;
        System.out.println(d); //5
        System.out.println(d--); //5
        System.out.println(d); //4
    }    
}
