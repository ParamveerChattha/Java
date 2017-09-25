import java.util.Arrays;
public class StudentSorter{
  public static void main(String args[]){
    //creating an array type object for Student and named it stuArr. 
    Student[] stuArr = new Student[4];
    stuArr[0] = new Student(1,25,"Rambo");
    stuArr[1] = new Student(2,31,"Mogambo");
    stuArr[2] = new Student(3,28,"Jango");
    stuArr[3] = new Student(3,29,"Hobango");
    //Passing the array and running the methods from Student.java file
    Arrays.sort(stuArr);
    System.out.println("dafault"+Arrays.toString(stuArr));

    Arrays.sort(stuArr, Student.AgeCompare);
    System.out.println("age compared" + Arrays.toString(stuArr));

    Arrays.sort(stuArr, Student.NameCompare);
    System.out.println("Name compared" + Arrays.toString(stuArr));
  }
}
