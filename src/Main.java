import org.jetbrains.annotations.Contract;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author mgumiero9
 */
public class Main {

        public static void main(String[] args) throws IOException {
            //int[] _numbers = {5, 1, 2, 3, 4, 5};
            Scanner in = new Scanner(System.in);

            final String fileName = "/home/mgumiero9/IdeaProjects/Anagram4/text.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            int res;

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

            bw.close();
        }

    static int sum(int[] numbers) {
        int result = 0;
        for (int number:numbers) {
            result += number;
        }
    return result;
    }
}
