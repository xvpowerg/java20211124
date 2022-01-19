/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220119.ch25_6_nio2;

import java.nio.file.Path;
import java.nio.file.Paths;
public class Ch25_6 {
    public static void main(String[] args) {
         Path p1 =  Paths.get("c:", "g","f");
         Path p2 = Paths.get("c:","g","x", "y");
         //我在g/f路徑 
         //希望來到g/x/y路徑
         //回上一層的g再往下x 與 y
         //必須相同根目錄(ROOT) 不然拋出例外
        Path rp1 =   p1.relativize(p2);
        System.out.println(rp1);
        
    }
    
}
