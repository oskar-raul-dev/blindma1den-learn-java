public class ConcatVsPlus {

    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = " World";

        System.out.println("Concatenacion con + = " + (s1 + s2));
        System.out.println("Concatenacion con \"concat\" = " + s1.concat(s2));
    }
}
