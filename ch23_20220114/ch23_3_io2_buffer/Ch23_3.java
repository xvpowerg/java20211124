/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20220114.ch23_3_io2_buffer;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author xvpow
 */
public class Ch23_3 {
         public static void main(String[] args) {
             File file1 = new File("C:\\mydir\\test.zip");
             File copy_file1 = new File("C:\\mydir\\test_copy.zip");     
               InputStream input = null;
                OutputStream output = null;
             try{
                input = new FileInputStream(file1);
                output = new FileOutputStream(copy_file1);
                input = new BufferedInputStream(input);
                output = new BufferedOutputStream(output);
                 
                 int data = -1;               
                while( (data = input.read()) != -1  ){
                    output.write(data);
                } 
              
             }catch(FileNotFoundException ex){
                 System.out.println(ex);
             }catch(IOException ex){
                 System.out.println(ex);
             }finally{
                try{
                     output.close();
                    input.close();    
                }catch(IOException ex){                   
                }  
             }          
         }
}
