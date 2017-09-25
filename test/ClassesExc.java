import java.util.Map;
import java.util.Collections;
import java.util.ArrayList;
interface type{
  void rectangle();
  void square();
  void triangle();
}
abstract class Area implements type{
  int l,b,area,hyp;
public void rectangle(){
    area =  l*b;
    System.out.println("this is rectangle and area is : " + area);
  }
  public void square(){
    area = l*l;
    System.out.println("this is square and area is "+ area);
  }
}
class last extends Area{
  //int hyp,l,b;
  public last(int hyp, int length,int breadth){
    this.hyp=hyp;
    this.l=length;
    this.b=breadth;
  }
  public void triangle(){
    area = hyp*b/2;
    System.out.println("this is triangle and area is " +area);
  }
}
interface Calculations{
  void minMarks(String name,int marks);
}
abstract class formula implements Calculations{
  int marks,max=9999;
  String name;
  public void minMarks(String name,int marks)
  {
    if( marks < max)
    max =marks;
    System.out.println(max);
  }
}
class last1 extends formula{
  public last1(){

  }
  public last1(String name, int marks){
    this.name=name;
    this.marks=marks;
  }
  void show(){
  System.out.println("name from maps class : " + name);
    }
  //System.out.println("marks are " + marks  + " " + output + " " +name);
  // Map<String,Integer> details = new HashMap<>();
  // details.put(name,marks);
  }


public class ClassesExc{
  public static void main(String args[]){
    //type areObj =  new Area(5,7);
    type lastObj = new last(5,4,6);
    lastObj.rectangle();
    lastObj.square();
    lastObj.triangle();

    last1 objz1 = new last1("Jango",45);
    last1 objz2 = new last1("Crime Master Dogo",71);
    last1 objz3 = new last1("zogo",60);
    last1 objz4 = new last1("Tango",16);
    last1 objz = new last1();
    objz1.show();
    }
}
