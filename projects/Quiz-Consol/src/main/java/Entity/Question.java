package Entity;

import java.util.Arrays;

public class Question {
	
	private int id;
	private String question;
	private String opts[];
	private String answer;
	public Question(int id, String question, String[] opts, String answer) {
		super();
		this.id = id;
		this.question = question;
		this.opts = opts;
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getOpts() {
		return opts;
	}
	public void setOpts(String[] opts) {
		this.opts = opts;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", opts=" + Arrays.toString(opts) + ", answer="
				+ answer + "]";
	}
	

	
	
	
	
	
	

}
