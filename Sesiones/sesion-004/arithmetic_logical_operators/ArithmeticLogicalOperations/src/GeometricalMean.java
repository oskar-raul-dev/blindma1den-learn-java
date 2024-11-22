public class GeometricalMean {
    public static void main(String[] args){
        // media geométrica = raíz-n del producto
        // raíz-n  de un valor = valor elevado a la 1/n

        double n1 = 23;
        double n2 = 35.4;
        double n3 = 12.5;
        double n4 = 45.8;
        double n5 = 90.5;

        double product = n1 * n2 * n3 * n4 * n5;
        double mean = Math.pow(product, 1.0 / 5.0);
        System.out.println("Media geometrica = " + mean);

    }
}
