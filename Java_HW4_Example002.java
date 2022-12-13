package Homework.JAVA_HW4;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
Задача 2. Ермилов Артём, группа 6|3044.
 * Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */

public class Java_HW4_Example002 {
    private static void clearConsole () throws IOException, InterruptedException
    { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Очистка консоли

    }

    private static void enqueue(LinkedList<Integer> listLL, Integer data) {

        listLL.add(data);

        
    }

    private static void dequeue(LinkedList<Integer> listLL) {

        listLL.removeFirst();

    }

    private static Integer first(LinkedList<Integer> listLL) {

        Integer data = listLL.getFirst();
        return data;
        
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        clearConsole ();
        
        LinkedList <Integer> newLinList = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {

            enqueue(newLinList, rand.nextInt(100));
            
        }

        System.out.println("Заполнение коллекции с помощью метода enqueue() "+ newLinList);

        dequeue(newLinList);

        System.out.println("dequeue()"+newLinList);

        System.out.println("first() = "+first(newLinList));

        


    }
}
