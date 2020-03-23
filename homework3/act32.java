package homework.homework3;

import java.util.Arrays;

public class act32 {
    public static void main(String[] args){
        int []arr1 = {1, 2, 3, 4};
        int []arr2 = {2, 5, 7, 8};
        int []arr = new int[arr1.length + arr2.length];

        for (int i = 0;i  < arr1.length; i++){
            arr[i] = arr1[i];
            arr[i+4] = arr2[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
