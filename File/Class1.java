/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author israt
 */
public class Class1 {
    public static void main(String[] args) {
        String s;
        String de;
        
        try{
        Formatter formatter = new Formatter("C:/Users/israt/Documents/NetBeansProjects/OOP/Person/student.txt");
        Scanner input = new Scanner(System.in);
            System.out.println("Enter your string:");
            s=input.nextLine();
            de=" ";
            String [] words=s.split(de);
            for(int i=0;i<words.length;i++){
                System.out.println(words[i]);
            }
            System.out.println("The number of tokens are :"+words.length);
            
            formatter.format("%s\r\n",s);
            
            formatter.close();
    }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
            
        }
    
}
