public class Uzduotys {

    public static void main(String[] args) {
        String[] tekstas1 = {"as", "labai", "esu", "nusivyles", "savimi", "sorry", "Edgarai", ":D"};

        String longestWord = "";
        int longestWordLength = 0;

        for (int i = 0; i < tekstas1.length; i++) {
            String currentWord = tekstas1[i];
            int currentWordLength = currentWord.length();

            if (currentWordLength > longestWordLength) {
                longestWord = currentWord;
                longestWordLength = currentWordLength;
            }
        }

        System.out.println("Ilgiausias žodis: " + longestWord);
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
