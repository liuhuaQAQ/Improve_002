public class Dome {

    public static void main(String[] args) {
        System.out.println("Hello 泥嚎");
        System.out.println("maven");
        System.out.println("test 1 ");
        System.out.println("test 2");
        System.out.println("test 3");
        String s1 = "abc";
        String s2 = "abcd";
        String s3 = "abcdfg";
        String s4 = "1bcdfg";
        String s5 = "cdfg";
        System.out.println( s1.compareTo(s2) ); // -1 (前面相等,s1长度小1)
        System.out.println( s1.compareTo(s3) ); // -3 (前面相等,s1长度小3)
        System.out.println( s1.compareTo(s4) ); // 48 ("a"的ASCII码是97,"1"的的ASCII码是49,所以返回48)
        System.out.println( s1.compareTo(s5) ); // -2 ("a"的ASCII码是97,"c"的ASCII码是99,所以返回-2)


        System.out.println("徐宇昊是傻逼");
    }
}
