public class String101 {
    // declaraci�n de string con el literal
    static String msg = "Hola mundo";
    static String msgObj = new String("Hola mundo");

    // String vac�o es un tipo especial de string
    // que es un string sin caracteres o de longitud 0
    static String vacio = "";

    // concatenaci�n
    // se usa el signo + para "pegar " un string al final de otro
    static String nombre = "Pedro";
    static String espacio = " ";
    static String apellido = "Perez";
    static String nombreCompleto = nombre + espacio  + apellido;
                                // "Pedro " (nombre + espacio)
                                // "Pedro_Perez"   n + apellido

    public static void main(String[] args){
        System.out.println("Nombre Completo =" + nombreCompleto);

        // operaciones de strings
        String s = "Esto es un mensaje de prueba";

        // largo del string la funci�n lenght()
        int largo = s.length();
        System.out.println("El largo del string es " + largo);

        System.out.println("El largo de vacio = " + vacio.length());

        // booleano que indica si el string es vac�o
        boolean vacio = s.isEmpty();
        System.out.println("El string es vac�o? " + vacio);

        // concatenaci�n como m�todo (que es equivalente al + )
        String s1 = "hola ";
        String s2 = "mundo";
        String s3 = s1.concat(s2); //  Es lo miso a s1 + s2
                                   // sobrecarga de operadores
        System.out.println("Mensaje concatenado " + s3);
    }

}
