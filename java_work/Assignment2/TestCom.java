class Complex
{
  double real;
  double imaginary;

  //default constructor
  Complex()
  {
   System.out.println("constructor called");
    this.real=3.5;
    this.imaginary=5.5;
  }

  //parameterized constructor
  Complex(double r,double i)
  {
    System.out.println("parameterized constructor called");
    this.real= r;
    this.imaginary= i;
  }

// setter method

  void setReal(double r)
  {
    this.real=r;
  }
  void setImaginary(double i)
  {
    this.imaginary=i;
  }

//getter method

 double getReal()
 {
   return this.real;
 }
 double getImaginary()
 {
   return this.imaginary;
 }

 void display()
 {
  System.out.println(this.real+ "+"  +this.imaginary+ "i");
 }

}//complex ends here

class TestCom
{
  public static void main(String[] a)
  {
    Complex c1;  //reference
    c1 = new Complex();
   
    Complex c2;
    c2 = new Complex(4.5,4.5);
    
    c1.display();
    c2.display();
  }
}