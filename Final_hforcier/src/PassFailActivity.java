public class PassFailActivity extends GradedActivity {

    // Attribute
    private double minPassingScore;

    // Constructor
    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }

    // This method overrides the GradedActivity method
    public char getGrade() {
        char letterGrade;

        if (super.getScore() >= minPassingScore) {
            letterGrade = 'P';
        } else {
            letterGrade = 'F';
        }

        return letterGrade;
    }
}
