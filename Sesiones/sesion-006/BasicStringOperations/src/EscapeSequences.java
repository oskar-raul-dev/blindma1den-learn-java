public class EscapeSequences {
    public static void main(String[] args){
        // Secuencia de escape

        // el backslash \ marca el inicio de algún "caracter especial"
        // y debemos leer sl siguiente caracter del literal string para saber
        // el caracter real que queremos

        // Ejemplo más básico es el salto de línea
        // tenemos dos líneas de texto

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
