import java.util.Arrays;

public class ArithmeticMean<T extends Number> {
    private final T[] numbers;

    ArithmeticMean(T[] numbers) {
        this.numbers = numbers;
    }

    public double calculate() {
        double sum = 0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.length;
    }

    public void displayElements() {
        System.out.println(Arrays.toString(numbers));
    }

    public int countPositiveElements() {
        int count = 0;
        int halfIndex = numbers.length / 2;
        for (int i = halfIndex; i < numbers.length; i++) {
            if (numbers[i].doubleValue() > 0) {
                count++;
            }
        }
        return count;
    }
}
