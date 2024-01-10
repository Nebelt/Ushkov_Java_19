import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Составить алгоритм: если введенное число больше 7, то вывести “Привет”
        taskOne();

//        Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
        taskTwo();

//        Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
        taskThree();

//        Дана скобочная последовательность: [((())()(())]]
//        - Можно ли считать эту последовательность правильной?
//                - Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной?
        taskFour();
    }

    public static void taskOne() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean test = false;
        while (!test) {
            try {
                System.out.println("Введите число:");
                number = scanner.nextInt();
                test = true;
            } catch (Exception e) {
                System.out.println("С числом что-то не так");
                scanner.next();
            }
        }
        if (number > 7) System.out.println("Привет");
    }

    public static void taskTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void taskThree() {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] % 3 == 0) System.out.print(array[i] + " ");
        }
    }

    public static void taskFour() {
        /*
         * Последовательность неправильная.
         * Правильные:
         * [[((()))()(())]]
         * [(())()(())]
         */
    }
}
