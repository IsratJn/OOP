/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author israt
 */
public class Class2 {
    public static void main(String[] args) {
        
        try{
            File file = new File("C:/Users/israt/Documents/NetBeansProjects/OOP/Person/student.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String s= scanner.nextLine();
                System.out.println("The string is :"+s);
            }
            scanner.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
    
}
