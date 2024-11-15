public class PrimitiveArithmeticOperations {
  public static void main (String args[]) {
    int a = 20;
    int b = 3;
    int suma = a + b;
    int resta = a - b;
    int producto = a * b;
    int cociente = a / b;
    int residuo = a % b;

    System.out.println("Operaciones aritméticas enteros");
    System.out.println("Suma = " + suma);
    System.out.println("Resta = " + resta);
    System.out.println("Producto = " + producto);
    System.out.println("Cociente = " + cociente);
    System.out.println("Residuo de la división = " + residuo);

    // Agrupamiento y precedencia de operadores
    // puedo agrupar usando paréntesis 
    // cómo se evalua la expresión depende de los paréntesis
    // y de las reglas de precedencia
    // las operaciones / * % tienen mayor precedencia (se evalúan primero)
    // las operaciones + - tienen menor precednecia (se evalúan de último)
    // los paréntesis permiten forzar el orden de precedencia

    int x = 3;
    int y = 5;
    int z = 4;
    
    int expr1 = x * y + z;   // vale 19, evaluación de izqiuerda a derecha
    int expr2 = x + y * x;  // primero x * y por regla de precedencia * es primero
                            //vale 18
    int expr3 = (x + y) * z; // primero x + y porque paréntesis forzan precedencia
                             // vale 32

    System.out.println("expr1 = " + expr1);
    System.out.println("expr2 = " + expr2);
    System.out.println("expr3 = " + expr3);

    // Ejercicio hacer expresiones con long, short, byte, float, double

    // coerción de datos = El compilador hace una transformación automática para
                          // ajustar un dato de un tipo "más pequeño"  a uno "más grande"
    int v1 = 50;
    float v2 = 30.5f;
    float r1 = v1 + v2; // internamente el compilador transforma v1 a flotante
    System.out.println("r1 =" + r1);

    // en este caso convierto de float (más grande) a entero (más pequeño)\
    // posible pérdida de información, entonces necesito hacer una conversión forzada
    int r2;
    r2 = (int)(v1 + v2);
    System.out.println("r2 =" + r2);

    // forzar la conversión de un tipo más pequeño a uno más grande se puede
    float r3 = (float)r2;
    System.out.println("r3 =" + r3);
  }
  
}