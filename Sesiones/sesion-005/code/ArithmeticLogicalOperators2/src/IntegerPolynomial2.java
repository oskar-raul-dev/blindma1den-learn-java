public class IntegerPolynomial2 {

    public static void main(String[] args){
        int x = 10;
        int a = 5;
        int b = 3;
        int c = 1;
        int d = -5;

        //aritm�tica de entero
        // no hay una funci�n exactamente para potencia de enteros
        // sino que se hace la multiplicaci�n manual a * a * ... * a  N veces
        // al hacer los c�lculos no se requiere casteo
        int x3 = x * x * x;
        int x2 = x * x;
        int y = a * x3 + b * x2 + c * x + d;

        // calculo directo sin variables intermedias
        int z = a * (x * x * x) + b * (x * x) + c * x + d;

        System.out.println( "en aritm�tica entera a* x^3 + b * x^2 + c * x + d evaluado en x = " + x + " = " + y);

        System.out.println( "Sin variables intermedias vale " + z);
    }
}
