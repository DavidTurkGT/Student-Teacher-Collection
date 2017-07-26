import java.util.*;

/**
 * Created by David Turk on 7/26/17.
 */
public class Main {
    public static void main(String[] args) {
        //Create 15 first graders and add them to an ArrayList<Student>
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 0; i < 15; i++) { students.add(new Student("student"+i,"lastname"+i,1)); }
        //Create 3 teacher and add them to an ArrayList<Teacher>
        ArrayList<Teacher> teachers = new ArrayList<>();
        for(int i = 0; i < 3; i++) { teachers.add(new Teacher("teacher"+i,"lastname"+i,1)); }
        Map<Teacher,Set<Student>> classes = new HashMap<>();
        for(int i = 0; i < 3; i++){
            Set<Student> classMembers = new HashSet<>();
            for(int j = 0; j < 5; j++){
                classMembers.add( students.get( (i*5)+j ) );
            }
            classes.put(teachers.get(i), classMembers);
        }
        for( Teacher teacher : classes.keySet() ){
            System.out.println("Here is the roster for the teacher " + teacher.getFirstName() + " " + teacher
                    .getLastName()
                    + ":");
            for(Student student : classes.get(teacher)){
                System.out.println("\t"+student);
            }
        }
    }
}
