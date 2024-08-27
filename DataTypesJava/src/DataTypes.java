public class DataTypes {
    public static void main(String[] args) {
        //Con int puedo crear un numero de hasta 10 digitos
        int n = 1234567890;
        //Para que lo reconozca como Long se pone una L mayuscula al final del tipo de dato
        long nLong = 1234567890123L;

        double nD = 123.456;
        //Para que no marque error se pone una F al final
        float nF = 123.456F;

        //A partir de java 10, se puede poner var y java infiere el tipo de dato

        var salary = 1000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var name = "Hector Maluy";
        var veredicto = true;
        System.out.println("Nombre: " + name + "\nSalary: " + totalSalary);
    }
}
