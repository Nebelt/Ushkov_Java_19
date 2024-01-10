import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ��������� ��������: ���� ��������� ����� ������ 7, �� ������� �������
        taskOne();

//        ��������� ��������: ���� ��������� ��� ��������� � ��������, �� ������� �������, ��������, ���� ���, �� ������� "��� ������ �����"
        taskTwo();

//        ��������� ��������: �� ����� ���� �������� ������, ���������� ������� �������� ������� ������� 3
        taskThree();

//        ���� ��������� ������������������: [((())()(())]]
//        - ����� �� ������� ��� ������������������ ����������?
//                - ���� ����� �� ���������� ������ ����, �� ��� ���������� � ��� ��������, ���� ��� ����� ����������?
        taskFour();
    }

    public static void taskOne() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean test = false;
        while (!test) {
            try {
                System.out.println("������� �����:");
                number = scanner.nextInt();
                test = true;
            } catch (Exception e) {
                System.out.println("� ������ ���-�� �� ���");
                scanner.next();
            }
        }
        if (number > 7) System.out.println("������");
    }

    public static void taskTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���:");
        String name = scanner.nextLine();
        if (name.equals("��������")) {
            System.out.println("������, ��������");
        } else {
            System.out.println("��� ������ �����");
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
         * ������������������ ������������.
         * ����������:
         * [[((()))()(())]]
         * [(())()(())]
         */
    }
}
