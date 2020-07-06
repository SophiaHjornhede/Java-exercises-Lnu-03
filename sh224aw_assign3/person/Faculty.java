package sh224aw_assign3.person;

/**
 * Assignment-3, exercise-2
 *
 * @author Sophia Hjörnhede
 * @version 1.10 06 July 2020
 */

public class Faculty extends Employee{
    String officeHours;
    String rank;

    public Faculty(String name, String address, String phonenumber, String email, double salary, String dateHired, String officeHours, String rank) {
        super(name, address, phonenumber, email, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "officeHours='" + officeHours + '\'' +
                ", rank='" + rank + '\'' +
                ", salary=" + salary +
                ", dateHired='" + dateHired + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
