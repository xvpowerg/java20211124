/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220114.ch23_3_io1;
import java.io.File;
//讀檔案用
import java.io.InputStream;
import java.io.FileInputStream;
//輸出檔案用
import java.io.OutputStream;
import java.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author xvpow
 */
public class Ch23_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("c:\\mydir\\mydir_test\\test1.txt");
        File copyFile = new File("c:\\mydir\\mydir_test\\copy_test1.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        try{
            InputStream input = new FileInputStream(file);
            OutputStream output = new FileOutputStream(copyFile);
            int data = -1;
            while( ( data = input.read()) != -1  ){
                //System.out.println(data);
                output.write(data);
            }            
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
                
    }
    
}
