package Chapter2.Clases_and_objects;

public class TapeDeck {
    boolean canRecord = false;
    void playTape() {
        System.out.println("tape playing");

    }

    void recordTape() {
        System.out.println("tape recording");

    }
}

class TapeDeckTest {
    public static void main (String[] args) {

        TapeDeck d = new TapeDeck();
        d.canRecord = true;
        d.playTape();
        
        if (d.canRecord) {
            d.recordTape();
        }
    }
}