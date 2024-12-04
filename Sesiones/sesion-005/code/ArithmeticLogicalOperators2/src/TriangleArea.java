import java.util.Scanner;

public class TriangleArea {

    public static double calculateArea(double base, double height) {
        return (base * height) / 2.0;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("input base in cm: ");
        double base = s.nextDouble();
        System.out.print("input height in cm: ");
        double height = s.nextDouble();
        System.out.printf("Triangle area = %.3f cm^2", calculateArea(base, height));
    }

}
