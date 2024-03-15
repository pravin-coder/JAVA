// Interface for sum operation
interface Summable {
    int sum(int[] numbers);
}

// Interface for average operation
interface Averagable {
    double avg(int[] numbers);
}

// Interface for percentage calculation
interface PercentageCalculable {
    double percentage(double obtained, double total);
}

// Class implementing all three interfaces
class Calculator implements Summable, Averagable, PercentageCalculable {
    @Override
    public int sum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    @Override
    public double avg(int[] numbers) {
        int sum = sum(numbers);
        return (double) sum / numbers.length;
    }

    @Override
    public double percentage(double obtained, double total) {
        return (obtained / total) * 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = calculator.sum(numbers);
        double avg = calculator.avg(numbers);
        double percentage = calculator.percentage(250, 500);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Percentage: " + percentage + "%");
    }
}
