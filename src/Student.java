/* This class is responsible for
keeping track of student fees, name, id, grade, and fees paid.
*/

public class Student {

    private int id; // private to protect id from being accessed from outside student class.
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {

        // Fees for evry student is 30,000.
        // Fees paid initially is 0.

        feesPaid = 0;
        feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    // Not going to alter a student's name or id.

    public void setGrade(int grade) {

        this.grade = grade; // updating the grade from the student to the grade that is passed as an argument.

    }

    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name +
        "\nTotal fees paid thus far: " + feesPaid;
    }
}
