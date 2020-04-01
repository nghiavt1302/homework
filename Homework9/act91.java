package homework.Homework9;

import java.io.*;

public class act91 {
    public static void main (String[]args) throws IOException {
        File file = new File(//Nhap duong dan toi file);
        String [] fileNameList = file.list();
        for(int i = 0; i < fileNameList.length; i++){
            System.out.println(fileNameList[i]);
        }
    }
}
