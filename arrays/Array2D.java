package arrays;

public class Array2D {

    public static void main(String[] args) {
        int[][] a = new int[2][3];
        int[][] b = {{2, 3, 4},
        {2, 2, 2},
        {2, 3}};
        for (int[] i : b) {
            for (int y : i) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }
        
        int[][][] c =new int[3][3][3];
        for(int[][] x : c){
            for(int[] y: x){
                for(int z : y){
                    System.out.print(z);
                }
                System.out.println("");
            }
                System.out.println("");
        }
    }
}
