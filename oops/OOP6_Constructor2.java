package oops;

class Q{
    Q(){ this(3);
        System.out.println("Non Param");
        //this(3);
    }
    Q(int a){
        System.out.println("Param - int");
    }
    Q(boolean a){
        this();
        System.out.println("Param - boolean");
    }
}

public class OOP6_Constructor2 {

    public static void main(String[] args) {
        Q  o  =new Q(true);
    }
}
