import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuizGame quizGame = new QuizGame();
        List<Question> quizQuestions = quizGame.getQuestions();
        QuizGameEngine gameEngine = new QuizGameEngine(quizQuestions, 0);
        gameEngine.StartGame();
    }
}
