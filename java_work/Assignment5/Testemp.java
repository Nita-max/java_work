class Employee
{
  int Id;
  String name;
  double salary;

  //default constructor 

  Employee()
  {
   this.Id=101;
   this.name="Nita";
   this.salary=30000;
  }

//parameterized constructor

 Employee(int i,String n,double s)
  {
   this.Id= i;
   this.name=n;
   this.salary=s;
  }


 void setId(int i){ this.Id=i;}
 void setName(String n){ this.name=n;}
 void setSalary(double s){this.salary=s;}

 int getId(){return this.Id;}
 String getName(){return this.name;}
 double getSalary(){return this.salary;}

void display()
 {
  System.out.println(" Employee Id    :" +this.Id);
  System.out.println(" Employee Name  :" +this.name);
  System.out.println(" Employee Salary:" +this.salary);
 }

}//Employee ends here

//------------------------class salesmanager-------------------

class SalesManager extends Employee
 {
    double incentive;
    int target;

   //default constructor
    SalesManager() 
    {
        super();
        System.out.println("Constructor called");
        this.incentive = 5000;
        this.target = 50;
    }

    //parameterized constructor 
    SalesManager(int i,String n,double s,double in,int t) 
    {
        super(i,n,s);
        System.out.println("parameterized Constructor called");
        this.incentive = in;
        this.target = t;
    }
    
    
    void display() {
        super.display();
        System.out.println(" Sales Manager Incentive :"  + this.incentive);
        System.out.println(" Sales Manager Target    :"  + this.target);
    }
}//sales manager ends here

//----------------admin--------------------------

class Admin extends Employee
{ 

  float allowance;

  //default constructor

  Admin()
  {
   super();
   System.out.println("Constructor called");
   this.allowance=2000;
  }

  //paramterized constructor
  Admin(int i,String n,double s,float a)
  {
   super(i,n,s);
   System.out.println("parameterized Constructor called");
   this.allowance= a;
  }
 
 void setAllowance(float a){this.allowance=a;}

 float getAllowance(){return this.allowance;}

  void display()
  {
   super.display();
   System.out.println(" Admin allowance:" +this.allowance);
  }

} //admin ends here


//-------------------------class HR-------------------------

class HR extends Employee
 {
    double commission;

   //default constructor
    HR() 
    {
        super();
        System.out.println("Constructor called");
        this.commission = 2000;
    }
    
  //parameterized constructor
    HR(int i,String n,double s,double c) 
    {
        super(i,n,s);
        System.out.println("parameterized Constructor called:");
        this.commission = c;
    }


        void display() 
    {
         super.display();
         System.out.println(" HR Commission  : " + this.commission);
    }
} // HR ends here

//------------------------------------------------------------------

class TestEmp
{
  public static void main(String[] a)
  {
   Employee e1 ;
   e1= new Employee ();

   e1.setId(101);
   e1.setName("nita");
   e1.setSalary(200000);
   e1.display();

   System.out.println("\n---------sales manager details------------------");
   SalesManager sm = new SalesManager(101,"monika",30000,7000,60);
   sm.display();

   System.out.println("\n---------admin details------------------");
   Admin ad = new Admin(105,"Nita",40000,6000);
   ad.display();

   System.out.println("\n---------HR details------------------");
   HR h = new HR(201,"gita",30000,7000);
   h.display();
  }

}
