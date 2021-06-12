 
package oops;

class Society {

    int rooms = 2;
    int kitchen = 1;
    int hall = 1;
    //static variable is allocated with only one memory for all the objects, and if any object modifies
    //the value of the static variable then the value is changed for all the object.
    
    //static variable can be called using class name, because the memory of static variable is allocated at 
    //the time of class loading.
    
    //an individual class is only loaded once in whole program
    
    //can be called using class name
    static int park = 1;

    void show() {
        System.out.println("room" + rooms);
        System.out.println("kitchen" + kitchen);
        System.out.println("hall" + hall);
        System.out.println("park" + park);
    }
}

public class OOP5_StaticVariable1 {

    public static void main(String[] args) {
        System.out.println(Society.park);
       // System.out.println(Society.room);
        
//        Society a = new Society();
//        a.show();
//        System.out.println("------------------------");
//        Society b = new Society();
//        b.show(); 
//        b.park = 0;
//        System.out.println("------------------------");
//        a.show();
//        System.out.println("------------------------");
//        b.show();

    }

}
