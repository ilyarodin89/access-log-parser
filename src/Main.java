import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе целое число:");
        int number2 = new Scanner(System.in).nextInt();
        //выводим в консоль результаты арифметических операций
        System.out.println("Сумма:" + (number1 + number2));
        System.out.println("Разность:" + (number1 - number2));
        System.out.println("Произведение:" + (number1 * number2 ));
        System.out.println("Частное:" + ((double) number1 / number2 ));
    }
}
