package labsheet5.exercise1;

import labsheet3.exercise1.Computer;
import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {

        String title,ISBN;
        double price;
        int pages;

        JTextArea textArea = new JTextArea();
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);

        textArea.setFont(textAreaFont);

        Computer c1 = new Computer();

        System.out.println(c1.getManufacturer());

        String text = String.format("%-20s%-10s%-20s%s","Title","Price","ISBN","Pages");

        title = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter ISBN of your favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your favourite book"));

        Book favourite = new Book(title,price,ISBN,pages);

        text += String.format("\n\n%-20s%.2f%-20s%d",favourite.getTitle(),favourite.getPrice(),
                favourite.getISBN(),favourite.getPages());


        title = JOptionPane.showInputDialog("Please enter the title of the book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the book"));
        ISBN = JOptionPane.showInputDialog("Please enter ISBN of your least favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your least favourite book"));


        Book leastFavourite = new Book(title,price,ISBN,pages);

        text += String.format("\n\n%-20s%.2f%-20s%d",leastFavourite.getTitle(),leastFavourite.getPrice(),
                leastFavourite.getISBN(),leastFavourite.getPages());

        textArea.append(text);

        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);


    }
}
