package characterstream1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab2 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello World");
            output.write("Welcome to Java");
            output.close(); // เพื่อที่ให้ข้อมูลขึ้นไปยัง data.txt
        } catch (IOException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String s;
            FileReader file = new FileReader("data.txt"); // read ได้ทีละ char
            BufferedReader input = new BufferedReader(file);
            while ((s = input.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
