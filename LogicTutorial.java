class LogicTutorial {
    public static void main(String[] args) {
        int a = 10, b = 20;

        boolean c = (a == b); //false
        boolean d = (a < b); //true
        
        //AND && -> และ
        System.out.println((c && d )); // false and true -> false   
        System.out.println((20 == b) && (20 <= b)); //-> false

        //OR || -> หรือ
        System.out.println((a == b) || (a < b));

        //NOT ! -> ไม่ (ตรงกันข้าม)
        System.out.println(!(a == b));
    }
}
