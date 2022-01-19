/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220119.ch25_4_nio2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author xvpow
 */
public class Ch25_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1 =  Paths.get("c:", "mydir","test_path","test_file.txt");
        Path p2 = p1.subpath(0, 2);
        System.out.println(p2);
        Path p3 = p1.subpath(1, 3);
        System.out.println(p3);
        
       Path px =  Paths.get("a", "b","c");
       Path p4 = px.toAbsolutePath();
       System.out.print(p4);
       
       File f4 =  p4.toFile();
       System.out.println(f4.exists());
       File file = new File("c:\\ab");
       Path fp = file.toPath();
       System.out.println(fp);
       
        
    }
    
}
