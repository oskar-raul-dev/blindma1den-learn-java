public class CmToInchesConverter {

    /**
     *  Convertir Cms a Inch
     *
     *
     */

    // variable est�tica e inmutable es una constante
    public static final double CM_TO_INCHES_FACTOR = 0.393701D;

    public static void main(String[] args){
        double centimeters;
        double inches;

        // cm a pulgadas se multiplica por 0.393701
        centimeters = 35D;

        // aplicamos la expresi�n aritm�tica
        inches = centimeters * CM_TO_INCHES_FACTOR;

        System.out.println(centimeters + " cm. = " + inches + "in.");
    }
}
