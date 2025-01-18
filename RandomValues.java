import java.util.Random;
public class RandomValues {
    public static void main(String[] args) {
        Random rand = new Random(); 
	int[] randomValues = new int[5];
        for (int i = 0; i < 5; i++) {
            randomValues[i] = rand.nextInt(900) + 100;
        }
        System.out.println("Random values:");
        for (int value : randomValues) {
            System.out.println(value);
        }
        int minValue = randomValues[0];
        int maxValue = randomValues[0];
        for (int value : randomValues) {
            if (value < minValue) {
                minValue = value;
            }
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}
