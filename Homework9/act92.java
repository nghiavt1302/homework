package homework.Homework9;

import java.io.File;
import java.util.Scanner;

public class act92 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        File file = new File("//Nhap duong dan toi thu muc");
        String[] fileNameList = file.list();

        System.out.print("Input extensions: ");
        String extensions = scan.nextLine();
        for(int i = 0; i < fileNameList.length; i++){
            if (fileNameList[i].contains(extensions)){
                System.out.println(fileNameList[i]);
            }
        }
    }
}
