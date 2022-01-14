/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20220114.ch23_5_io4_auto_close2;
import java.io.IOException;
public class TestClose implements AutoCloseable {
     private String msg;   
     
    public TestClose (String msg){
        this.msg = msg;
    }
    
    public void close()throws IOException{
        System.out.println("close:"+msg);
    }
    
    //Closeable
    //void close() throws IOException
}
