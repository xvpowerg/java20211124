/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220117.Ch24_6_ser4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch12_6 {

    public static void main(String[] args) {
        Student st1 = new Student("Ken",18);
        Book b1 = new Book("ISBN112256","一周學會java");
        st1.setBook(b1);
        System.out.println(st1);
        File file = new File("c:\\mydir\\student.obj");
        try(ObjectOutputStream objSt =
                new ObjectOutputStream(new FileOutputStream(file))){
            objSt.writeObject(st1);
        }catch(FileNotFoundException  ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
