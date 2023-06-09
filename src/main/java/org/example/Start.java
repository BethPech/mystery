package org.example;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        boolean exit=false;
        int i;

        for (i = 0; i < 3; i++) {
            if (exit)
                break;

            System.out.println("Что нужно делать, когда видишь зеленого человечка?");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextLine()) {
                case "Переходить дорогу":
                    System.out.println("Правильно!");
                    exit = true;
                    break;
                case "Сдаюсь":
                    System.out.println("Правильный ответ: Переходить дорогу");
                    exit = true;
                    break;
                default:
                    System.out.println("Попробуй еще раз");
            }
        }
    }


}
