public class LessSignificativeDigits {

    // Imprimir las 3 cifras menos significativas de un entero
    // sin usar string

    // Cifras menos significaticas, son las que est�n m�s a la derecha
    // Ejemplo: 1725   1 = La cifra m�s significativa
    // Ejemplo: 1725   5 = La cifra menos significativa

    // Si divido el n�mero entre 10, entre 100, y entre 1000, etc
    // y saco el residuo de la divisi�n, esta es la cifra en la posici�n N del n�mero
    //  si divido entre 10 = se saca la cifra menos significativa
    //  si divido entre 100 = se saca la segunda cifra menos significativa
    //  si divido entre 1000 = se saca la segunda cifra menos significativa
    // y as� sucesivamente si se divide entre 10 elevado a la N

    public static void main(String[] args){
            int n = 1725;
        int digit1, digit2, digit3;

        // cifra menos significativa
        // usamos el operador % o m�dulo o residuo
        digit1 = n % 10;
        System.out.println("N�mero = " + n);
        System.out.println("Cifra menos significativa =" + digit1);

        // segunda cifra menos significativa
        // 1) Dividir el n�mero entre 10
        //2) Al cociente se le saca la cifra menos significativa
        int quotient = n / 10;
        digit2 = quotient % 10;
        System.out.println("Segunda cifra menos significativa =" + digit2);


        // se repite el proceso para la tercera cifra menos significativa
        quotient = quotient / 10;
        digit3 = quotient % 10;
        System.out.println("Tecera cifra menos significativa =" + digit3);
    }
}
