package com.param.assignmentMvn;
import java.util.*;
class Intake{
  Scanner sc = new Scanner(System.in);
  Map<String,Integer> mappedArr = new HashMap();
  List<String> Input = new ArrayList();
  public void read(){
    for(int i=0;;i++){
      String raw = sc.nextLine();
      if(raw.equals(""))
        break;
      Input.add(raw);
    }
  }
  public void Check(){
    read();
//    Collections.sort(Input, Collections.reverseOrder());
    for (String s: Input){
      int VowCount=0;
      for(int j=0;j<s.length();j++){
        char ch = s.charAt(j);
//        System.out.println("ch is: " +ch);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
              VowCount++;
          }
//      System.out.println("vowels in " + s + " " + VowCount);
      mappedArr.put(s,VowCount);

      }
      Set<String> mappedArrKey = mappedArr.keySet();
      for(String Key : mappedArrKey){
        System.out.println(Key + ":" +  mappedArr.get(Key));


      }
      }
}
  class VowelOrder{
  public static void main(String args[]){
    Intake in = new Intake();
    in.Check();
  }
}
