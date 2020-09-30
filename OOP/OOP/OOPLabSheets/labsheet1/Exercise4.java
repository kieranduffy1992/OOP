package labsheet1;

import javax.swing.*;

public class Exercise4 {
    public static void main(String[] args) {

        String name;
        int kmCycled;
        final float rate1 = 1.75f;
        final float rate2 = 2.50f;

        name = JOptionPane.showInputDialog("Please enter your name");

        kmCycled = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of km cycled"));

        if(kmCycled <= 10)
            JOptionPane.showMessageDialog(null,"Name:"+name+"\nDistance cycled:"+kmCycled+
                    "Sponsorship amount due:"+String.format("%.2f",kmCycled*rate1));

        else
            JOptionPane.showMessageDialog(null,"Name:"+name+"\nDistance cycled:"+kmCycled+
                    "\nSponsorship amount due:"+String.format("%.2f",(10*rate1)+((kmCycled-10)*rate2)));

        System.exit(0);




    }
}
