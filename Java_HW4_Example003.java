package Homework.JAVA_HW4;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
Задача 3. Ермилов Артём, группа 6|3044.
 * * Напишите постфиксный калькулятор. Пользователь вводит данные и операции в
обратной польской записи. Калькулятор вычисляет результат и проверяет, что в стэке
получилось единственное число.
Например:
5 4 3 − + => 5 1 + => 6
 */

public class Java_HW4_Example003 {
    private static void clearConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Очистка консоли

    }

    static String inString(String text) // Ввод данных в формате String
    {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in, "cp866");
        String data = scanner.nextLine();
        scanner.close();
        return data;
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        clearConsole();

        String dataMath = "6 12 5 4 3 - + * /";

        String[] parsDataMath = dataMath.split(" ");

        Deque<Integer> dequeMathNumber = new ArrayDeque<>();

        Deque<String> dequeMathAttributes = new ArrayDeque<>();

        for (int index = 0; index < parsDataMath.length; index++) {

            if (isDigit(parsDataMath[index])) {
                dequeMathNumber.addLast(Integer.parseInt(parsDataMath[index]));
            } else
                dequeMathAttributes.addLast(parsDataMath[index]);
        }
        int result = 0;
        int lightDequeMathAttributes = dequeMathAttributes.size();
        for (int i = 0; i < lightDequeMathAttributes; i++) {

            switch (dequeMathAttributes.pollFirst()) {
                case "+":
                    result = dequeMathNumber.pollLast() + dequeMathNumber.pollLast();
                    dequeMathNumber.addLast(result);
                    break;
                case "-":
                    result = -dequeMathNumber.pollLast() + dequeMathNumber.pollLast();
                    dequeMathNumber.addLast(result);
                    break;
                case "*":
                     
                    result = dequeMathNumber.pollLast() * dequeMathNumber.pollLast();
                    dequeMathNumber.addLast(result);
                    break;
                case "/":
                    result =dequeMathNumber.pollLast() / dequeMathNumber.pollLast();
                    dequeMathNumber.addLast(result);
                    break;
                default:
                    break;

            }
        }

        System.out.println("Ответ = "+ dequeMathNumber);

    }

}
