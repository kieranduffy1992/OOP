package labsheet7.exercise2;

import java.util.Arrays;

public class Department {
    private String name;
    private Student[] students;

    public Department(String name, Student[] students){
        setName(name);
        setStudents(students);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {

        return Arrays.copyOf(students,students.length);
    }

    public void setStudents(Student[] students) {

        if(students!=null)
        {
            this.students= Arrays.copyOf(students,students.length);
        }
    }


    public String toString() {
        String str =  "\n\nName: " +getName()+
                "\nList of Students:";

        if(students==null)
        {
            str+="no students specified";
            return str;
        }

        for(int i =0;i< getStudents().length;i++)
        {
            str+=students[i]+" ";
        }
        return str;
    }
}
