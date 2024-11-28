public class Substring {
    public static void main(String[] args){
        String s = "Hello World";

        // substring con un solo parámetro
        // es de la posición N hasta el final de string
        String substring = s.substring(4);
        System.out.println("El substring desde la posición 4 = " + substring);

        // substring con un solo parámetros
        // va de la posición N hasta la posición M - 1
        // (Hasta la posición M "excluyente")
        String dirIP = "192.168.000.001";
        String secondByte = dirIP.substring(4, 7);
        System.out.println("El byte 2 de la dirección IP = " + secondByte);


    }
}
