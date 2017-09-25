import java.util.Comparator;
public class SCByAgeAndName implements Comparator<Student>{
  public int compare(Student st1, Student st2){
    int flag = st1.getAge() - st2.getAge();
    if(flag == 0){
      flag = st1.getName().compareTo(st2.getName());
      if(flag ==0){
        flag = st1.getId() - (st2.getId());
        return flag;
      }
      else {
        return flag;
      	}
    }
    return flag;
  }
}
