/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;

/**
 *
 * @author israt
 */
public class JavaDemo {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\israt\\Desktop\\Person");
        dir.mkdir();
        
        File file1 = new File("C:/Users/israt/Documents/NetBeansProjects/OOP/Person/student.txt");
        File file2 = new File("C:/Users/israt/Documents/NetBeansProjects/OOP/Person/teacher.txt");
        try{
           file1.createNewFile();
           file2.createNewFile();
            System.out.println("Files are created");
        }
        catch(Exception e){
            System.out.println("e");
        }
    }
    
}
