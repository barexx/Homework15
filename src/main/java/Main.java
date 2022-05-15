import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите расстояние в метрах: ");
        Distance.setDistance(in.nextDouble());
        Distance.print();
    }
}
