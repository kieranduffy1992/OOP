package labsheet1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {


       String text, shortestText="";
       int counter=1, totalWords=0, noOfChar=0, totalChar=0, numLowerVowels=0, noWords=0,noEd=0;
       boolean valid;

       Scanner input = new Scanner(System.in);



       do{

           System.out.print("\n\nPlease enter piece of text " + counter + ": ");
           text = input.nextLine();

           for(int i = 0; i < text.length(); i++)
           {
               if((text.charAt(i) > 'a' && text.charAt(i) < 'z' ) || text.charAt(i) > 'A' && text.charAt(i) < 'Z')
               {
                   noOfChar++;
                   totalChar++;
               }
               if(text.charAt(i) == 'a' || text.charAt(i) == 'e' ||
                       text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u')
               {
                   numLowerVowels++;
               }
               if(text.charAt(i)== ' ')
               {
                   noWords++;
                   totalWords++;
               }

           }

           valid = false;

           for(int j = 0; j < text.length(); j++)
           {
               if(text.charAt(j)=='e' && text.charAt(j+1)=='d')
                   noEd++;
           }

           System.out.println("\n\nNumber of characters: "+noOfChar + "\nNumber of lowercase vowels: " + numLowerVowels +
                   "\nNumber of words: "+(noWords+1)+"\nNumber of times ed appears in the text: "+noEd);


           if(counter==1)
           {
              shortestText = text;
           }

           else if (text.length() < shortestText.length())
           {
              shortestText = text;
           }

           noWords=0;
           noOfChar=0;
           numLowerVowels=0;
           noEd=0;
           counter++;

       }while(counter <= 3);

       System.out.println("\n\nShortest piece of text: " + shortestText + "\nAverage number of words: " + totalWords/counter);
    }
}
