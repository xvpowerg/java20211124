/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220114.ch23_7_io6_writer;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

public class Ch12_7 {

    public static void main(String[] args) {
        // TODO code application logic here
        try(Writer w = new FileWriter("C:\\mydir\\testw.txt")){
            w.write("哈哈呵呵!");
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}
