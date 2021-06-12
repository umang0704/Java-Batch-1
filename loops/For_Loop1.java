package loops;

public class For_Loop1 {

    public static void main(String[] args) {
        //break or continue
        for (int i = 1; i < 20; i++) {
            if (i % 4 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
