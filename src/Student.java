/**
 * Created by David Turk on 7/26/17.
 */
public class Student extends SchoolMember {
    private int id;

    public Student() {
        this.id = SchoolMember.id++;
    }

    public Student(String firstName, String lastName, int grade) {
        super(firstName, lastName, grade);
        this.id = SchoolMember.id++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
