public class Main {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.title = "Java OOP";
        b1.price= 10;
        b1.read();


        System.out.println("---------------------------------");
        Book b2 = new Book();
        b2.title = "HTML and CSS";
        b2.price= 30;
        b2.read();
        System.out.println("-----------------------------------");
        Car c= new Car();
        c.brand= "Toyota";
        c.color= "Black";
        c.speed= 240;
        // call the method
        c.drive();
        System.out.println("---------------------------------");
        //Second Car
        Car c2= new Car();
        c2.brand= "kamary";
        c2.color= "yellow";
        c2.speed= 300;
        // call the method
        c2.drive();

        Laptop l = new Laptop();
        l.brand= "Honda";
        l.ram= 36;
        l.info();
        System.out.println("------------------------------------");
        Laptop l1 = new Laptop();
        l1.brand= "Toyota";
        l1.ram= 16;
        l1.info();
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        Animal a= new Animal();
        a.name = "Tommy";
        a.color= "Green";
        a.Eye_Color = "Brown";
        a.height= 17;
        a.length= 35;
        a.come_here= "Aeon";
        a.name();
        a.color();
        a.eye_color();
        a.height();
        a.length();
        a.come_here();




System.out.println("+++++++++++++++++++++++++++++++++++");
classObject c4= new classObject();
        c4.name= "Sarin";
c4.age= 20;
c4.color= "Brown";
c4.eat();
c4.bark();
c4.sleep();

    }
}

// Getting Start Java Programming
// first write Hello world
//