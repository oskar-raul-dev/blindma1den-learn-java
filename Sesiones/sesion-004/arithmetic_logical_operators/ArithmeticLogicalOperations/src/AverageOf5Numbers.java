public class AverageOf5Numbers {

    public static void main(String[] args){
        double n1 = 23;
        double n2 = 35.4;
        double n3 = 12.5;
        double n4 = 45.8;
        double n5 = 90.5;

        // promedio = suma / cantidad valores
        final double avg = (n1 + n2 + n3 + n4 + n5) / (double)5;

        System.out.println("Promedio = " + avg);
    }
}
