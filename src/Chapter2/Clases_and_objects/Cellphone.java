package Chapter2.Clases_and_objects;

class Cellphone {
    String names;
    String model;
    short year;
    int rating;

    void buyIt() {
        System.out.println("Buying a Cellphone");
    }
}

class CellphoneTestDrive {
    public static void main(String[] args) {

    Cellphone one = new Cellphone();
    one.names = "Iphone";
    one.model = "Pro Max";
    one.year = 2023;
    one.rating = 4;

    Cellphone two = new Cellphone();
    two.names ="Sansum Galaxy";
    two.model ="Note";
    two.year =2024;
    two.rating =4;

    Cellphone tree = new Cellphone();
    tree.names = "Nokia";
    tree.model = "xz10";
    tree.year = 2024;
    tree.rating = 3;
    tree.buyIt();

}

  }


