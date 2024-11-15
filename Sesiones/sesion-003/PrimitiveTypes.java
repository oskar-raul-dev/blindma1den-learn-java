public class PrimitiveTypes {

  public static void main(String args[]) {
    // Declaración de variable
    // tipo_variable nombre_variable [= valor_inicial]
    
    // Declaraciones de tipos numéricos
    // literales

    // entero
    // entero de 4 bytes o 32 bits
    int temperatura = 16; // literal solo dígitos es el número en base 10
    
    // prefijo 0x literal hexadecimal
    int direccionMemoria = 0x10C; //literal dígitos + letras a,b,c,d,e,f número base 16
                                  // o hexadecimal (número 268)

    // prerfijo 0 literal octal                              
    int direccionMemoriaOct = 015; // literal dígitos del 0 al 7 base 8 u octal (número 13)

    // prefijo 0b literal binario (java 11)
    int valorBin = 0b01010000; // literal dígitos 0 y 1 el número en binario

    // literal con separación de miles usando el "underscore" _
    int costoAuto = 5_700_000; // es lo mismo que 5700000
                              // los underscores se usan para que el código sea más legible

    // entero largo
    long temperaturaLargo = 20L; //literal tiene una L al final para indicar que es un 
                                 // valor largo
    
    // literales de las bases como 0x, 0, 0b son iguales que en los enteros
    long direccionMemLong = 0x23L; // 0x hexadecimal
                                   // L es un largo

    // entero corto 
    // literales 0x, 0 y 0b igual
    short puerto = (short)8080;                                
                  // ^
                  // |
                  // +-- Casteo o moldeo (casting) de tipo
                  //     mira el dato que viene como el tipo de datos entre paréntesis
                  //     conversión forzada

    // byte 
    // literales 0x, 0 y 0b igual
    byte valorCaracter = 65;
    byte valorCaracter2 = (byte)65;

    // flotantes
    // aplica el literal 0x como hexa (pero en ese caso se 
    // lee como la representacio'n binaria en norma IEEE754)
    float estatura = 1.85f; // literal decimal corto f, con el . como separador decimal
    
    // notación científica es para denotar números muy grandes o muy pequeños
    // valor x 10 ^ algo (valor era entre 0 y 9.99999999)
    float diametroPlaneta = 2.5e20f; // 2.5 * 10 elevado a la 20
    float diametroPlanetaCast = (float)2.5e20; // 2.5 * 10 elevado a la 20
                                               // con cast a float

                                   // no confundir con número e o exponencial
    // flotantes de doble precisión
    double voltaje = 101.55; // el literal sin sufijo aplica a un doble
    double voltaje2 = 102.55D; // el literal D indica que es un doble

    // Declaracion de booleanos
    boolean valorVerdadero = true;
    boolean valorFalse = false;

    // Caracter
    // Caracter representa cualquier letra o símbolo
    // Java se utiliza la codificación de caracteres Unicode con UTF-8
    // se representa como un literal de la letra encerrada en comilla simples
    char c = 'a';  // literal de caracter
    char c2 = 'ñ';

    // secuencia de escape
    // el caracter \ backslash da un significado especial al siguiente caracter
    // algunas secuencia de escape
    //  \0 = el caracter nulo (código ASCII o UNICODE = 0)
    //  \t caracter de tabulación.
    //  \r retorno de carro (todavía en windows para las nuevas líneas)
    // \n salto de línea
    // \\u + {numero a 4 dígitos, relleno 0 si es necesario} 
    // el número es el código caracter unicode con el código dado por el numero
    char saltoLinea = '\n';
    char carB = '\u0042'; // caracter ASCII código 0x42 = 65 = B

    // ejemplos impresión 

    int a = 20;
    System.out.println("El valor de a=" + a);

    // el 20 en base 16
    int aHexa = 0x14;
    System.out.println("El valor de aHexa=" + aHexa);

    float estaturaPersona = 1.82f;
    System.out.println("La estatura de la persona es " + estaturaPersona);

    double tamAtomo = 0.00000000001D;
    System.out.println("Tam átomo es " + tamAtomo);

    char ene = 'ñ';
    System.out.println("El caracter es " + ene);

    char aMayuscula = '\u0041';
    System.out.println("El caracter definido con literal es " + aMayuscula);
    

  }
}