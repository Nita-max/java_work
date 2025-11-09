import java.util.Scanner;

class SalesManager
 {
    int id;
    String name;
    double salary;
    double incentive;
    int target;

    SalesManager() 
   {
        System.out.println("Constructor called");
        this.id = 101;
        this.name = "Default Name";
        this.salary = 50000;
        this.incentive = 5000;
        this.target = 50;
    }
    
   SalesManager(int i , String n, double s, double c ,int t) 
   {
        System.out.println("parameterized Constructor called");
        this.id        = i;
        this.name      = n;
        this.salary    = s;
        this.incentive = c;
        this.target    = t;
    }


    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setIncentive(double i) {
        this.incentive = i;
    }

    void setTarget(int t) {
        this.target = t;
    }

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    double getIncentive() {
        return this.incentive;
    }

    int getTarget()
    { 
          return this.target;
    }

    void display()
   {
        System.out.println("--------------------------------------");
        System.out.println(" Sales Manager Id        : " + this.id);
        System.out.println(" Sales Manager Name      : " + this.name);
        System.out.println(" Sales Manager Salary    : " + this.salary);
        System.out.println(" Sales Manager Incentive : " + this.incentive);
        System.out.println(" Sales Manager Target    : " + this.target);
    }
}
//class SalesManager ends here

class TestSalesManager
 {
    public static void main(String[] args) 
   {
     Scanner sc = new Scanner (System.in);

     System.out.println ("enter Id:");
     int id = sc.nextInt();
   
     sc.nextLine();

     System.out.println ("enter name:");
     String n = sc.nextLine();
     
     System.out.println ("enter salary:");
     double salary = sc.nextDouble();
     
     System.out.println ("enter Incentive:");
     double incentive = sc.nextDouble();
      
     System.out.println ("enter target:");
      int target = sc.nextInt();


       SalesManager s1 = new SalesManager(id,n,salary,incentive,target);
       SalesManager s2 = new SalesManager(101,"moni",25000,2000,40);

       
        System.out.println("\n--- Sales Manager Details ---");
        s1.display();
        s2.display();
    }
}
//Class TestSalesManager ends here