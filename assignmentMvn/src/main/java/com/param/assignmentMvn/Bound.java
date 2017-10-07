package com.param.assignmentMvn;
import java.util.*;
//class A{
//  static String show(){
//   return "in class A";
//  }
//}
//class B extends A{
//  static String show(){
//    return "in class B";
//  }
//}
//class C extends A{
//  static String show(){
//    return "in class C";
//  }
//}
//
//class Bound<obj1>{
//  private obj1 Obj1;
//  public Bound(obj1 Obj1){
//    this.Obj1=obj1;
//  }
//  public obj1 get(){
//    return Obj1;
//  }
//  Bound boundObj = new Bound();
//  B bObj = new B();
//  Bound<String> classB = new Bound<String>(bObj.show());
//
//  public static void main(String args[]){
//  System.out.println(bObj.show());
//  System.out.println("inside Bound");
//}
//}
class Bound{
	public static void main(String args[]) {
List list = new ArrayList();
list.add("abc");
list.add(new Integer(5)); //OK
for(Object obj : list) {
	String str = (String) obj;
}
	}
}

