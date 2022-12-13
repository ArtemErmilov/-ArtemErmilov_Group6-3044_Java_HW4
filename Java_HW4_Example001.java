package Homework.JAVA_HW4;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

/*
    Задача 1. Ермилов Артём, группа 6|3044.
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
“перевернутый” список.
 */

public class Java_HW4_Example001 {

    private static void clearConsole () throws IOException, InterruptedException
    { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Очистка консоли

    }
    public static void main(String[] args) throws IOException, InterruptedException {
        clearConsole();
        Random ran = new Random();

        LinkedList <Integer> linListInteger = new LinkedList<>();
        Deque <Integer> dequeListInteger = new ArrayDeque<>();

        for (int i = 0; i < 10; i++) {

            linListInteger.add(ran.nextInt(100));
        }

        System.out.println("Исходный список "+linListInteger);
        int lightLL = linListInteger.size();

        for (int i = 0; i < lightLL; i++) {

            dequeListInteger.addLast(linListInteger.poll());
           
            
        }
        

        int lightDL = dequeListInteger.size();

        for (int i = 0; i < lightDL; i++) {

            linListInteger.add(dequeListInteger.pollLast());
            
        }

        System.out.println("Перевёрнутый список"+linListInteger);
        
    }
    
}
