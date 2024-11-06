public class PassFailExam extends PassFailActivity {
    // Attributes
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    // Overloaded Constructor
    public PassFailExam(int numQuestions, int numMissed, double minPassingScore) {
        super(minPassingScore);

        double numericScore;

        this.numQuestions = numQuestions;
        this.numMissed = numMissed;

        // Calculate the points for each question
        pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (numMissed * pointsEach);

        // Call the superclass getScore method
        setScore(numericScore);
    }

    // Method
    public int getNumQuestions() {
        return numQuestions;
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
