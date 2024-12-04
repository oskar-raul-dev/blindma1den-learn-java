public class IntegerPolynomial {

    public static void main(String[] args){
        int x = 10;
        int a = 5;
        int b = 3;
        int c = 1;
        int d = -5;

        // quiero evaluar el polinomia
        // a* x^3 + b * x^2 + c * x + d

        // Math.pow(x, n) elevaba x a la n
        // x ^3 = Math.pow(x, 3);
        // Como Math.pow devuelve Double entonces al resultado se le
        // castea como entero
        int y = (int)(a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d);

        System.out.println( "a* x^3 + b * x^2 + c * x + d evaluado en x = " + x + " = " + y);
    }
}
