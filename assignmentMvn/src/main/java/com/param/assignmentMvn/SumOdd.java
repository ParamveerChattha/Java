import java.util.*;

class SumOdd{

public static void main(String[] args){
  List <Integer> Numbs = new ArrayList<Integer>();
  System.out.println("enter the limit");
  Scanner Scan = new Scanner(System.in);
  int limit = Scan.nextInt();
  for(int i=0;i<limit;i++){
    Numbs.add(Scan.nextInt());
  }
  int count = 1;
  int sum=0;
  for(int i:Numbs){
    if (count%2==1){
      System.out.println("i is " + i);
      sum = sum+i;
    }
    count++;
  }
  System.out.println("the sum of odd = " + sum);

}
}
