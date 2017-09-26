// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Iterator;
import java.util.*;
//import java.util.Comparator;
public class Sort {

  public static void main(String args[]){
    // Comparator interface.
    Comparator<Integer> CL =(Integer o1, Integer o2) ->{
        return o1%10>o2%10?1:-1;
    };



    /* new Comparator<Integer>(){ // Anonymous class
      // we can use a class CompList (^) here and call the class CompList and
      // its code. but I have used the anaonymous class
      public int compare(Integer o1, Integer o2){
        // Calls the compare method, and passes two values.
        if(o1>o2)
          return 1;
        else
        return -1;
    }};
    */
    List<Integer> values = new ArrayList<Integer>();
      values.add(34);
      values.add(69);
      values.add(31);
      values.add(46);
    Collections.sort(values,CL);
    // Values as the array, <T> then the method ..
    System.out.println(values);
  }
}
