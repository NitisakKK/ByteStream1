package characterstream1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab1 {
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello World");
            output.write("Welcome to Java");
            output.close(); // เพื่อที่ให้ข้อมูลขึ้นไปยัง data.txt
        } catch (IOException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int ch;
            FileReader input = new FileReader("data.txt"); // read ได้ทีละ char
            while ((ch = input.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
