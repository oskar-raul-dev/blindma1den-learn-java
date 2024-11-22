public class DiceThrowing {

    // funci�n que simula el lanzamiento de un dado
    public static int diceThrow(int low, int high) {
        double random = Math.random();
        return (int)Math.floor(low + (high - low) * random);
    }

    public static int diceTrhowGenerated(int low, int high){
        return (int) Math.floor(low + (high - low) * Math.random());
    }

    public static void main(String[] args){
        // rand = un aleatorio uniforme (cualquier valor
        // tiene lai misma probabilidad de caer) entre 0 y 1

        // para generar un aleatorio entre a y b enteros
        // u = un aleatorio uniforme entre 0 y 1
        // aleatorio entero =  tomo la parte entera (a + (b - a)* u)
        // para n�meros positivos la funci�n floor devuelve la parte entera del n�mero
        int randomDice = diceThrow(1, 6);
        System.out.println("El dado arroj� " + randomDice);

        int inferior = 1;
        int superior = 6;
        int randomDice2 = diceTrhowGenerated(1, 6);
        int randomDice3 = diceTrhowGenerated(1, 6);



    }


}
