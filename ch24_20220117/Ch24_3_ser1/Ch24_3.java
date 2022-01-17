/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220117.Ch24_3_ser1;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ch24_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //序列化 物件變得可以傳遞
       //反序列化 把序列化後的檔案變物件
       
        //序列化
       ArrayList<String> list = new ArrayList<>();
       list.add("Howard");
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       
       File file = new File("C:\\mydir\\obj\\listobj.obj");
       try(ObjectOutputStream objOut = 
               new ObjectOutputStream( new FileOutputStream(file));){
           objOut.writeObject(list);
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
