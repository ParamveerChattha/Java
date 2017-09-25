import java.util.*;
public class Comprble {

  public static void main(String args[]){
    List<Students> stud = new ArrayList<>();
    stud.add(new Students(3,21));
    stud.add(new Students(5,19));
    stud.add(new Students(11,20));
    stud.add(new Students(7,20));
    Collections.sort(stud);
    for (Students s : stud){
      System.out.println(s);
    }
  }
}
 class Students implements Comparable<Students>{
  int id,age;
  public Students(int id, int age){
      this.id=id;
      this.age=age;
    }
    // to override the existing default method. has to be done. otherwise it will
    //print the hashcode :/
    public String toString(){
      return "id no.: " + id  + "has age: " +age;
    }
    public int compareTo(Students s){
      return this.id>s.id?-1:this.id<s.id?1:-1;
    }

  }
