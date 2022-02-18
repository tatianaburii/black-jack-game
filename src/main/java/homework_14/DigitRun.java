package homework_14;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class DigitRun {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        new DigitService().print(inputData());
    }

    public static int[] inputData() throws IOException {
        System.out.println("Input numbers: ");
        String str = reader.readLine();
        return Arrays.stream(str.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }


}
