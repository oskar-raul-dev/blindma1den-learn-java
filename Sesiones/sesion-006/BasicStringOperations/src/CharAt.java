public class CharAt {
    public static void main(String[] args){
        String s1 = "Programming in Java";

        // charAt devuelve caracter
        System.out.println("El caracter en la posición 5 = " + s1.charAt(5));

        // charPointAt devuelve entero
        System.out.println("El marca de código en la posición 5 = " + s1.codePointAt(5));
    }
}
