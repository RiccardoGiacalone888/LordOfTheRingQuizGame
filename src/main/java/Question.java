public class Question {
    private String questions;
    private String answers;

    public Question(String question, String answer) {
        this.questions = question;
        this.answers = answer;
    }

    public String getQuestion() {
        return questions;
    }


    public String getAnswer() {
        return answers;
    }


    @Override
    public String toString() {
        return "Question{" +
                "question='" + questions + '\'' +
                ", answer='" + answers + '\'' +
                '}';
    }
}
