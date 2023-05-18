import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FileOutputStream {
        public static void main(String [] args) {
            try {
                Scanner input = new Scanner(System.in);
                File file = new File("C:\\OOP2\\Person.dat");
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                System.out.println("yeu cau nhap mot chuoi ki tu : ");
                String s = input.nextLine();
                fileOutputStream.write(s.getBytes());
                fileOutputStream.close();
                System.out.println("Dữ liệu trong tệp: ");
                FileInputStream fileInputStream = new FileInputStream(file);
                int i = fileInputStream.read();
                while (i != -1) {
                    System.out.print((char) i);
                    i = fileInputStream.read();
                }
               fileInputStream.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
