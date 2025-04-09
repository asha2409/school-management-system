package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the school which manages
 * many teachers and students using ArrayLists
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * Initialize school with empty lists and 0 money
     */
    public School() {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     * @return list of teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Add a teacher to the school
     * @param teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Add a student to the school
     * @param student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @return total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Update money earned by the school (from student fees)
     * @param moneyEarned money to add
     */
    public void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * @return total money spent by the school (teacher salaries)
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update money spent by the school (paying teacher salaries)
     * @param moneySpent money spent on salaries
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }
}
