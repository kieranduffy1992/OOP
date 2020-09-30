package labsheet2;

import javax.swing.*;

public class NumbersArray {
    public static void main(String[] args) {

        double numbers[] = {22.3,45.6,27.4,56.6,73.2,11.5,87.4,23.8};
        double largestNumber,averageNumber;
        String aboveAv;

        largestNumber = largest(numbers);
        averageNumber = average(numbers);
        aboveAv = aboveAverage(numbers, averageNumber);



        JOptionPane.showMessageDialog(null,"The largest value in the array is "+ largestNumber +
                "\nThe average value of the array is " +averageNumber+ "\nThe list of values above average is "+aboveAv ,
                "Array Stats", JOptionPane.INFORMATION_MESSAGE);


    }

    public static double largest(double n[])
    {

        double largestNumber = 0;

        for(int i = 0; i<n.length; i++)
        {

            if(i==0)
            {
                largestNumber = n[i];
            }
            else if(n[i] > largestNumber)
            {
                largestNumber = n[i];
            }
        }

        return  largestNumber;

    }

    public static double average(double n[])
    {
        double averageNumber=0,total=0;

        for(int i = 0; i < n.length; i++)
        {
           total += n[i];
        }

        averageNumber = total/n.length;

        return averageNumber;

    }

    public static String aboveAverage(double n[], double av)
    {

        String list="";

        for(int i = 0; i < n.length; i++)
        {
           if(n[i] > av)
               list += n[i] + " ";

        }
        return list;

    }
}
