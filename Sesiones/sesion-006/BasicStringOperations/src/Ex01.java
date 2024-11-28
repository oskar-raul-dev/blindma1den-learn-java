// importar las dependencias
// importar toodo el paquete (no es tan buena práctica)
// importar solo las clases a usar (es la buena práctica, nos apoyamos en el IDE)
import java.nio.charset.Charset;
import java.util.*;

public class Ex01 {
    public static void main(String[] args){
        // Scanner es un objeto para leer de flujos de entrada
        // en nuestro caso la "entrada estándar"
        // System.in = Objeto para acceder a entrada estándar stdin
        // System.out = Objeto para acceder a salida estándar stdout
        // System.err = Objeto para acceder a error estándar stderr

        // crear un Scanner asociado a la entrada estándar que es por teclado
        Scanner read = new Scanner(System.in);

        // leer línea completa, es decir leo un nextLine
        String linea;

        System.out.print("Ingrese un string >");

        // lectura "bloqueante"
        // se va a quedar esperando hasta que al menos haya una linea
        // (escrito algo + ENTER)
        linea = read.nextLine();

        // Estudiar sobre UNICODE
        // Las codificaciones tradicionales de UNICODE
        // UTF-8
        // UTF-16
        // UTF-32
        System.out.println("La longitud de la cadena es = " + linea.length());
        System.out.println("La cantidad de bytes cadena es = " + linea.getBytes(Charset.forName("UTF-8")).length);


        // tomar hábito de cerrar funciones de archivos o scanner luego de finalizar el uso
        read.close();
    }
}
