package sh224aw_assign3.person;

/**
 * Assignment-3, exercise-2
 *
 * @author Sophia Hjörnhede
 * @version 1.10 06 July 2020
 */

public class Staff extends Employee {
    String title;

    // Building class objects
    public Staff(String name, String address, String phonenumber, String email, double salary, String dateHired, String title) {
        super(name, address, phonenumber, email, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                ", dateHired='" + dateHired + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
