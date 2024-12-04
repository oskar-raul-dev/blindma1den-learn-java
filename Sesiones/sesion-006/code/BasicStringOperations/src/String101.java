public class String101 {
    // declaración de string con el literal
    static String msg = "Hola mundo";
    static String msgObj = new String("Hola mundo");

    // String vacío es un tipo especial de string
    // que es un string sin caracteres o de longitud 0
    static String vacio = "";

    // concatenación
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

        // largo del string la función lenght()
        int largo = s.length();
        System.out.println("El largo del string es " + largo);

        System.out.println("El largo de vacio = " + vacio.length());

        // booleano que indica si el string es vacío
        boolean vacio = s.isEmpty();
        System.out.println("El string es vacío? " + vacio);

        // concatenación como método (que es equivalente al + )
        String s1 = "hola ";
        String s2 = "mundo";
        String s3 = s1.concat(s2); //  Es lo miso a s1 + s2
                                   // sobrecarga de operadores
        System.out.println("Mensaje concatenado " + s3);
    }

}
