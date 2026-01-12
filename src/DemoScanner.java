import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        // what is Scanner ?
        // Scanner is used to take input from the user.
        //first should import file >> import java.util.Scanner;
        //Always at the top of the file.
        //Scanner sc= new Scanner (System.in);
        // Sc is Variable and System.in is Keyboard input
        // Data type Scanner method
        // int nextInt();
        // double next Double();
        // boolean nextBoolean();
        // char next().charAt(0);
        //String next ();
        // String(line) nextline();


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name :");

        String name= sc.nextLine();
        System.out.println("Enter your ID :");
        int id= sc.nextInt();


        System.out.println("Enter your age :");
        int age = sc.nextInt();
        System.out.println("Enter  your height:");
        double height = sc.nextDouble();
        System.out.println("Enter your gender(M/F):");
       char gender = sc.next().charAt(0);
        System.out.println("Are you a students ( true/fales)");
        boolean isStudent = sc.nextBoolean();
        System.out.println("\n----------------Hello-----------------");
        System.out.println("Name:"+ name);
        System.out.println("ID:"+ id);
        System.out.println("Age:"+ age);
        System.out.println("Height:"+ height);
        System.out.println("Gender:"+ gender);
        System.out.println("IsStudent:"+ isStudent);

    }
}
