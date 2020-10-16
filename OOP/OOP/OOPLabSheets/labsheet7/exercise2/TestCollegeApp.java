package labsheet7.exercise2;

public class TestCollegeApp {
    public static void main(String[] args) {

        Student student1 = new Student(154345,"Jake","Computing");
        Student student2 = new Student(234532,"Mary","Creative Media");
        Student student3 = new Student(453726,"Tommy","Computing");
        Student student4 = new Student(623456,"Peter","Creative Media");

        Student computingStudents[] = new Student[10];
        computingStudents[0] = student1;
        computingStudents[1] = student3;

        Student creativeStudents[] = new Student[10];
        creativeStudents[0] = student2;
        creativeStudents[1] = student4;

        Department computingDepartment = new Department("Computing",new Student[]{student1,student3});
        Department creativeDepartment = new Department("Creative Media", new Student[]{student2,student4});

        Department allDepartments[] = new Department[5];
        allDepartments[0] = computingDepartment;
        allDepartments[1] = creativeDepartment;

        Institute institute = new Institute("Institute of Technology Tralee",new Department[]{computingDepartment,creativeDepartment});

        System.out.println(institute);

        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudents());

        System.out.println("\n\nMoving Jake to creative media");

        creativeStudents[2] = student1;
        student1.setDepartment("Creative Media");
        computingStudents[0] = null;

        System.out.println(institute);


    }
}
