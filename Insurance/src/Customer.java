
public class Customer implements CustomerInterface {
	String name;
	int id;
	int phoneNum;
	
	public void getDetails(String name, int num, int id) {
		this.name = name;
		this.id = id;
		this.phoneNum = num;
		System.out.println(" details of the customer");
	}
}
