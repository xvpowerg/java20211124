/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220119.ch25_1_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ch25_1 {
    public static void main(String[] args) {
       //NIO2 拆分為 2種物件  1 Path   2 Files
       //1 Path 路徑的 控制 顯示 修改  合併
       //2 Files 檔案管理 
      
     Path p1 =  Paths.get("c:", "mydir","test_path","test_file.txt");
      System.out.println(p1);
      
       Path fileName = p1.getFileName();
       System.out.println(fileName);
       //因為root不算在name內
       Path p2 = p1.getName(1);
        System.out.println(p2);
        //因為root不算在name內
        int count = p1.getNameCount();
        System.out.println(count);
        Path parent = p1.getParent();
        System.out.println(parent);
        Path root = p1.getRoot();
        System.out.println(root);
    }
    
}
