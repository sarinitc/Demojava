 class Employees {
    private  int id;
    private  String name;
    private  String position;
    private  double salary;

    Employees(){
        int id = 0;
        String name= "Unknown";
        String  position = "Unassigned";
        double salary= 0;


    }
    Employees (int id , String name, String position, double salary){
        this.id=id;
        this.name=name;
        this.position= position;
        this.salary= salary;


    }
    void displayEmployees(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+ name);
        System.out.println("Position:"+ position);
        System.out.println("Salary:"+ salary);

    }
    void increaseSalary(double percent){
        salary= salary + ( salary * percent/100);
    }
    public  static  void main (String [] args){
        Employees E= new Employees();
        Employees E1 = new Employees(1,"CheavSarin","Student",900);
        Employees E2 = new Employees(1 ,"CheavSarin","Student",9000);
        E.displayEmployees();
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        E1.displayEmployees();
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("After salary increase:");
        E2.increaseSalary(10);
        E2.displayEmployees();


    }

}
