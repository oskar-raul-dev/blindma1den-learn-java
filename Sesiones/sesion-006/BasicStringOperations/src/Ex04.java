import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner read;

        read = new Scanner(System.in);

        System.out.print("Ingrese el nombre de archivo >");
        String fileName = read.nextLine();

        // idea del algoritmo
        //    archivo.tesis.version1.pdf
        //                          ^
        //                          |
        //                          +   Podría usar lastIndexOf para hallar la última posición
        //                          +  donde está un .
        // luego de eso, puedo sacar un substring desde la posición del último punto
        // + 1 hasta el final del string, esa es la extensión del archivo
        int lastApereancePeriod = fileName.lastIndexOf('.');
        String extension = fileName.substring(lastApereancePeriod + 1);
        System.out.println("Extension del archivo = " + extension);
    }
}
