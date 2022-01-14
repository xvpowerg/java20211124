/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220114.ch23_4_io3_auto_close;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class Ch23_4 {
    
    public static void main(String[] args) throws Exception{
     File file1 = new File("C:\\mydir\\test.zip");
     File copy_file1 = new File("C:\\mydir\\test_copy.zip");     
     
      try(InputStream input =
              new BufferedInputStream(new FileInputStream(file1));
           OutputStream output = new 
        BufferedOutputStream(new FileOutputStream(copy_file1)); ){
          
          int data = -1;
          while((data = input.read()) != -1 ){
                output.write(data);
          }          
      }          
    }
}
