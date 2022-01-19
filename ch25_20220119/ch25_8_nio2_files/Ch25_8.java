/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220119.ch25_8_nio2_files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
public class Ch25_8 {

    public static void main(String[] args) {
        //move 就是 copy and delete
      Path p1 = Paths.get("c:", "mydir","test_path","test_file.txt");
      Path p2 = Paths.get("c:", "mydir","test_file_move.txt");
      try{
          //預設情況下 move的目標不可存在
          //如果目標存在可用以下方式
          //REPLACE_EXISTING
          //ATOMIC_MOVE
          //不可使用COPY_ATTRIBUTES
          Files.move(p1, p2,StandardCopyOption.REPLACE_EXISTING);
          
      }catch(IOException ex){
          System.out.println(ex);
      }
      
        
        
    }
    
}
