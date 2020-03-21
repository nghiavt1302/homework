package homework.homework8;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class hackerrankques {
    public static void main (String [] args){
        List<Integer> L = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number of elements in L: ");
        int N = scan.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.print("Input " + N + " space-separated integers elements of L list: ");
        String elements = sc.nextLine();
        for (int i = 0; i < N; i++){
            String[] item = elements.split(" ");
            L.add(i, Integer.valueOf(item[i]));
        }

//        System.out.println("Input number of queries to perform on L: ");
//        int Q = scan.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert two space separated integers x, y and the value y must be inserted into L at index x: ");
        String insert = scanner.nextLine();
        String [] items = insert.split(" ");
        int pos = Integer.valueOf(items[0]);
        String value = items[1];
        L.add(pos, Integer.valueOf(value));

        System.out.println("Insert the index of number must be deleted: ");
        int delete = scan.nextInt();
        L.remove(delete);

        System.out.println(L);
    }
}
