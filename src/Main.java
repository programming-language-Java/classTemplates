public class Main {
    public static void main(String[] args) {
        // Пример использования для целочисленного массива
        Integer[] intArray = {5, 10, 15};
        ArithmeticMean<Integer> intMean = new ArithmeticMean<>(intArray);
        intMean.displayElements();
        double intAverage = intMean.calculate();
        System.out.println("Среднее арифметическое целочисленного массива: " + intAverage);

        // Пример использования для вещественного массива
        Double[] doubleArray = {2.5, 4.3, 6.1};
        ArithmeticMean<Double> doubleMean = new ArithmeticMean<>(doubleArray);
        doubleMean.displayElements();
        double doubleAverage = doubleMean.calculate();
        System.out.println("Среднее арифметическое вещественного массива: " + doubleAverage);

        // Вычисление количества положительных элементов во второй половине массива
        Integer[] array = {1, -2, 3, -4, 5, -6, 5};
        ArithmeticMean<Integer> arithmeticMean = new ArithmeticMean<>(array);
        int positiveCount = arithmeticMean.countPositiveElements();
        System.out.println("Количество положительных элементов во второй половине массива: " + positiveCount);
    }
}