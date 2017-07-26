/**
 * Created by David Turk on 7/26/17.
 */
public class Teacher extends SchoolMember {
    private int id;

    public Teacher() {
        this.id = SchoolMember.id++;
    }

    public Teacher(String firstName, String lastName, int grade) {
        super(firstName, lastName, grade);
        this.id = SchoolMember.id++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
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

        Teacher teacher = (Teacher) o;

        return id == teacher.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}