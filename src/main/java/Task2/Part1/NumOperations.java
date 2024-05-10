package Task2.Part1;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class NumOperations {
    public static void main(String[] args) throws IOException {
        numOperations();
    }

    public static void numOperations() {
        Vector<Integer> arr = new Vector<>();
        try {
            File file = new File("src/main/resources/num.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int line = scanner.nextInt();
                arr.add(line);
            }
            scanner.close();
            int[] list = new int[arr.size()];
            int pos = 0;
            for (int an : arr) {
                list[pos++] = an;
            }
            System.out.println("Минимальное: " + _min(list.length, list));
            System.out.println("Максимальное: " + _max(list.length, list));
            System.out.println("Сумма: " + _sum(list.length, list));
            System.out.println("Произведение: " + _mult(list.length, list));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }

    public static int _min(int len, int[] list) {
        int result = list[0];
        for (int i = 1; i < len; i++) {
            result = Math.min(result, list[i]);
        }
        return result;
    }

    public static int _max(int len, int[] list) {
        int result = list[0];
        for (int i = 1; i < len; i++) {
            result = Math.max(result, list[i]);
        }
        return result;
    }

    public static int _sum(int len, int[] list) {
        int result = list[0];
        for (int i = 1; i < len; i++) {
            result += list[i];
        }
        return result;
    }

    public static int _mult(int len, int[] list) {
        int result = list[0];
        for (int i = 1; i < len; i++) {
            result *= list[i];
        }
        return result;
    }
}