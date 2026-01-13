import java.util.HashMap;

public class Animal {
    // state have name ,color,Eye_Color,Height,Length
    // Behavior have getName(), getColor(), getEye_Color, getHeight(), ComeHere();
    String name;
    String color;
    String Eye_Color;
    int height;
    int length;
    String come_here;
    public void name(){
        System.out.println("Enter your name here :"+ name);

    }
    public void color(){
        System.out.println("Enter your color here:"+ color);

    }
    public void eye_color(){
        System.out.println("Enter your Eye_Color here:"+ Eye_Color);

    }
    public void height(){
        System.out.println("Enter your Comehere:"+ height +"Cm");

    }
    public  void length(){
        System.out.println("Enter your Length here:"+ length+"Cm");
    }
    public void come_here(){
        System.out.println("Enter your comehere "+ come_here);
    }

}
