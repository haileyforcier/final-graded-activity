public class CourseGradesDemo {

    public static void main(String[] args) {

        // Graded activities
        GradedActivity lab = new GradedActivity();
        lab.setScore(85);

        PassFailExam passFailExam = new PassFailExam(20, 3, 70);

        Essay essay = new Essay();
        essay.setGrammar(25.0);  // 25 out of 30
        essay.setSpelling(15.0); // 18 out of 20
        essay.setCorrectLength(15.0); // 18 out of 20
        essay.setContent(20.0); // 28 out of 30

        FinalExam finalExam = new FinalExam(50, 10);

        // CourseGrades object and set grades
        CourseGrades courseGrades = new CourseGrades();
        courseGrades.setLab(lab);
        courseGrades.setPassFailExam(passFailExam);
        courseGrades.setEssay(essay);
        courseGrades.setFinalExam(finalExam);

        // Display results
        System.out.println(courseGrades);
        System.out.printf("Average Score: %.2f\n\n", courseGrades.getAverage());
        System.out.printf("Highest Score: %.1f\n\n", courseGrades.getHighest().getScore());
        System.out.printf("Lowest Score: %.1f\n\n", courseGrades.getLowest().getScore());
    }
}
