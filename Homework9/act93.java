package homework.Homework9;


import java.io.File;

import java.util.Scanner;

public class act93 {
    public static void main (String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input pathname: ");
        String pathname = scan.nextLine();

        File file = new File(pathname);
        boolean fileExists = file.exists();
            if (fileExists == true){
                System.out.println("This file: " + pathname + " exists");
            }
        else {
            System.out.println("File does not exists");

        }
    }
}
