public class Substring {
    public static void main(String[] args){
        String s = "Hello World";

        // substring con un solo par�metro
        // es de la posici�n N hasta el final de string
        String substring = s.substring(4);
        System.out.println("El substring desde la posici�n 4 = " + substring);

        // substring con un solo par�metros
        // va de la posici�n N hasta la posici�n M - 1
        // (Hasta la posici�n M "excluyente")
        String dirIP = "192.168.000.001";
        String secondByte = dirIP.substring(4, 7);
        System.out.println("El byte 2 de la direcci�n IP = " + secondByte);


    }
}
