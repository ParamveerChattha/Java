// class Parent{
//   public Parent(int[] Id,String[] Name, int[] Age){
//     this.id=Id;
//     this.name=Name;
//     this.age=Age;
//   }
// }
public class Sorting{
  //String name,int age);

  public static void main(String args[]){
    // Parent idArr = new Sorting(id);
    // Sorting nameArr = new Parent(name);
    int id[]={21,20,25,22,24};
    String name[]={"Gone","John","Don","Don","Shawn"};
    int age[]={33,33,21,21,21};
int i=0,j=0;
int tempId=id[i];
String tempName=name[i];
int tempAge=age[i];
for(i=0;i<name.length;i++){
  name[j]=(name[j].toLowerCase());
}
for(i=0;i<id.length;i++){
  for (j=0;j<id.length;j++){

    if(age[i]>age[j]){
      tempId=id[i];
      tempName=name[i];
      tempAge=age[i];
      id[i]=id[j];
      name[i]=name[j];
      age[i]=age[j];
      id[j]=tempId;
      name[j]=tempName;
      age[j]=tempAge;
    }
    else{
      if(age[i]==age[j]){
    //    System.out.println("age=age");
    //    System.out.println(name[i].compareTo(name[j]));
        if((name[i].compareTo(name[j]))>0){
    //      System.out.println(name[i] + " is smaller than " + name[j]);
          tempId=id[j];
          tempName=name[j];
          tempAge=age[j];
          id[j]=id[i];
          name[j]=name[i];
          age[j]=age[i];
          id[i]=tempId;
          name[i]=tempName;
          age[i]=tempAge;
        }
    //      System.out.println(name[i] +" is at i  "+ i +" at j is " +name[j] + "j is "+ j );
        if((name[i].compareTo(name[j]))==0){
          if(id[i]>id[j]){
      //      System.out.println("id at "+i +"is "+ id[i]+ " and at "+ j+ " is"+ id[j] + name [i] + name[j]);
            tempId=id[j];
            tempName=name[j];
            tempAge=age[j];
            id[j]=id[i];
            name[j]=name[i];
            age[j]=age[i];
            id[i]=tempId;
            name[i]=tempName;
            age[i]=tempAge;

          }

        }

      }
    }
  }
}
i=0;
for (i=0;i<5;i++){
  System.out.println("age = " +age[i] +" Name is "+ name[i] +" and id is: "+ id[i] );
}
  //  System.out.println("hello");
}
}
