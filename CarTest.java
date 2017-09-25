public class CarTest
{
  public static void main(String[] args)
  {
    Car mustang = new Car("blue",390);
    Car thar = new Car("Black", 160);
    System.out.println(mustang.carInfo());
    System.out.println(thar.carInfo());
  }
}
