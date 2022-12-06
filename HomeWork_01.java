
// 1.1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух 
// входящих массивов в той же ячейке. Если длины массивов не равны, 
// необходимо как-то оповестить пользователя.

// 1.2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух 
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
// оповестить пользователя. Важно: При выполнении метода единственное исключение, 
// которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.*;

public class HomeWork_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину первого массива: ");
        int size = input.nextInt();
        int array1[] = new int[size];
        if (array1.length == 0) {
            throw new RuntimeException("Первый массив не может быть пустым");
        }

        System.out.println("Введите элементы первого массива:");
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextInt();
        }
        System.out.print("Первый массив :");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array1[i]);
        }
        System.out.println();
        System.out.println("Введите длину второго массива: ");
        
        int size2 = input.nextInt();
        int array2[] = new int[size2];
        if (array2.length == 0) {
            throw new RuntimeException("Второй массив не может быть пустым");
        }

        System.out.println("Введите элементы второго массива:");
        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }
        System.out.println("Второй массив :");
        for (int i = 0; i < size2; i++) {
            System.out.print(" " + array2[i]);
        }
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }
        input.close();
        System.out.println();
        int[] res = subtraction(array1, array2);
        double[] res2= devision(array1, array2);
        System.out.println("Разница двух массивов равна" + Arrays.toString(res));
        System.out.println("Частное двух массивов равна" + Arrays.toString(res2));
    }

    public static int[] subtraction(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    public static double[] devision(int[] arr1, int[] arr2) {
        double[] result = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
