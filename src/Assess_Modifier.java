public class Assess_Modifier {
    // state --> Username,Email, Role, Password
    // Behavior --> Register and GetInfo
    public String Username;
    private String  Email;
    protected String Role;
    String Password;
    public void Register( String name, String email, String role, String password){
        Username = name;
        Email = email;
        Role = role;
        Password = password;




    }
    public void GetInfo(){
        System.out.println("Name:" + Username);
        System.out.println("Email:" + Email);
        System.out.println(" Role:L" + Role);
        System.out.println("Password:"+ Password);


    }
}
