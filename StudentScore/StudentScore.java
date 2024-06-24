package StudentScore;

public class StudentScore {

	private String name;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	// alt + shift + s
	
	public StudentScore(String name, int scoreJava, int scoreWeb, int scoreAndroid) {
		// super(); - 상속
		this.name = name;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public String getName() {
		return name;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
