/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220119.ch25_7_nio2_files;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
/**
 *
 * @author xvpow
 */
public class Ch25_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Path p1 = Paths.get("c:", "mydir","test_path","test_file.txt");
       Path p2 = Paths.get("c:", "mydir","test_path","test_file_copy.txt");
       try{
            Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING);   
            //Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES);   
            //ATOMIC_MOVE 不行
            //Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.ATOMIC_MOVE);   
       }catch(IOException ex){
           System.out.println(ex);
       }
//       Path p3 = Paths.get("c:", "mydir","test.zip");
//       Path p4 = Paths.get("c:", "mydir","test_copy.zip");
//        try{
//           Files.copy(p3, p4,StandardCopyOption.REPLACE_EXISTING);            
//        }catch(IOException ex){
//            System.out.println(ex);
//        }
        
    }
    
}
