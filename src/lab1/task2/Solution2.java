package lab1.task2;

public class Solution2 {
    public static void main(String[] args) {
        University university1 = new University();
        university1.name = "UTM";
        university1.foundationYear = 1964;
        Student student1_1 = new Student("name1_1 surname1_1", 20, 9.5f);
        Student student2_1 = new Student("name2_1 surname2_1", 20, 9.1f);
        university1.students = new Student[]{student1_1, student2_1};


        University university2 = new University();
        university2.name = "ULIM";
        university2.foundationYear = 1991;
        university2.students = new Student[2];

        Student student1_2 = new Student("name1_2 surname1_2", 20, 7.9f);
        Student student2_2 = new Student("name2_2 surname2_2", 20, 8.2f);
        university2.students = new Student[]{student1_2, student2_2};

        University university3 = new University();
        university3.name = "USM";
        university3.foundationYear = 1946;
        university3.students = new Student[2];
        Student student1_3 = new Student("name1_3 surname1_3", 20, 8.9f);
        Student student2_3 = new Student("name2_3 surname2_3", 20, 8.2f);
        university3.students = new Student[]{student1_3, student2_3};

        University[] univ = new University[]{university1, university2, university3};
        float sum = 0.0f;
        int nrOfStudents = 0;
        for (University i : univ) {
            for (Student j : i.students) {
                sum += j.mark;
                nrOfStudents++;
            }
        }
        System.out.println(sum / nrOfStudents);
    }
}
