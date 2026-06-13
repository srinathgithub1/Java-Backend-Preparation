package Service;
import java.util.Scanner;

import Entity.Question;

public class QuestionService {
	
	Question[] questions=new Question[5];
	String[] selection=new String[5];
	
	public QuestionService() {
		
		questions[0]=new Question(1,"size of int","2","4","6","8", "4");
		questions[1]=new Question(2,"size of double","2","4","6","8", "8");
		questions[2]=new Question(3,"size of char","2","1","6","8", "2");
		questions[3]=new Question(4,"size of long","2","4","6","8", "8");
		questions[4]=new Question(5,"size of boolean","1","4","6","8", "1");
	}
	
	public void playQuiz() {
		
		for(int i=0;i<5;i++) {
			System.out.println("Question No-"+questions[i].getId() + ":" + questions[i].getQuestion());
			System.out.println("Option-1:"+questions[i].getOpt1());
			System.out.println("Option-2:"+questions[i].getOpt2());
			System.out.println("Option-3:"+questions[i].getOpt3());
			System.out.println("Option-4:"+questions[i].getOpt4());
			
			//Taking the answer from the user for the each question.
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Correct Answer:");
			selection[i]=sc.nextLine();
			
			System.out.println("-----------------------------------------");
		}
		
//		System.out.println("All Selected Answer by the user:");
//		for(String s:selection) {
//			System.out.println(s);
//		}
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
	
	
	
//	public void displayQuestions() {
////		for(int i=0;i<5;i++) {
////			System.out.println(questions[i].getId() + ". " + questions[i].getQuestion());
////			System.out.println("Option-1: "+questions[i].getOpt1());
////			System.out.println("Option-2: "+questions[i].getOpt2());
////			System.out.println("Option-3: "+questions[i].getOpt3());
////			System.out.println("Option-4: "+questions[i].getOpt4());
////			System.out.println("-----------------------------------");
////			
////			
////		}
//		
//		for(Question q:questions) {
//			System.out.println(q);
//		}
//	}

}
