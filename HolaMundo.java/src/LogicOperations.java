public class LogicOperations {
    public static void main(String[] args) {
        int a = 8, b = 5;

        //Operadores de igualdad
        System.out.println("a es igual a b? -> " + (a == b));
        System.out.println("a es diferente de b? -> " + (a != b));
        //Operadores relacionales
        System.out.println("a es mayor a b? -> " + (a > b));
        System.out.println("a es menor que b? -> " + (a < b));
        System.out.println("a es mayor o igual a b? -> " + (a >= b));
        System.out.println("a es menor o igual que b? -> " + (a <= b));

        if (a==b) {
            System.out.println("a es igual a b");
        }else if((a!=b) && (a < b)) {
            System.out.println("a es diferente y menor a b");
        }else if(a > b) {
            System.out.println("a es mayor a b");
        } else {
            System.out.println("Default...");
        }
    }
}
