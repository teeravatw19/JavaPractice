class DataTypeCheck {
    public static void main(String[] args) {
        //ชนิดของข้อมูล
        Integer a = 10;
        Double b;
        String c = "HelloWorld";
        Boolean d;
        Character e;
        Float f;

        // เป็น (true) / ไม่เป็น (false)
        boolean result = c.toString() instanceof String; //ข้างหน้าต้องเป็น class เท่านั้น
        System.out.println(result);
        boolean result1 = a instanceof Integer;
        System.out.println(result1);
    }
}
