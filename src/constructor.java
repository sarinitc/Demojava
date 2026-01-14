class  constructor{
    String owner ;
    double balance;
    // No parameter constructor
    constructor(){
        owner= "Ly Mey";
        balance= 0;

    }
    // With parameter constructor
    constructor (String owner, double balance){
        this.owner= owner;
        this.balance= balance;

    }
    void display (){
        System.out.println("Owner:"+ owner);
        System.out.println("Balance:"+ balance + "$");

    }
    public  static  void main (String [] args){
        constructor c1 = new constructor();


        System.out.println("===========================================");
        constructor c2 = new constructor("Sarin",500);
        c1.display();
        System.out.println("===========================================");
        c2.display();

    }

}
// what is Constructor ?
// Constructor is a special method in java that is automatically called when an object is created.
// Constructor in java have tow
// with parameter and without parameter

