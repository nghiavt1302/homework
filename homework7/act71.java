package homework7;

public class act71 {
        public static void main (String []args){
            int arr[] = new int[5];
            try {
                arr[5] = 4;
                System.out.println("arr[5] = " + arr[5]);
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Nhap sai chi so mang. ");
            }
            try {
                int zero = 0;
                int average = 10 / zero;
                System.out.println("Average = " + average);
            }
            catch (ArithmeticException e){
                System.out.println("Khong the chia cho 0.");
            }
            String obj = null;
            try {
                System.out.println(obj.length());
            }
            catch (NullPointerException e){
                System.out.println("String chua co gia tri.");
            }
            finally {
                System.out.println("Finished!");
            }
        }
}
