package sh224aw_assign3.person;

/**
 * Assignment-3, exercise-2
 *
 * @author Sophia Hjörnhede
 * @version 1.10 06 July 2020
 */

public class Employee extends Person {
    double salary;
    String dateHired;

    public Employee(double salary, String dateHired) {
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", dateHired='" + dateHired + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Employee(String name, String address, String phonenumber, String email, double salary, String dateHired) {
        super(name, address, phonenumber, email);
        this.salary = salary;
        this.dateHired = dateHired;
    }
}