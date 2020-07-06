package sh224aw_assign3.person;

/**
 * Assignment-3, exercise-2, main class
 *
 * @author Sophia Hjörnhede
 * @version 1.10 06 July 2020
 */

public class PersonMain {

    public static void main(String[] args) {
        // Building class objects
        Person person1 = new Person("Olle1 Olleson", "Göteborg", "123-234-12", "Olle@gmail.com");
        System.out.println(person1.toString());
        Student student1 = new Student("Olle2 Olleson", "Göteborg", "123-234-12", "Olle@gmail.com", "junior");
        System.out.println(student1.toString());
        Employee employee1 = new Employee("Kenny Benny", "New York","+231-335-11","Kenny@mail.com",2000.00,"2010-01.01");
        System.out.println(employee1.toString());
        Faculty faculty1 = new Faculty("Joe ken","Berlin","+32 23 422","233ff@mail.com",12000,"2002-01-01","8-12","Rank 1");
        System.out.println(faculty1.toString());
        Staff staff1 = new Staff("James Bond","London","+23 23 54 222","ShakenNotSirred@gmail.com",70000,"1951-01-01","Agent");
        System.out.println(staff1.toString());
    }
}
