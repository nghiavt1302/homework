package homework.Homework9;

import java.io.*;
import java.util.Scanner;
import java.util.SplittableRandom;

public class act95 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap duong dan toi file: ");
        String duongDan = scanner.nextLine();

        FileReader fileReader = new FileReader(duongDan);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String i = "";
        String text = "";

        while ((i= bufferedReader.readLine()) !=null ) {
            text = text + " " + i ;
        }
        String text2 = text.trim();
        String[] words = text2.split(" ");
        int y;
        for (y = 0; y < words.length-1; y++){
            if (words[y].length() > words[y+1].length()) {
                words[y+1] = words[y];
            }
        }
        System.out.println(text2);
        System.out.println("The longest word is: " + words[y]);

        fileReader.close();
        bufferedReader.close();
    }
}

