package oops;

class Society {

    int rooms = 2;
    int kitchen = 1;
    int hall = 1;
    int park = 1;

    void show() {
        System.out.println("room" + rooms);
        System.out.println("kitchen" + kitchen);
        System.out.println("hall" + hall);
        System.out.println("park" + park);
    }
}

public class OOP5_StaticVariable {

    public static void main(String[] args) {
        Society a = new Society();
        a.show();
        System.out.println("------------------------");
        Society b = new Society();
        b.show();
        b.rooms = 1;
        System.out.println("------------------------");
        a.show();
        System.out.println("------------------------");
        b.show();

    }

}
