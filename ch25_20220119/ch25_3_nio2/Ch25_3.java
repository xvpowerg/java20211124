/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220119.ch25_3_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch25_3 {

    public static void main(String[] args) {
        Path p1 =  Paths.get("c:", "mydir","test_path","test_file.txt");
        System.out.println(p1.isAbsolute());//絕對路徑
        Path p2 = Paths.get("c:", "dir2","dir2_2");
        Path p3 = p2.resolve(p1.getFileName());
        System.out.println(p3);
        
        Path p4 = p2.resolveSibling(p1.getFileName());        
        System.out.println(p4);
        //如果resolve的參數是完整路徑 這時會取代原本的路徑
        Path p5 =  p2.resolve(p1);
        System.out.println(p5);
        
        
    }
    
}
