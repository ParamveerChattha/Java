
public class HealthInsuranceSurveyor implements HealthInsuranceSurveyorInterface {
	Claim c;
	public HealthInsuranceSurveyor(Claim c) {
		this.c = c;
	}
	
	public boolean Response(Claim claim) {
		return true;
	}
	
}
