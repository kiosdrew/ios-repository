package Einstein;

/**
 * @author Andrew 
 *
 */
public class QuestOneResolution {
	
	private String name;
	private Double scoreQuestion;
	private Integer numberQuestion;

	public String getName() {
		if (name != null || name != ""){
			return name;
		}else {
			return "Insira um nome!";
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getScore() {
		if(scoreQuestion == null) {
			return scoreQuestion = 0.0;
		}else {
			return scoreQuestion;
		}
	}

	public void setScore(Double scoreQuestion) {
		this.scoreQuestion = scoreQuestion;
	}
	
	public Integer getNumberQuestion() {
		return numberQuestion;
	}
	
	public void setNumberQuestion(Integer numberQuestion) {
		this.numberQuestion = numberQuestion;
	}
}
