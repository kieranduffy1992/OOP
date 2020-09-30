package labsheet2;

import javax.swing.*;
import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {

        String names[] = new String[5],longestName = "";
        int totalChars=0;

        populateArray(names);

        for(int i = 0 ; i< names.length;i++)
        {
            if(i==0)
            {
                names[i] = longestName;
            }
            else if(names[i].length() > longestName.length())
            {
                longestName = names[i];
            }

            totalChars += names[i].length();

        }

        Arrays.sort(names);

        JOptionPane.showMessageDialog(null,"The longest name is " +longestName+
                "\nAverage characters per name is " +totalChars/names.length + "\nThe array sorted in ascending order is:\n"+
                Arrays.toString(names));



    }

    public static void populateArray(String names[])
    {


        for(int i = 0; i< names.length;i++)
        {
            names[i] = JOptionPane.showInputDialog("Please enter the name of person "+(i+1));
        }


    }
}
