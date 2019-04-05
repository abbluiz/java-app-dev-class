package lab11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab11 {

    public static void main(String[] args) throws Exception {

        File file = new File("");

        if (args.length == 1) {

            file = new File("src/lab11/" + args[0]);

        } else if (args.length < 1) {

            System.out.println("ERROR: Filename not specified.");
            System.exit(1);

        } else {

            System.out.println("ERROR: Too many arguments.");
            System.exit(2);

        }

        Scanner fileWordInput = new Scanner(file);

        int wordCount = 0;

        while(fileWordInput.hasNext()) {

            fileWordInput.next(); wordCount++;

        }

        fileWordInput.close();

        Scanner fileLineInput = new Scanner(file);

        int lineCount = 0;

        while(fileLineInput.hasNext()) {

            fileLineInput.nextLine(); lineCount++;

        }

        fileLineInput.close();

        File outputFile = new File("src/lab11/count.txt");

        try (PrintWriter output = new PrintWriter(outputFile)) {

            output.println("File " + args[0] + " has");
            output.println(wordCount + " words");
            output.print(lineCount + " lines");

        }

        System.out.println("Output file created/updated");

    }



}
