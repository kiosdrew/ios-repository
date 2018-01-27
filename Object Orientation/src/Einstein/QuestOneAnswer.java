package Einstein;

public class QuestOneAnswer extends QuestOneResolution{
	
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
	
	
	
	public static void main(String[] args) {
		QuestOneAnswer score = (QuestOneAnswer) new QuestOneResolution();
		score.resultCalculation(9.1, 1);
		System.out.println("Notas" + score.getScoreQuestion());
	}
}
