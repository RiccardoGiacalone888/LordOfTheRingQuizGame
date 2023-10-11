import org.junit.Test;
import static org.junit.Assert.*;

public class QuizGameTest {

    @Test
    public void testQuizGameAddQuestion() {
        QuizGame quizGame = new QuizGame();
        int initialSize = quizGame.getQuestions().size();

        quizGame.getQuestions().add(new Question("Test Question", "Test Answer"));
        int newSize = quizGame.getQuestions().size();

        assertEquals(initialSize + 1, newSize);
    }


}
