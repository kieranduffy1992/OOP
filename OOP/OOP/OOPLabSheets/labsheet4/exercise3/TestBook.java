package labsheet4.exercise3;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {

        String output="";

        Book b1 = new Book();

        output += "Calling the no-argument Book constructor.The first Book object details are:\n\n" + b1.toString();

        Book b2 = new Book("The davinci Code",19.99,"34567543",348);

        output += "\n\nCalling the multi-argument Book constructor. The second Book object details are:\n\n" + b2.toString();

        JOptionPane.showMessageDialog(null,output,"Book Object Data",JOptionPane.INFORMATION_MESSAGE);


    }
}
