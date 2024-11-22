public class InchesToCmConverter {
    // las constantes ayudan a mejorar la legibilidad
    // del c�digo
    public static final double IN_TO_CM_FACTOR = 2.54;

    public static void main(String[] args){
        // declaraci�n de variables
        double centimeters;
        double inches;

        // valor de entrada
        inches = 6.5D;

        // conversion
        // 1 pulgada = 2.54cm
        centimeters = inches * IN_TO_CM_FACTOR;

        // mostrar resultado
        System.out.println(inches + "in. = " + centimeters + " cm.");
    }
}
