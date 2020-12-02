package Day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Day1/input.txt"));
        int answer = 0;
        int answer2 = 0;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            int number = Integer.parseInt(line);
            number = number / 3 - 2;
            answer += number;
            while(number > 0){
                answer2 += number;
                number = number / 3 - 2;
            }
        }
        System.out.println(answer);
        System.out.println(answer2);
    }
}
