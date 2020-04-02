package homework.Homework9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class act94 {
    public static void main (String []args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap duong dan toi file: ");
        String duongDan = scanner.nextLine();

        FileInputStream fis = new FileInputStream(duongDan);
        try{
            int i=0;
            while (true){
                i=fis.read();
                if (i!=-1){
                    System.out.print((char)i);
                }

            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        finally {
            fis.close();
        }

    }
}
