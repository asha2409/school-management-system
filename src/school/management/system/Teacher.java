package school.management.system;

/**
 * this class is resonsible fot rreachers id ,name and salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * creates a new teacher object
     * @param id
     * @param name
     * @param salary
     */
    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    /**
     * @return the id of the teacher
     */
    public int getId() {
        return id;
    }
/**
 * @return name of the teacher
 */
    public String getName() {
        return name;
    }

    /**
     *
     * @return salary of the teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     * set the teachrers salary
     * * @param salary
     */
       public void setSalary(int salary) {
        this.salary = salary;
    }
}