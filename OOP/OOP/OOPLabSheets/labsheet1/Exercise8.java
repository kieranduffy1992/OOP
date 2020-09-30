package labsheet1;

import javax.swing.*;


public class Exercise8 {
    public static void main(String[] args) {

        int counter=1, number, choice, factorial=1;
        String numberAsString ;



        do{

            numberAsString = JOptionPane.showInputDialog("----Iteration "+counter+"----\n\nPlease enter any whole number:");

            choice = Integer.parseInt(JOptionPane.showInputDialog("What would you like to do?\n\n1.Determine if the number is odd or even"+
                    "\n2.Find the factorial of the number\n3.Quit the program\n\nPlease enter your choice:"));


            switch(choice)
            {

                case 1:
                    number = Integer.parseInt(numberAsString);
                    if(number%2 == 0)
                    {
                       JOptionPane.showMessageDialog(null,"The number you entered is even");
                       break;
                    }
                    else
                        JOptionPane.showMessageDialog(null,"The number you entered is odd");
                        break;


                case 2:
                    if(numberAsString.charAt(0) != '-')
                    {
                        number = Integer.parseInt(numberAsString);

                        for(int i = 1; i<=number;i++)
                        {
                            factorial = factorial*i;

                        }

                        JOptionPane.showMessageDialog(null,"The factorial that you entered is "+factorial);
                        break;

                    }
                    else
                        JOptionPane.showMessageDialog(null,"You cannot get the factorial number of a negative number");

                case 3:
                    JOptionPane.showMessageDialog(null,"Quitting program earlier than expected");
                    counter=5;
                    break;

            }

            counter++;


        }while(counter <=5);


    }
}
