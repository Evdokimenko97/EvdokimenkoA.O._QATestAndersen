import java.util.Scanner;

public class MultipleThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");

        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа массива: ");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for (int i : array) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(i);
            }
        }
    }
}
