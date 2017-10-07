import java.util.*;
class Input{
  String Key,Value;
  Map<String,String> Details = new LinkedHashMap<>();
  Map<String,String> finalOutput= new LinkedHashMap<>();
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
    List<String> keyList = new ArrayList<>();
    List<String> valList = new ArrayList<>();
    Set<String> detailsKey = Details.keySet();
    int size= detailsKey.size();
    System.out.println(size);
    for(String Key : detailsKey ){
      keyList.add(Key);
      valList.add(Details.get(Key));
      //System.out.println(locKey + " : "+ locValue);
//      System.out.println(Key + " : " +Details.get(Key));
      }
      // for(String x: keyList)
      // {System.out.println(x);}
      // for(String y: valList)
      // {System.out.println(y);}
      //If the entries are even
      if(size%2==0){
        String tempVal1,tempVal2;
        for(int i=0;i<size;i++){
          tempVal1 = valList.get(i+1);
          tempVal2 = valList.get(i);
          finalOutput.put(keyList.get(i),tempVal1);
          i++;
          finalOutput.put(keyList.get(i),tempVal2);
        }
        Set<String> fKey = finalOutput.keySet();
        for(String Key : fKey)
        {
  //        System.out.println(Key + " " + finalOutput.get(Key));
        }
      }
      /* if the entiries are odd but, on left and right
        of middle element are even number of elements */
      else if(size%2==1 && (size/2)%2==0){
        String tempVal1,tempVal2;
        for(int i=0;i<(size-1);i++){
          if(i!=((size/2))){
          tempVal1 = valList.get(i+1);
          tempVal2 = valList.get(i);
          finalOutput.put(keyList.get(i),tempVal1);
          i++;
          finalOutput.put(keyList.get(i),tempVal2);
            }
          else{
              tempVal1 = valList.get(size/2);
              finalOutput.put(keyList.get(size/2), tempVal1);
          }
      }
        Set<String> fKey = finalOutput.keySet();
        for(String Key : fKey)
        {
  //        System.out.println(Key + " " + finalOutput.get(Key));
        }
      }
      /* if the entiries are odd but, on left and right
        of middle element are odd number of elements */
      else{
        String tempVal1,tempVal2;
        for(int i=0;i<=(size-2);i++){
          tempVal1 = valList.get(i+1);
          tempVal2 = valList.get(i);
          i++;
          if(i==((size/2)+1)){
              tempVal1 = valList.get(size/2);
              finalOutput.put(keyList.get(size/2), tempVal1);
          }
            if(i!=((size/2))){
            tempVal1 = valList.get(i+1);
            tempVal2 = valList.get(i);
            finalOutput.put(keyList.get(i),tempVal1);
            i++;
            finalOutput.put(keyList.get(i),tempVal2);
              }
        }
      }
        Set<String> fKey = finalOutput.keySet();
        for(String Key : fKey)
        {
          System.out.println(Key + " " + finalOutput.get(Key));
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
