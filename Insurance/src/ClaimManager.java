
public class ClaimManager implements ClaimManagerInterface {
	
	HealthInsuranceSurveyor hICObj = new HealthInsuranceSurveyor();
	HealthInsuranceSurveyor hIC;
	
	ClaimManager(HealthInsuranceSurveyor hIC){
		this.hIC = hIC;
	}
	
	public String ProcessResult() {
		if(hICObj.Response == true) {
		return "Claim has been processed";
		}
	}
	
}
