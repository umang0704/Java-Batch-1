package oops;

class Flat {
    int room = 2;
    int kitchen = 1;
    int hall = 1;
}

public class Oops1 {
    public static void main(String[] args) {
        Flat f1 = new Flat();
        System.out.println(f1.room);
        System.out.println(f1.kitchen);
        System.out.println(f1.hall);
    }
}
