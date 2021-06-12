package oops;

class Society {
    static{
        System.out.println("Hi from static block 2");
    }
    //static block is executed at the time of class loading.
    static {
        rooms = 5;
        System.out.println("hi");
    }
    static int rooms;

    void show() {
        System.out.println("room" + rooms);
    }
}

public class OOP5_StaticBlock1 {

    public static void main(String[] args) {
        System.out.println(Society.rooms);
        System.out.println(Society.rooms);

    }

}
