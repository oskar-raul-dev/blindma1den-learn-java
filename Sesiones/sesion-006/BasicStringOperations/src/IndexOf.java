public class LastIndexOf {
    public static void main(String[] args){
        String s1 = "This is a message";

        // indexOf con un solo parámetro, halla
        // la primera aparici'pon del string, contando desde el caracter 0
        // o desde el inicio
        int pos = s1.indexOf("me");
        System.out.println("La primera ocurrencia de \"me\" es pos = " + pos);

        // indexOf con un segundo parámetro
        // va a empezar a contar desde la posición dada por el parámetro
        String s2 = "This is a message. This is a second message";
        pos = s2.indexOf("me", 15);
        System.out.println("La segunda ocurrencia de \"me\" es pos = " + pos);
    }
}
