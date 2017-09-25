import java.util.Comparator;
public class Student implements Comparable<Student>{
private int age,id;
private String name;
public int getId(){
  return id;
}
public int getAge(){
  return age;
}
public String getName(){
  return name;
}

/*
public void setAge(int age){
  this.age=age;
}
public void setName(String name){
  this.name=name;
}
public void setId(int id){
  this.id=id;
}
*/
//Creating object for the class
public Student(int id, int age, String name){
  this.id=id;
  this.age=age;
  this.name=name;
}
// invoking compareTo for Comparator -> https://stackoverflow.com/questions/17688822/java-comparable-interface-comparetoobject-o-what-is-object-o
public int compareTo(Student s){
  //return(this.age - s.age);
  return 0;
}
//Displaying default sort
public String toString(){
  return "id=" + this.id + " name: " +this.name + " of age " + this.age;
}
//Comparing for the Age. using comparator. then calling 2 instances of Class. and thn returing the difference to the compare function
public static Comparator<Student> AgeCompare = new Comparator<Student>(){
  public int compare(Student s1, Student s2){
    return (int) (s1.getAge() - s2.getAge());
  }
};
// comparing Name
public static Comparator<Student> NameCompare = new Comparator<Student>(){
  public int compare(Student s1, Student s2){
    return s1.getName().compareTo(s2.getName());
  }
};
//Comparing the Id
public static Comparator<Student> IdCompare = new Comparator<Student>(){
  public int compare(Student s1, Student s2){
      return (int) (s1.getId() - s2.getId());
  }
};
}
