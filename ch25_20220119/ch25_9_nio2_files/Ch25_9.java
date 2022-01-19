/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220119.ch25_9_nio2_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author xvpow
 */
public class Ch25_9 {

    public static void main(String[] args) {
        Path p1 = Paths.get("c:", "a","c","test1.txt");
        Path p2 = Paths.get("c:", "a","c","test1.txt");
        //假設路徑一樣 不會檢測檔案是否存在
        //假設路徑不一樣 會檢測檔案是否存在
        try{
           boolean b1 = Files.isSameFile(p1, p2); 
           System.out.println(b1);
        }catch(IOException ex){
            System.out.println(ex);
        }
    
        
        
    }
    
}
