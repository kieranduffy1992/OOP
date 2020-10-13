package labsheet6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {

        String output = "*****Person Class Tester*****";
        String fName,lName;

        Person person1 = new Person();

        output+="\n\nCalling the person() constructor.....\nValue of the first person object is: " +
                person1.toString();

        fName = JOptionPane.showInputDialog("Please enter the first name of the second person:");
        lName = JOptionPane.showInputDialog("Please enter the last name of the second person:");

        Person person2 = new Person(fName,lName);

        output+="\n\nCalling the Person(String,String) constructor after getting user supplied values...." +
                "\nValue of the second person object is: " + person2.toString();

        JOptionPane.showMessageDialog(null,output,"",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);


    }

}
