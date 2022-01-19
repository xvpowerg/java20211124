/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220119.ch25_10_nio2_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author xvpow
 */
public class Ch25_10 {
    public static void main(String[] args) {
      Path p1 = Paths.get("c:", "mydir");
//      try{
//          Stream<Path> dirStream =  Files.list(p1);
//         dirStream.forEach(p->System.out.println(p));
//      }catch(IOException ex){
//          System.out.println(ex);
//      }

      try{
          //maxDepth預設最大深度2147483647 
          //maxDepth 不可為負數
          //maxDepth 設為0是當前路徑
         
          //Stream<Path> dirStream =  Files.walk(p1);
          Stream<Path> dirStream =  Files.walk(p1,4);
         dirStream.forEach(p->System.out.println(p));
      }catch(IOException ex){
          System.out.println(ex);
      }
      
        
    }
    
}
