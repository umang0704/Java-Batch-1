package arrays;

class Students {

    private String name;

    Students(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class Arr_NonPrimitive {

    public static void main(String[] args) {
        Students s1 = new Students("Rahul");
        Students s2 = new Students("Aman");
        Students s3 = new Students("Khushi");

        Students[] a = new Students[3];
        a[0] = s1;
        a[1] = s2;
        a[2] = s3;

        Students[] b = {s1, s2, s3};

        for (Students x : b) {
            System.out.println(x.getName());
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i].getName());
        }

    }

}
