class Date
{
  int day,month,year;
  String dow;
 
  void setDay(int d)
  {
   this.day=d;
  }

 void setMonth(int m)
  {
   this.month=m;
  }

 void setYear(int y)
  {
   this.year=y;
  }

 void setDow(String str)
  {
   this.dow=str;
  }

}//date ends here

class Test
{
 public static void main(String[]arg)
 {
   Date d1;//reference
   d1=new Date();

   d1.setDay(13);
   d1.setMonth(12);
   d1.setYear(2004);
   d1.setDow("Monday");

   System.out.println("date:" +d1.day+ "/" +d1.month+ "/" +d1.year);
   System.out.println("week of ths day:" +d1.dow);
 }
}