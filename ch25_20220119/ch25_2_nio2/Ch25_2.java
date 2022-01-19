/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220119.ch25_2_nio2;
import java.nio.file.Paths;
import java.nio.file.Path;
public class Ch25_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //c 不是root
       Path p1 =  Paths.get("c", "test_path","test_file2.txt");
       System.out.println(p1.getFileName());
       System.out.println(p1.getName(0));
       System.out.println(p1.getNameCount());
      
    }
    
}
