import org.jetbrains.annotations.Contract;

/**
 * Created by David Turk on 7/26/17.
 */
public abstract class SchoolMember {
    protected static int id = 1;
    protected String firstName;
    protected String lastName;
    protected int grade;
    public SchoolMember() {
    }

    public SchoolMember(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
