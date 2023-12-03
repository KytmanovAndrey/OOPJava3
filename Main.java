import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "aab", "aab", "aab");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        StudentGroupService service = new StudentGroupService(studentGroup);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFIO()) {
            System.out.println(student);
        }
//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//        System.out.println();
//        for(Student student : studentGroup){
//            System.out.println(student);

        Student student5 = new Student(4, "aab", "aab", "aab");
        Student student6 = new Student(2, "aaa", "aaa", "aaa");
        Student student7 = new Student(3, "Aaa", "Aaa", "Aaa");
        List<Student> studentList2 = new ArrayList<>();
        StudentGroup studentGroup2 = new StudentGroup(studentList2);
        studentGroup2.addStudent(student5);
        studentGroup2.addStudent(student6);
        studentGroup2.addStudent(student7);

        List<StudentGroup> studentGroupList = new ArrayList<>();
        studentGroupList.add(studentGroup);
        studentGroupList.add(studentGroup2);

        List<StudentGroup> studentGroupList2 = new ArrayList<>();
        studentGroupList2.add(studentGroup);

        Stream stream = new Stream(studentGroupList);
        Stream stream2 = new Stream(studentGroupList2);

        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream);
        streamList.add(stream2);
        for (Stream streams : streamList) {
            System.out.println(streams);
        }

        System.out.println("---------После сортировки потоков по размеру----------");

        StreamService streamService = new StreamService(streamList);
        streamService.getSortedStreamBySize(streamList);

        for (Stream streams : streamList) {
            System.out.println(streams);
        }
    }
}