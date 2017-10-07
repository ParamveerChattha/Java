package com.param.assignmentMvn;
import java.io.*;
import java.util.*;
class input{
  int num;
  public input(int number){
    this.num=number;
  }
  void check(){
    if(num ==0)
    {
      System.out.println("Please enter a valid number");
    }
    else if(num>=6 && num<=20)
      {
        System.out.println("Tom");
      }
    else if(num%2==1)
    {
      System.out.println ("Tom");
    }
    else if((num%2==0) && num<10)
    {
      System.out.println ("Jerry");
    }
    else if ((num%2==0) && num>24)
    {
      System.out.println ("Jerry");
    }
  }
}
public class Conditional{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    input inp = new input(num);
    inp.check();
  }
}
