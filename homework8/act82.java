package homework.homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class act82 {
    public static void main (String [] args){
        List<String> arrList = new ArrayList<>();
        arrList.add(0, "red");
        arrList.add(1,"green");
        arrList.add(2, "orange");
        arrList.add(3, "white");
        arrList.add(4, "black");
        System.out.println(arrList);
        String textAndPosition;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input text and position: ");
        textAndPosition = scan.nextLine();
        String[] item = textAndPosition.split(" ");
        String text = item[0];
        String position = item[1];
        arrList.add(Integer.valueOf(position), text);

        System.out.println(arrList);
    }
}
