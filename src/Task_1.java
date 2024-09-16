import java.util.ArrayList;
import java.util.HashMap;

public class Task_1 {
    public static void main(String[] args) {
        StudentDirectory.addStudent("Sasha", 5);
        StudentDirectory.addStudent("Dasha", 5);
        StudentDirectory.findStudent("Sasha");
        StudentDirectory.addStudent("Dasha", 5);
        StudentDirectory.getAllStudents();
        StudentDirectory.removeStudent("Dasha");
        StudentDirectory.getAllStudents();


    }

    public class StudentDirectory {
        private static HashMap<String, ArrayList<Integer>> studentMap = new HashMap<>();

        public static void addStudent(String name, Integer grade) {
            studentMap.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);
        }

        public static ArrayList<Integer> findStudent(String name) {
            ArrayList<Integer> list = studentMap.getOrDefault(name, new ArrayList<>());
            System.out.println(list);
            return list;
        }

        public static HashMap<String, ArrayList<Integer>> getAllStudents() {
            System.out.println(studentMap);
            return studentMap;
        }

        public static void removeStudent(String name) {
            studentMap.remove(name);
        }

    }
}