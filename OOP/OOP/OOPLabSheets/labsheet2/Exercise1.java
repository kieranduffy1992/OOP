package labsheet2;


import javax.swing.*;
public class Exercise1 {
    public static void main(String[] args) {


        String serialNo="", processor = "", diskSpaceAsString,cheapestComputer;
        int diskSpace, i=1,totalRecords=0;
        float price, totalSpace = 0, smallestPrice = 0,largestPrice=0;
        boolean valid;


        serialNo = JOptionPane.showInputDialog("please enter the serial number(<CR> to exit)");

        while(!serialNo.equals("")) {


            diskSpaceAsString = JOptionPane.showInputDialog("Please enter the hard-disk space");

            valid = false;

            while (!valid) {


             if(!diskSpaceAsString.equals("")) {

                 while (!Character.isDigit(diskSpaceAsString.charAt(0))) {
                     diskSpaceAsString = JOptionPane.showInputDialog("Invalid!! Please re-enter the hard-disk space");
                 }

                 for (i = 1; i < diskSpaceAsString.length(); i++) {
                     if (!Character.isDigit(diskSpaceAsString.charAt(i)))
                         break;
                 }

                 if (i == diskSpaceAsString.length()) {

                     diskSpace = Integer.parseInt(diskSpaceAsString);

                     if (diskSpace > 50 && diskSpace < 5000) {
                         totalSpace += diskSpace;
                         valid = true;
                     } else
                         diskSpaceAsString = JOptionPane.showInputDialog("Invalid!! Please re-enter the hard-disk space");

                 } else
                     diskSpaceAsString = JOptionPane.showInputDialog("Invalid!! Please re-enter the hard-disk space");
             }
             else

                diskSpaceAsString = JOptionPane.showInputDialog("Invalid!! Please re-enter the hard-disk space");

            }

            processor = JOptionPane.showInputDialog("Please enter the processor type");

            price = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price"));

            if(totalRecords==0)
            {
                smallestPrice = price;
                largestPrice = price;

            }
            if(price < smallestPrice)
            {
                smallestPrice=price;
                cheapestComputer=processor;
            }

            if(price > largestPrice)
            {
                largestPrice = price;
            }
            
            totalRecords++;

            serialNo = JOptionPane.showInputDialog("please enter the serial number(<CR> to exit)");
        }

        JOptionPane.showMessageDialog(null,"The average disk space available on the computers processed is: "+averageDiskSpace(totalSpace,totalRecords)+"GB"+
                "\nThe price range of the computers is from £" + smallestPrice + "to £"+largestPrice + "\nThe processor type on the cheapest computer is "+processor,"Computer Stats",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static float averageDiskSpace(float space, int number)
    {

        float average;

        average = space/number;

        return average;

    }
}
