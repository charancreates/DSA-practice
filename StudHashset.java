import java.util.*;

public class StudHashset {
    public static void main(String[] args) {
        Set<student> studentSet = new HashSet<>();

        studentSet.add(new student("yoyo", 3));
        studentSet.add(new student("virat", 2));
        studentSet.add(new student("virat", 2));
        studentSet.add(new student("abd", 1));
        studentSet.add(new student("gayle", 3));

        System.out.println(studentSet);
    }
}
