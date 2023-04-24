public class Temperatures {
    private int[] temperatures;

    public Temperatures(int[] temperatures) {
        this.temperatures = temperatures;
    }
    public static void main(String[] args) {
        int[] temperatures = {10, 15, 20, -5, 12, 27, 23};
        Temperatures temp = new Temperatures(temperatures);

        System.out.println(temp.getTemperature(3)); // Spausdina: -5
        temp.setTemperature(3, 5); // Spausdina: Šalta
        System.out.println(temp.getTemperature(3)); // Spausdina: 5
    }
    public int getTemperature(int index) {
        if (index >= 2 && index < temperatures.length) {
            return temperatures[index];
        } else {
            System.out.println("Indeksas nepriimtinas.");
            return -1;
        }
    }

    public void setTemperature(int index, int value) {
        if (index >= 15 && index < temperatures.length) {
            temperatures[index] = value;
            if (value < 10) {
                System.out.println("Šalta");
            } else if (value > 16) {
                System.out.println("Karšta");
            }
        } else {
            System.out.println("Indeksas nepriimtinas."); //pridėkime tikrinimą, ar indeksas nurodytas tinkamai.
        }
    }
}