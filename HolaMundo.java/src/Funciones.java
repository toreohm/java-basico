public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo
        //pi * r2
        System.out.println(areaCirculo(y));

        //Area de una esfera
        //4*PI*r2
        System.out.println(areaEsfera(y));

        //Volumen de una esfera
        //(4/3) * pi * r3
        System.out.println(volumenEsfera(y));

        System.out.println("Pesos Mexicanos a Dolar: " + convertToDolar(100, "MXN"));
    }

    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio,2);
    }

    public static double areaEsfera(double radio) {
        return 4 * Math.PI * Math.pow(radio,2);
    }

    public static double volumenEsfera(double radio) {
        return (4/3) * Math.PI * Math.pow(radio,3);
    }
    /**
     * Descripción: Función que espicificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Sólo acepta MXN o COP
     * @return Devuelve la cantidad actualizada en dolares
     * */
    public static double convertToDolar(double quantity, String currency) {
        double resultado;
        switch (currency) {
            case "MXN":
                resultado = quantity * 0.052;
                break;
            case "COP":
                resultado = quantity * 0.00031;
                break;
            default:
                resultado = 0.0;
                break;
        }
        return resultado;
    }
}
