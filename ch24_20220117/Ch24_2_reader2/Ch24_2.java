/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220117.Ch24_2_reader2;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch24_2 {

//我自己寫一個MyFileReader() 可以傳編碼類型 如何做?
    public static void main(String[] args) {
      File  file = new File("C:\\mydir\\test_reader.txt");
//    try(InputStreamReader fr = new InputStreamReader(new FileInputStream(file),"big5");){
//        int data = -1;
//        while( (data = fr.read()) != -1 ){
//            char c = (char)data;
//            System.out.print(c);
//        }        
//        
//    }catch(FileNotFoundException ex){
//        System.out.println(ex);
//    }catch(IOException ex){        
//        System.out.println(ex);
//    }

    try(InputStreamReader fr = new MyFileReader(file,"big5");){
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
