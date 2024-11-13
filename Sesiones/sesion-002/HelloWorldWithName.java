// importar java.utils para usar el Scanner para leer por teclado
// Todas las importaciones van de primero en el código
// terminan con punto y coma
import java.util.*;

public class HelloWorldWithName {

  public static void main(String args[]) {
    String name;

    // vamos a instanciar un objeto utilitario
    // declaración
    Scanner s = new Scanner(System.in);

    

    // invocación de método estático
    System.out.print("Escribe tu nombre: ");
    // uso de un método de un objeto
    name = s.nextLine(); // leer hasta que encuentre un espacio o el enter de salto de linea

    String greeting = "Hola " + name + "!";
    System.out.println(greeting);
  }
}