public class Casting {
    public static void main(String[] args) {
        //En un año ubicar 30 perritos
        //Cuantos perritos ubique al mes
        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);

        //Estimación
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //exactitud
        int a = 30, b = 12;
        System.out.println((double) a / b);

        double c = (double) a / b;  //A veces es necesario hacer manualmente el casting, para que de 2.5
                                    // en lugar de 2.0
        System.out.println(c); // 2.5

        char n = '1';
        int nI = n; //Se hace casting automatico, pero ¿Qué imprime?
        System.out.println(nI); //49

        short nS = (short) n; //Un char no cabe en un short por lo que el casting se tiene que hacer manual
        System.out.println(nS);
    }
}
