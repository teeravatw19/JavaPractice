class DataTypeCheck2{
    public static void main(String[] args) {
        //เช็คชนิดของข้อมูล
        Integer a = 10; //ข้างหน้าเป็น class ข้างหลังเป็น obj
        Double b;
        String c = "HelloWorld";
        Boolean d;
        Character e;
        float f;

        // เป็น -> true or ไม่เป็น -> false
        boolean result = c instanceof String;
        System.out.println(result);
        
        boolean result1 = a.toString() instanceof String;
        System.out.println(result1);
    }
}