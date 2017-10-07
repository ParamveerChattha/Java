
public class Claim {
	private int id;
	private String name;
	private int policyNumber;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	int getPolicyNumber() {
		return policyNumber;
	}
	void Show() {
	System.out.println(id + " " + name + " " + policyNumber);
	}
}
