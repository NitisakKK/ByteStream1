package characterstream1;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab4 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(60.5);
            output.println(175);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileReader file = new FileReader("data.txt");
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            System.out.println(name);
            int age = input.nextInt();
            System.out.println(age);
            double weight = input.nextDouble();
            System.out.println(weight);
            double height = input.nextDouble();
            System.out.println(height);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
