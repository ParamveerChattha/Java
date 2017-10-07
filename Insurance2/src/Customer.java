
import java.util.Scanner;
public class Customer {
	int id;
	String name;
	int policyNumber;
	Claim c  = new Claim();
	Scanner sc = new Scanner(System.in);
	void Scan() {	
		System.out.println("Enther the id, name and PolicyNumber ");
	this.id = sc.nextInt();
	this.name = sc.next();
	this.policyNumber = sc.nextInt();
	c.setId(this.id);
	c.setName(this.name);
	c.setPolicyNumber(this.policyNumber);
	c.Show();
	}
	
	
	Surveyor<Claim> s = new Surveyor<Claim>();
	public boolean customerValidation() {
		System.out.println(c.getName() + " " + c.getId());
		return s.validate(c);
	}
	}
