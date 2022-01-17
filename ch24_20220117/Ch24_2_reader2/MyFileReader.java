/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20220117.Ch24_2_reader2;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author xvpow
 */
public class MyFileReader  extends InputStreamReader{
        public MyFileReader(File file,String charsetName)
                            throws FileNotFoundException,
                                   UnsupportedEncodingException{
          super(new FileInputStream(file),charsetName);
        }
        public MyFileReader(File file)throws FileNotFoundException,
                                   UnsupportedEncodingException{
            this(file,"utf-8");
        }
}
