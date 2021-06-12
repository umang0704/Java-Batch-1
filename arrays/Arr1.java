package arrays;

public class Arr1 {
    public static void printArray(int[] a, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void printArray(Integer[] a, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        a[0] = 10;
        a[7] = 11;
//        a[8] = 12;
        printArray(a, 8);

        int[] b = new int[8];
        printArray(b, 8);

        System.out.println(a[2]);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        
        for(int c : a){
            System.out.println((char)(c+96));
        }

    }

}
