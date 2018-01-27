package Einstein;

public class QuestOneAnswer extends QuestOneResolution{
	
	private Double calculation;
	private String situation;
	private Double scoreTest;
	private double resultTest;
	
	public Double resultCalculation(Double scoreQuestion, Integer numberQuestion) {
		Integer i;
		Double sum = 0.0;
		for(i = 0 ; i < numberQuestion; i++) {
			sum += scoreQuestion;
		}
		resultTest = sum/numberQuestion;
		return sum;
	}
	
	public Double getCalculation() {
		return calculation;
	}
	public void setCalculation(Double calculation) {
		this.calculation = calculation;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}

}
