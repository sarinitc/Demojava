import java.util.Scanner;
public class Apply_Scanner {
    public static void main(String[] args) {
    // State have Username , Email, Role, Password.
    // behavior have getInfo
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name :");

    String Username= sc.nextLine();
    System.out.println("Enter you Email:"  );
    String Email= sc.nextLine();
    System.out.println("Enter your Role:");
    String Role= sc.nextLine();
    System.out.println("Enter your Password:");
    String Password= sc.nextLine();
   System.out.println("UserName:"+ Username);
   System.out.print("Email:"+ Email);
   System.out.println("Role:"+ Role);
   System.out.println("Password:"+ Password);

}}
