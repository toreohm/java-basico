public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];
        String[][] cities = new String[4][2]; // 4 * 2 = 8;
        // [["a", "b"], ["c", "d"], ["e", "f"], ["g", "h"]]; 4 * 2 = 8;

        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cup Cake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
        System.out.println(androidVersions[4]); // null

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.println(cities[i][j]);
            }
        }

        System.out.println();
        System.out.println();

        for (String[] pair : cities) {
            for (String name :pair) {
                System.out.println(name);
            }
        }
    }
}
