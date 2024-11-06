public class FinalExam extends GradedActivity {

    // Attributes
    private int numQuestions;  // Number of questions
    private double pointsEach; // Points for each question
    private int numMissed;     // Number of questions missed

    // Overload Constructor
    public FinalExam(int numQuestions, int numMissed) {
        double numericScore; // To calculate the numeric score

        // Set the numQuestions and numMissed fields
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;

        // Calculate the points for each question and
        // the numeric score for this exam
        pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (numMissed* pointsEach);

        // Call the supercall's setScore method to
        // set the numeric score
        setScore(numericScore);
    }

    // Methods
    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
