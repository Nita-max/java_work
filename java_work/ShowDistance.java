class Distance
{
  int km;
  int m;

  void setKm(int k)
  {
    this.km = k;
  }

  void setM(int meter)
  {
    this.m = meter;
  }
} // Distance ends here

class ShowDistance
{
  public static void main(String[] args)
  {
    Distance d1;
    d1 = new Distance();

    d1.setKm(5);
    d1.setM(250);

    System.out.println("Distance:= " + d1.km + " km " + d1.m + " m");
  }
}
