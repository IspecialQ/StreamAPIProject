import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Student> getStudentsList() {
        Course course1 = new Course("Manual testing basics");
        Course course2 = new Course("Test Analytics Fundamentals");
        Course course3 = new Course("Linux. Workstation");
        Course course4 = new Course("Web Application Testing");
        Course course5 = new Course("Java. Level 1");
        Course course6 = new Course("Java Core for Testers");
        Course course7 = new Course("Web UI test automation in Java");
        Course course8 = new Course("Computer networks. ");
        Course course9 = new Course("HTML/CSS for testers");
        Course course10 = new Course("Web Security");
        Course course11 = new Course("Logging Systems");



        Student student1 = new Student("Lloyd Atcheson", Arrays.asList(course1, course3, course8, course7, course9, course2));
        Student student2 = new Student("Barbara Moore", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Sherry Ferguson", Arrays.asList(course1, course7, course10));
        Student student4 = new Student("Derek Babcock", Arrays.asList(course1, course4, course8, course9, course3, course5));
        Student student5 = new Student("Amber Coleman", Arrays.asList(course1, course5, course9, course6, course2));
        Student student6 = new Student("Juan Arnold", Arrays.asList(course1, course3, course9));
        Student student7 = new Student("Charlene Fraser", Arrays.asList(course1, course6, course7, course5, course9));
        Student student8 = new Student("Bridget Lopez", Arrays.asList(course1, course2, course4));
        Student student9 = new Student("Evan Bargeman", Arrays.asList(course4, course7, course2));
        Student student10 = new Student("Kaden Chandter", Arrays.asList(course1, course1, course5));
        Student student11 = new Student("Stephen Walker", Arrays.asList(course6, course9, course3));
        Student student12 = new Student("Rosalyn Abramson", Arrays.asList(course7, course6, course5));
        Student student13 = new Student("Bryden Johnson", Arrays.asList(course8, course1, course3));
        Student student14 = new Student("Miriam Enderson", Arrays.asList(course9, course2));
        Student student15 = new Student("Alexander Goodman", Arrays.asList(course1, course3, course10));
        Student student16 = new Student("Harriet Bradshaw", Arrays.asList(course11, course9, course2, course10));
        Student student17 = new Student("Clarissa Flannagan", Arrays.asList(course6, course8, course3));
        Student student18 = new Student("Lewis Douglas", Arrays.asList(course11, course7, course4));
        Student student19 = new Student("Alan Albertson", Arrays.asList(course6, course10, course3));
        Student student20 = new Student("Sarah Benson", Arrays.asList(course3, course5, course7));



        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
                student8, student9, student10, student11, student12, student13, student14,
                student15, student16, student17, student18, student19, student20);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }

    private static List<Course> getListCourses() {
        return Arrays.asList (new Course("Manual testing basics"),
        new Course("Test Analytics Fundamentals"),
        new Course("Linux. Workstation"),
        new Course("Web Application Testing"),
        new Course("Java. Level 1"),
        new Course("Java Core for Testers"),
        new Course("Web UI test automation in Java"),
        new Course("Computer networks. "),
        new Course("HTML/CSS for testers"),
        new Course("Web Security"),
        new Course("Logging Systems"));

    }
}