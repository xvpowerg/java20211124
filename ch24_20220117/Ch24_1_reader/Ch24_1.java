/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220117.Ch24_1_reader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch24_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      File  file = new File("C:\\mydir\\test_reader.txt");
    try(FileReader fr = new FileReader(file);){
        int data = -1;
        while( (data = fr.read()) != -1 ){
            char c = (char)data;
            System.out.print(c);
        }        
        
    }catch(FileNotFoundException ex){
        System.out.println(ex);
    }catch(IOException ex){        
        System.out.println(ex);
    }
    
    }
    
}
