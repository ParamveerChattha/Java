
public class Claim implements ClaimInterface {
	int id;
	String name;
	String date;
	public void getClaim(int id, String name, String date) {
		this.id=id;
		this.name=name;
		this.date=date;
		
	}
	
}