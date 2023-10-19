public class Main {
    public static void main(String[] args) {
        // ������ ������������� ��� �������������� �������
        Integer[] intArray = {5, 10, 15};
        ArithmeticMean<Integer> intMean = new ArithmeticMean<>(intArray);
        intMean.displayElements();
        double intAverage = intMean.calculate();
        System.out.println("������� �������������� �������������� �������: " + intAverage);

        // ������ ������������� ��� ������������� �������
        Double[] doubleArray = {2.5, 4.3, 6.1};
        ArithmeticMean<Double> doubleMean = new ArithmeticMean<>(doubleArray);
        doubleMean.displayElements();
        double doubleAverage = doubleMean.calculate();
        System.out.println("������� �������������� ������������� �������: " + doubleAverage);

        // ���������� ���������� ������������� ��������� �� ������ �������� �������
        Integer[] array = {1, -2, 3, -4, 5, -6, 5};
        ArithmeticMean<Integer> arithmeticMean = new ArithmeticMean<>(array);
        int positiveCount = arithmeticMean.countPositiveElements();
        System.out.println("���������� ������������� ��������� �� ������ �������� �������: " + positiveCount);
    }
}