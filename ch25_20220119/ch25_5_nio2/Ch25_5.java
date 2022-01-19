/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220119.ch25_5_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Ch25_5 {

    public static void main(String[] args) {
      Path p1 =  Paths.get("d", ".","g","f");
      System.out.println(p1);
      System.out.println(p1.normalize());
      //.. 上一層 有路徑就移除
      // . 就是移除點
      Path p2 = Paths.get("./../mydir/dir2/../dir3");
      System.out.println(p2);
      System.out.println(p2.normalize());
    }
    
}
