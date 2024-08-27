public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;
        if (isBluetoothEnabled) {
            //send file
            fileSended++;
            System.out.println("Archivo enviado!");
        } else {
            System.out.println("Por favor enciende tu Bluetooth para inciar la transferencia");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
