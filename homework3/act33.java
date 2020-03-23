package homework.homework3;

import java.util.Scanner;

public class act33 {
    public static void main (String []args){
        String text;
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a string: ");
        text = scan.nextLine();

        String[] items = text.split(" ");
        for (i = 0; i < items.length -1 ; i++){
            if (items[i].length() > items[i+1].length()){
                items[i+1] = items[i];
            }
        }
        System.out.println(items[i]);
    }
}
