class SalesManager
{
  int id;
  String name;
  double salary,incentive;
  int target;

  void setId(int i)
  {
    this.id = i;
  }

  void setName(String n)
  {
    this.name = n;
  }

  void setSalary(double s)
  {
    this.salary = s;
  }

  void setIncentive(double inc)
  {
    this.incentive = inc;
  }

  void setTarget(int t)
  {
    this.target = t;
  }

} // SalesManager ends here


class PrintSales
{
  public static void main(String[] args)
  {
    SalesManager s1;
    s1 = new SalesManager();

    s1.setId(401);
    s1.setName("geeta");
    s1.setSalary(60000);
    s1.setIncentive(5000);
    s1.setTarget(10);

    System.out.println("Sales Manager ID: " + s1.id + "  Name: " + s1.name + "  Salary: " + s1.salary + "  Incentive: " + s1.incentive + "  Target: " + s1.target);
  }
}
