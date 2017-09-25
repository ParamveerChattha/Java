import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Maps{
  public static void main(String args[]){
    Map<Integer,String> Student = new HashMap<>();
        Student.put(3,"Gagu");
        Student.put(4,"Zorra");
        Student.put(5,"Gagu");
        Student.put(3,"Jeyonna");
        Student.put(2,"Gagu");
        Set<Integer> studentKey = Student.keySet();
        for(Integer key: studentKey){
        System.out.println(Student.get(key));
      }
  }
}
