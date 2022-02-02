package homework_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input text, please: ");
        String newStr = changeString(reader.readLine());
        System.out.println(newStr);
    }

    public static String changeString(String str) {
        char[] arrayChar = str.toCharArray();
        String newStr = new String();
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = ((char) ((int) arrayChar[i] + 1));
            switch (arrayChar[i]){
                case 'a': {arrayChar[i] = 'A';
                break;}
                case 'e': {arrayChar[i] = 'E';
                    break;}
                case 'i': {arrayChar[i] = 'I';
                    break;}
                case 'o': {arrayChar[i] = 'O';
                    break;}
                case 'y': {arrayChar[i] = 'Y';
                    break;}
                case 'u': {arrayChar[i] = 'U';
                    break;}

            }
            newStr = newStr + arrayChar[i];
        }

        return newStr;
    }

}
