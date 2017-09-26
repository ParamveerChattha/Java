import java.util.*;
class Input{
  String Key,Value;
  Map<String,String> Details = new HashMap<>();
  Scanner sc = new Scanner(System.in);
  public void read(){
  System.out.println("enter empty string to end");
  for(int i=0;;i++){
  Key = sc.nextLine();
  Value = sc.nextLine();
  if (Key.equals("") || Value.equals(""))
    break;
//  System.out.println(valueof(Key));
  Details.put(Key,Value);
    }
    Set<String> detailsKey = Details.keySet();
    for(String Key : detailsKey ){
    //  System.out.println(Key + " : " +Details.get(Key));
}
}
  public void Revert(){
    read();
    String locKey,locValue;
    int count =0;
    Set<String> detailsKey = Details.keySet();
    int size= detailsKey.size();
    System.out.println(size);
    for(String Key : detailsKey ){
      count ++;
          locKey= Details.get(Key);
          locValue= Key;
          if(size%2==1 && count == ((size/2)+1))
            {
            locKey=Key;
            locValue=Details.get(Key);
            }
      System.out.println(locKey + " : "+ locValue);
//      System.out.println(Key + " : " +Details.get(Key));
  }
}
}
class MapChange {

  public static void main(String args[]){
    Input userInput = new Input();
//    userInput.read();
    userInput.Revert();
  //System.outprintln();
}
}
