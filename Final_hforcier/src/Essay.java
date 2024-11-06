public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    public void setGrammar(double grammar) {
        this.grammar = Math.min(grammar, 30);
        setScore();
    }

    public void setSpelling(double spelling) {
        this.spelling = Math.min(spelling, 20);
        setScore();
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = Math.min(correctLength, 20);
        setScore();
    }

    public void setContent(double content) {
        this.content = Math.min(content, 30);
        setScore();
    }

    private void setScore() {
        double totalScore = grammar + spelling + correctLength + content;
        super.setScore(totalScore); // Call setScore from GradedActivity
    }
}

