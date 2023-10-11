import java.util.List;
import java.util.Scanner;

public class QuizGameEngine {
    private List<Question> questions;
    private int score;

    public QuizGameEngine(List<Question> questions, int score) {
        this.questions = questions;
        this.score = 0;
    }
    public void StartGame(){
        Scanner scanner = new Scanner(System.in);
        for (Question question: questions){
            System.out.println(question.getQuestion());
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(question.getAnswer())){
                System.out.println("Correct answer!");
            }else {
                System.out.println("Wrong answer, the right answer is: " + question.getAnswer());
            }
        }
        System.out.println("Final score " + score + "/" + questions.size());
    }
}
