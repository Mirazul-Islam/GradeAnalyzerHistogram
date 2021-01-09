/**
 * author: Mirazul Islam
 * date: 10/12/2020
 * description: THis class test the GradeAnalyzer class.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeAnalyzerTester {

    public static void main(String[] args) throws FileNotFoundException {

        GradeAnalyzer analyzer = new GradeAnalyzer();
        //Your work starts here

        //Setting up scanner to scan the items
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = keyboard.nextLine();

        // capture file information from user and read file

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        String word;
        int number;

        // initialize List to store data from the text file
        while (inputFile.hasNext())
        {
            word = inputFile.nextLine();
            if(word.equals("-1")){break;}// Takes in value until it reads -1
            number = (int) inputFile.nextInt();
            inputFile.nextLine();
            Record myRec = new Record(word,number);
            analyzer.addRecord(myRec);
        }

        analyzer.printAllRecords(); //Prints the record

        System.out.println("_______________________________________________");

        analyzer.printHistogram(); //Print the Histogram of the records
    }
}
