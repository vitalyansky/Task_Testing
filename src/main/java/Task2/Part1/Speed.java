package Task2.Part1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Speed {

    public static long[] num;
    public static long[] time;

    public static void main(String[] args) throws IOException {
        long startTime;
        long endTime;
        num = new long[7];
        time = new long[7];
        for (int i = 1; i <= 7; ++i) {
            FileWriter writer = new FileWriter("src/main/resources/num.txt");
            Random random = new Random();
            for (int j = 0; j < 100000 * i; j++) {
                num[i - 1] = (long) Math.pow(10, i);
                int randomNumber = random.nextInt(100) + 1;
                writer.write(randomNumber + " ");
            }
            writer.close();

            startTime = System.currentTimeMillis();
            NumOperations.numOperations();
            endTime = System.currentTimeMillis();
            time[i - 1] = endTime - startTime;
            System.out.println(endTime - startTime);
        }
    }
}
