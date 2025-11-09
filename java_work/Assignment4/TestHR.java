import java.util.Scanner;
 
  class HR
 {
    int id;
    String name;
    double salary;
    double commission;

 
 //default constructor
    HR() 
    {
        System.out.println("Constructor called");
        this.id         = 101;
        this.name       = "Default Name";
        this.salary     = 20000;
        this.commission = 2000;
    }
    
  //parametrzed constructor
    HR(int i,String n,double s,double c) 
    {
        System.out.println("parameterized Constructor called:");
        this.id         = i;
        this.name       = n;
        this.salary     = s;
        this.commission = c;
    }


        void display() 
    {
        System.out.println("-----------------------------");
        System.out.println(" HR Id          : " + this.id);
        System.out.println(" HR Name        : " + this.name);
        System.out.println(" HR Salary      : " + this.salary);
        System.out.println(" HR Commission  : " + this.commission);
    }
} 
//class HR ends here

class TestHR 
{
    public static void main(String[] args) 
    {
      
      Scanner sc = new Scanner(System.in);
      
        System.out.println("enter HR id:");
          int Id = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("enter HR Name:");
        String name = sc.nextLine();

        System.out.println("enter HR salary:");
        double salary = sc.nextDouble();
        
        System.out.println("enter HR commission:");
        double commission = sc.nextDouble();

        

        HR h1, h2;
        h1 = new HR();
        h2 = new HR(Id,name,salary,commission);

        h1.display();
        h2.display();

    }
}