import com.sun.xml.internal.fastinfoset.util.CharArray;
import org.jetbrains.annotations.Contract;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author mgumiero9
 */
public class Main {

    private static String result = "";

    public static void main(String[] args) throws IOException {
            //int[] _numbers = {5, 1, 2, 3, 4, 5};
            //Scanner in = new Scanner(System.in);

            final String fileName = "/home/mgumiero9/IdeaProjects/Anagram/text.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            int res;

            /* This block reads numbers entry
            int _numbers_size = 0;
            _numbers_size = Integer.parseInt(in.nextLine().trim());
            int[] _numbers = new int[_numbers_size];
            int _numbers_item;
            for(int _numbers_i = 0; _numbers_i < _numbers_size; _numbers_i++) {
                _numbers_item = Integer.parseInt(in.nextLine().trim());
                _numbers[_numbers_i] = _numbers_item;
            }

            res = sum(_numbers);
            bw.write(String.valueOf(res));
            System.out.println(res);
            bw.newLine();

            bw.close();*/

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("type something:");
            String myEntry = bufferedReader.readLine();
            System.out.println(myEntry);

            int myLength = myEntry.length();

            int upperLetterConter = 0, lowerLetterConter = 0;
            for (int i = 0; i < myLength; i++) {
                upperLetterConter = myLength - i -1;
                lowerLetterConter = i;
                //System.out.println(lowerLetterConter + " " + upperLetterConter+ " " + myLength);
                if (myEntry.charAt(lowerLetterConter) != myEntry.charAt(upperLetterConter)) {
                    result = "It's Not a Palindrome";
                } else
                    result = "It's a Palindrome";
            }
            System.out.println(result);
        }

    static int sum(int[] numbers) {
        int result = 0;
        for (int number:numbers) {
            result += number;
        }
    return result;
    }
}
