package com.company;
import java.util.Scanner;
/**
 * Created by Сергей on 12.03.2015.
 */
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

 public class Main19
 {
     public static void main(String[] args)
         {
             Scanner in = new Scanner (System.in);
             String str = in.nextLine();
             PrintWriter file = null;
             try
             {
                file = new PrintWriter(new FileOutputStream("d://java/src/com/company/многоогентная_система/file1.txt"));
             }
             catch(FileNotFoundException e)
             {
                 System.out.println("Ошибка открытия файла d://java/src/com/company/многоогентная_система/file1.txt");
                 System.exit(0);
             }
             file.print(str);

             file.close();

             System.out.println("Программа завершена");
             }
        }
