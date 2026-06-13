package Service;
import java.util.Scanner;

import Entity.Question;

public class QuestionService {
	
	Question[] questions=new Question[5];
	String[] selection=new String[5];
	
	public QuestionService() {
		
		questions[0]=new Question(1,"size of int",new String[]{"2","4","6","8"}, "4");
		questions[1]=new Question(2,"size of double",new String[]{"2","4","6","8"}, "8");
		questions[2]=new Question(3,"size of char",new String[]{"2","1","6","8"}, "2");
		questions[3]=new Question(4,"size of long",new String[]{"2","4","6","8"}, "8");
		questions[4]=new Question(5,"size of boolean",new String[]{"1","4","6","8"}, "1");
	}
	
	public void playQuiz() {
		
		for(int i=0;i<5;i++) {
			System.out.println("Question No-"+questions[i].getId() + ":" + questions[i].getQuestion());
			//To get all the options
			String[] options=questions[i].getOpts();
			for(int j=0;j<options.length;j++) {
				System.out.println("Option-" + (j+1) + ": " + options[j]);
			}
			
			
			//Taking the answer from the user for the each question.
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Correct Answer:");
			selection[i]=sc.nextLine();
			
			System.out.println("-----------------------------------------");
		}
		
	}
	
	public void printScore() {
		int correctAnswer=0;
		int wrongAnswer=0;
		for(int i=0;i<5;i++) {
			if(selection[i].equals(questions[i].getAnswer())) {
				correctAnswer++;
			}else {
				wrongAnswer++;
			}
		}
		System.out.println("The Correct Answer=" + correctAnswer);
		System.out.println("The Wrong Answer=" + wrongAnswer);
	}

}
