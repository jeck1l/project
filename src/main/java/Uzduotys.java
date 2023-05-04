public class Uzduotys {

    public static void main(String[] args) {
        String[] tekstas1 = {"as", "labai", "esu", "nusivyles", "savimi", "sorry", "Edgarai", ":D"};

        String ilgiausiasZodis1 = "";
        int ilgiausiaEilute = 0;

        for (int i = 0; i < tekstas1.length; i++) {
            String zodis2 = tekstas1[i];
            int zodis3 = zodis2.length();

            if (zodis3 > ilgiausiaEilute) {
                ilgiausiasZodis1 = zodis2;
                ilgiausiaEilute = zodis3;
            }
        }

        System.out.println("Ilgiausias žodis: " + ilgiausiasZodis1);
    }

    public static boolean tekstoEilute(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException i) {
            return false;
        }
    }
}
