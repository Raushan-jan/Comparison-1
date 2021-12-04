import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        double double1 = scan.nextDouble();
        System.out.println("Введите второе число");
        float float1 = scan.nextFloat();
        if (double1 > float1) {
            System.out.println(double1 + " больше чем " + float1);
        }
        if (double1 < float1) {
            System.out.println(float1 + " больше чем " + double1);
        }
        if (double1 == float1) {
            System.out.println("числа равны");
        }
        long b = (long) double1;
        long c=(long) float1;
        System.out.println("Отбросить дробную часть "+b);
        System.out.println("Отбросить дробную часть "+c);
        System.out.println("Округлить "+Math.round(double1));
        System.out.println("Округлить "+Math.round(float1));
    }
}