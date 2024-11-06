public class CourseGrades implements Analyzable {

    // Array to hold GradedActivity objects
    private GradedActivity[] grades = new GradedActivity[4];

    // Setters for each activity
    public void setLab(GradedActivity lab) {
        grades[0] = lab;
    }

    public void setPassFailExam(PassFailExam passFailExam) {
        grades[1] = passFailExam;
    }

    public void setEssay(Essay essay) {
        grades[2] = essay;
    }

    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    // Calculate the average score
    @Override
    public double getAverage() {
        double total = 0.0;
        for (GradedActivity grade : grades) {
            total += grade.getScore();
        }
        return total / grades.length;
    }

    // Return the highest score
    @Override
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];
        for (GradedActivity grade : grades) {
            if (grade.getScore() > highest.getScore()) {
                highest = grade;
            }
        }
        return highest;
    }

    // Return the lowest score
    @Override
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];
        for (GradedActivity grade : grades) {
            if (grade.getScore() < lowest.getScore()) {
                lowest = grade;
            }
        }
        return lowest;
    }

    // toString method to display scores and grades
    @Override
    public String toString() {
        return String.format(
                "Lab Score: %.1f\n  Grade: %c\n\n" +
                        "Pass/Fail Exam Score: %.1f\n  Grade: %c\n\n" +
                        "Essay Score: %.1f\n  Grade: %c\n\n" +
                        "Final Exam Score: %.1f\n  Grade: %c\n",
                grades[0].getScore(), grades[0].getGrade(),
                grades[1].getScore(), grades[1].getGrade(),
                grades[2].getScore(), grades[2].getGrade(),
                grades[3].getScore(), grades[3].getGrade()
        );
    }
}
