public class LyginiaiNelyginiaiSkaiciai {
    public static void main(String[] args) {
        int[] skaiciai = {1, 2, 3,};

        System.out.println("Lyginiai skaičiai:");
        for (int c = 0; c < skaiciai.length; c++) {
            if (skaiciai[c] % 2 == 0) {
                System.out.println(skaiciai[c]);
            }
        }

        System.out.println("Nelyginiai skaičiai:");
        for (int c = 0; c < skaiciai.length; c++) {
            if (skaiciai[c] % 2 != 0) {
                System.out.println(skaiciai[c]);
            }
        }
    }
}
