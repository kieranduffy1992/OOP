package labsheet2;

//RandomArray.java
/*This program populates an integer array of size 10 with random values from 1 to 1000
 *and then determines some information about the data*/

import javax.swing.*;
import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {

        int numbers[] = new int[10];


        populateArray(numbers);

        String output = "The initial contents of the array is " + Arrays.toString(numbers);

        Arrays.sort(numbers);

        output += "\nThe percentage of values that exceed 100 is " + greaterThan100(numbers) + "%" +
                "\nThe contents of the array after sorting is: " + Arrays.toString(numbers);

        JOptionPane.showMessageDialog(null,output,"Array Stats",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);




    }

    public static void populateArray(int n[])
    {


        for(int i = 0; i < n.length; i++)
        {

            n[i] = (int)(Math.random()*1000)+1;

        }
    }

    public static int greaterThan100(int n[])
    {

        int exceed100=0, percentage;

        for(int i = 0; i < n.length; i++)
        {
            if(n[i] > 100)
                exceed100++;

        }

        percentage = exceed100*10;

        return percentage;


    }
}
