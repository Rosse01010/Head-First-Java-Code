package Chapter2.Clases_and_objects;

public class EchoTestDrive{
    public static void main (String [] args) {
        Echo e1 = new Echo();
        //Clases_and_objects.Echo e2 = new Clases_and_objects.Echo();
        Echo e2 = e1;

        int x = 0;
        while (x < 4){
            e1.hello();
            e1.count = e1.count + 1;
            if (x==3) {
                e2.count = e2.count + 1;
            }
            if (x > 0){
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}

class Echo {
    int count = 0;
    void hello() {
        System.out.println("helooo...");

    }
}


