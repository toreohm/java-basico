public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono $200
        salary = salary + 200;
        System.out.println("El salario es " +  salary);
        //pension: $50 descuento
        salary -= 50;
        System.out.println(salary);
        // 2 horas extra $30 c/u
        //cupon comida $45
        salary = salary + (30 * 2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String nameEmpleado = "Héctor Maluy";
        nameEmpleado = nameEmpleado + " Fernández";
        System.out.println(nameEmpleado);

    }
}
