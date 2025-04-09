package school.management.system;

public class Main {
    public static void main(String[] args) {
        // Create school
        School school = new School();

        // Add teachers
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        school.addTeacher(lizzy);
        school.addTeacher(melissa);

        // Add students
        Student asha = new Student(1, "Asha", 12);
        Student muskan = new Student(2, "Muskan", 10);
        school.addStudent(asha);
        school.addStudent(muskan);

        // Pay fees
        asha.updateFeesPaid(10000);
        school.updateTotalMoneyEarned(10000);
        
        muskan.updateFeesPaid(5000);
        school.updateTotalMoneyEarned(5000);

        // Pay teacher salaries
        school.updateTotalMoneySpent(lizzy.getSalary());
        school.updateTotalMoneySpent(melissa.getSalary());

        // Print school status
        System.out.println("School has earned $" + school.getTotalMoneyEarned());
        System.out.println("School has spent $" + school.getTotalMoneySpent());
        System.out.println("Current funds: $" + 
            (school.getTotalMoneyEarned() - school.getTotalMoneySpent()));
    }
}
