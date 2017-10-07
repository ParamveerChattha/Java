class A{
  static String show(){
   return "in class A";
  }
}
class B extends A{
  static String show(){
    return "in class B";
  }
}
class C extends A{
  static String show(){
    return "in class C";
  }
}

class Bound<T>{
  private T t;
  public Bound(obj1 Obj1){
    this.Obj1=obj1;
  }
  public obj1 get(){
    return Obj1;
  }
  Bound boundObj = new Bound();
  B bObj = new B();
  Bound<String> classB = new Bound<String>(bObj.show());

  public static void main(String args[]){
  System.out.println(bObj.show());
  System.out.println("inside Bound");
}
}
