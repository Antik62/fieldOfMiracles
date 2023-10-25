import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void readLetters(String[] userWord, int[] arrayOfPoint) {

        Scanner scanner = new Scanner(System.in);
        boolean gameIsOver = false;
        while (!gameIsOver) {
            drum(arrayOfPoint); // вращение барабана
            System.out.print("Игрок № " + 1 + " называйте букву:");
            String letter = scanner.nextLine();
            switch (letter) {
                case "В":
                    userWord[0] = "[В]";
                    System.out.println("Есть такая буква!");
                    break;
                case "Ы":
                    userWord[1] = "[Ы]";
                    System.out.println("Есть такая буква!");
                    break;
                case "Х":
                    userWord[2] = "[Х]";
                    userWord[4] = "[Х]";
                    System.out.println("Есть такая буква! Аш 2 раза");
                    break;
                case "У":
                    userWord[3] = "[У]";
                    System.out.println("Есть такая буква!");
                    break;
                case "О":
                    userWord[5] = "[О]";
                    System.out.println("Есть такая буква!");
                    break;
                case "Л":
                    userWord[6] = "[Л]";
                    System.out.println("Есть такая буква!");
                    break;
                case "Ь":
                    userWord[7] = "[Ь]";
                    System.out.println("Есть такая буква!");
                default:
                    System.out.println("Вы ввели букву, которой нет в слове!");
                    break;
            }
            for (String i : userWord)
                System.out.print(i);
            if ("[В]".equals(userWord[0])
                    && "[Ы]".equals(userWord[1])
                    && "[Х]".equals(userWord[2])
                    && "[У]".equals(userWord[3])
                    && "[Х]".equals(userWord[4])
                    && "[О]".equals(userWord[5])
                    && "[Л]".equals(userWord[6])
                    && "[Ь]".equals(userWord[7])) {
                System.out.println("Игрок № " + 1 + " отгадал все буквы!");
                gameIsOver = true;
            }
        }
    }
    public static void drum(int[] arrayOfPoint) {
        System.out.println("Игрок № " + 1 + " вращайте барабан");

        int rnd = new Random().nextInt(arrayOfPoint.length);

        System.out.println("На барабане " + arrayOfPoint[rnd] + " очков, буква... ");

    }

    public static void main(String[] args) {
        // Количество игроков
//        Scanner scannerPlayer = new Scanner(System.in);
//        System.out.println("Введите количество игроков");
//        int pl = scannerPlayer.nextInt();

        //Объявление типов данных, функций
        String[] word = {"В", "Ы", "Х", "У", "Х", "О", "Л", "Ь"};
        String[] userWord = new String[8];
        int[] arrayOfPoint = {100, 500, 1000};
        int[][] checkPoint = {{1,0}, {1,0}};

       // массив интов ходишь или не ходишь и второй сумма очков с точки зрения грамотного кода получше


        System.out.println("Добрый вечер! Я диспетчер, с Вами капитал-шоу Поле чудес!");

        System.out.println("Перед нами " + 3 + " утырка, которые будут отвечать на следующий вопрос:" +
                "Какое животное из отряда Куньих, также известно как - Водяной крот?");


        readLetters(userWord, arrayOfPoint);//введение букв



    }


}


