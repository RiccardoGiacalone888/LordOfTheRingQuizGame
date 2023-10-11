import java.util.ArrayList;
import java.util.List;

public class QuizGame {
    public List<Question> questions;

    public QuizGame() {
        questions = new ArrayList<>();
        questions.add(new Question("What is the name of the One Ring's inscription?", "One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them."));
        questions.add(new Question("Who is the author of 'The Lord of the Rings'?", "J.R.R. Tolkien"));
        questions.add(new Question("What is the capital of Gondor?", "Minas Tirith"));
        questions.add(new Question("Who is the ruler of Rohan?", "King Théoden"));
        questions.add(new Question("What is the name of the land of the Elves?", "Lórien"));
        questions.add(new Question("Who is Frodo's loyal friend and companion throughout the journey?", "Samwise Gamgee"));
        questions.add(new Question("What creature is Gollum after he has possessed the One Ring for many years?", "A twisted and corrupted version of a hobbit"));
        questions.add(new Question("What is the primary objective of the Fellowship of the Ring?", "To destroy the One Ring by throwing it into the fires of Mount Doom."));
        questions.add(new Question("What is the name of the mountain where the One Ring must be destroyed?", "Mount Doom (Orodruin)"));
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
