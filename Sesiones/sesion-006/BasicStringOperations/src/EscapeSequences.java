public class EscapeSequences {
    public static void main(String[] args){
        // Secuencia de escape

        // el backslash \ marca el inicio de alg�n "caracter especial"
        // y debemos leer sl siguiente caracter del literal string para saber
        // el caracter real que queremos

        // Ejemplo m�s b�sico es el salto de l�nea
        // tenemos dos l�neas de texto

        /*
          Ejemplo : Hola
          Mundo
        * */
        String helloMultiline = "Hello\r\nWorld";
        System.out.println(helloMultiline);

        String helloWithDoubleQuote = "Hello \"World\"";
        System.out.println(helloWithDoubleQuote);

    }
}
