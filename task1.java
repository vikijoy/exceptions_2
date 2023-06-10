package exceptions_2;

import java.util.Scanner;

public class task1 {


    public static void main(String[] args) {
        System.out.println(inputFloat());
    }

    private static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ввод дробного числа (типа float)");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные");
            }
            scanner.close();
        }
    }
}

