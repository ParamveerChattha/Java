package com.param.assignmentMvn;
import java.util.*;
class Printer{
  //   String a = new String[];
  //  void printArray(String a){
  //    this.a=a;
  //   System.out.println(a);
  public static void main(String args[]){
    List<String> Input = new ArrayList<String>();
    System.out.println("enter the limit");
    Scanner Scan = new Scanner(System.in);
    int limit = Scan.nextInt();
    for(int i=0;i<=limit;i++){
      Input.add(Scan.nextLine());
    }
    for(String s: Input){
      System.out.println(s);
    }
    // prnt.printArray(Input);
  }
}
