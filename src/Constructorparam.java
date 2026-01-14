class Constructorparam {
    String brand;
    int year;

    int id;
    String name;
    double score;

    // Parameterized constructor (Car)
    Constructorparam(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // No-arg constructor (default values for all)
    Constructorparam() {
        this.brand = "Unknown";
        this.year = 0;
        this.id = 0;
        this.name = "Unknown";
        this.score = 0;
    }

    // Parameterized constructor (Student)
    Constructorparam(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    void info() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Constructorparam c1 = new Constructorparam("Toyota", 2026);
        Constructorparam c2 = new Constructorparam();

        c1.display();
        System.out.println("===============================");
        c2.display();

        System.out.println("===============================");
        Constructorparam c3 = new Constructorparam();
        Constructorparam c4 = new Constructorparam(29, "CheavSarin", 79);

        c3.info();
        System.out.println("-------------------------------");
        c4.info();
    }
}
