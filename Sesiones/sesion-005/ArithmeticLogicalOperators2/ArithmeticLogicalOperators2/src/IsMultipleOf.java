public class IsMultipleOf {
    public static void main(String[] args){
        //  Un numero entero X es m�ltiplo de otro entero positivo A
        // Si X = N * A  (N es un entero) Si X es N veces A para alg�n N
        // X es m�ltiplo de A si el residuo de dividir X / A es 0

        long n = 140L;
        boolean isMultipleOf5, isMultipleOf7;

        isMultipleOf5 = (n % 5) == 0;
        isMultipleOf7 = (n % 7) == 0;

        System.out.println("n es m�ltiplo de 5 ? " + isMultipleOf5);

        System.out.println("n es m�ltiplo de 7 ? " + isMultipleOf7);

        // para saber si es m�ltiplo de 7 Y 5 a la vez
        // debemos usar el operador  &&
        boolean isMultipleOf5And7 = isMultipleOf5 && isMultipleOf7;
        System.out.println("n es m�ltiplo de 5 y  7 a la vez ? " + isMultipleOf5And7);

    }
}
