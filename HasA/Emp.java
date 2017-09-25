public class Emp{

  int id;
  String name;
  Address address;

  public Emp(int id, String name, Address address){

    this.id=id;
    this.name=name;
    this.address=address;
  }
void display(){
  System.out.println(id+ " "+name);
  System.out.println(address.city + " " + address.state + " " + address.country);
}
public static void main(String[] args){

  Address address1= new Address("CHD","PB","Kha^^^tan");
  Address address2=new Address("Mohali","PB","Kha^^^tan");
  Emp e1 = new Emp(123,"Cow",address1);
  Emp e2 = new Emp(124,"Majj",address2);

  e1.display();
  e2.display();
}
}
