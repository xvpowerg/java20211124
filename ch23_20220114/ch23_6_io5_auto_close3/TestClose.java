/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20220114.ch23_6_io5_auto_close3;
import java.io.IOException;
public class TestClose implements AutoCloseable {
     private String msg;   
     private boolean isException = false;
    public TestClose (String msg,boolean isException){
        this.msg = msg;
        this.isException = isException;
    }
    
    public void close()throws IOException{
          System.out.println("close:"+msg);
        if(isException){
            throw new IOException(msg);
        }
     
    }
    
    //Closeable
    //void close() throws IOException
}
