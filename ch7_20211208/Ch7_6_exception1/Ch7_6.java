/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20211208.Ch7_6_exception1;

/**
 *
 * @author xvpow
 */
public class Ch7_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg = "完成";
        try{
            //交易               
        Student st1 = new Student();
        //5 ~ 150
        //發生錯誤程式停止
        st1.setAge(-5);//顯示一組 錯誤的年齡 訊息                    
        System.out.println(st1.getAge()); 
        }catch(IllegalArgumentException ex){
            msg = ex.getMessage();
           // System.out.println(ex);
        }        
        System.out.println("msg:"+msg);
    }    
}
