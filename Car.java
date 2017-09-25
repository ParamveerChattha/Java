public class Car
{
  private String color;
  private int maxspeed;
  public String carInfo ()
{
  return color + " colored car has max speed of " + maxspeed;
}
Car(String carColor, int speedLimit){
  this.color= carColor;
  this.maxspeed = speedLimit;
}
}
