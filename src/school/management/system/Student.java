package school.management.system;
/**
 * this call is responsible for keep the track of students
 * fees,name,grade and fees paid
 */

public class Student {
//decleration of feild
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * to create a new student object by intializing vaules
     * fees for every student is $30,000
     * Fees paid intialally is 0.
     * @param id id for the student: unique.
     * @param name name of the student
     * @param grade grade of the student
     */
    //intilaize a field
    public Student(int id,String name,int grade){
        feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }
    //not going to alter student's name, student's id.

    /**
     * used to update the students's grade.
     * @param grade new grade of the student.
     */
    public void setGrade(int grade){
        this.grade=grade;
    }



    /**
     * add the fees to the fees paid.
     * Keep adding the fees to feesPaid feild.
     * the school id going to receive the funds.
     * @param fees the fees that student pays
     */
    public void updateFeesPaid(int fees){
        feesPaid+=fees;
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

}