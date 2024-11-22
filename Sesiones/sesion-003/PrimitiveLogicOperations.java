public class PrimitiveLogicOperations {
  public static void main (String args[]) {
    // valores lógicos
    // dos literales true y false

    // operaciones lógicas 
    // conjunción o Y lógico  &&
    // disyunción o O lógico ||
    // OR incluyente o XOR ^
    // negación !
    // operadores de comparación que aplicación a tipos primitivos excepto booleanos
    // operadores de comparación devuelven un booleano
    // >, >= mayor o mayor_igual
    // <, <= menor o menor_igual
    // igualdad o no igualdad aplican a cualquier tipo en java
    // == igual
    // != diferencia

    boolean b1 = true;
    boolean b2 = false;
    boolean and = b1 && b2;
    boolean or = b1 || b2;
    boolean xor = b1 ^ b2;
    boolean not = !b1;

    System.out.println("b1 && b2 = " + and);
    System.out.println("b1 || b2 = " + or);
    System.out.println("b1 ^ b2 = " + xor);
    System.out.println("!b1 = " + not);


    // Operadores de comparación
    //  que aplican tipos numérico, entero como flotante y a caracter
    //  ==  igualdad 
    // != no igualdad
    // > <  mayor o menor estricto
    // >= <=
    int a = 5, b = 3;
    boolean compare;
    compare = a > b;
    System.out.println("a =" + a + ", b = " + b + ", a > b =" + compare);

    compare = a <  b;
    System.out.println("a =" + a + ", b = " + b + ", a < b =" + compare);

    compare = a >=  b;
    System.out.println("a =" + a + ", b = " + b + ", a >= b =" + compare);

    compare = a <=  b;
    System.out.println("a =" + a + ", b = " + b + ", a <= b =" + compare);

    double c = 1.5D, d = 1.50001;
    System.out.println("c=" + c + ", d=" + d + ", c >= d = " + (c >= d));

    long e = 50000L;
    long f = 51500L;

    compare = e != f;
    System.out.println("e != f vale "  + compare);
  }
}