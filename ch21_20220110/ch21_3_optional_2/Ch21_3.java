/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220110.ch21_3_optional_2;
import java.util.Optional;
import java.util.Random;
public class Ch21_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        //Optional.of 參數 不可為null
       // Optional<String> option = Optional.of(null);
        Optional<String> option1 = Optional.of("Ken");
       //Optional.ofNullable 參數 可為null
        Optional<String> option2 = Optional.ofNullable(null);
        Optional<String> option3 =  Optional.ofNullable("Iris");
        //java 11
        option2.ifPresentOrElse((v)->System.out.println("opt2:"+v), 
                                ()->{System.out.println("Empty");});
       option3.ifPresentOrElse((v)->System.out.println("opt3:"+v), 
                                ()->{System.out.println("Empty");});
       
       if (option2.isPresent()){
           System.out.println(option2.get());
       }
         if (option3.isPresent()){
           System.out.println(option3.get());
       }
         //optionl內容不存在 回傳orElse的內容
       String str1 = option2.orElse("空白");
       String str2 = option3.orElse("空白");
       System.out.println(str1+":"+str2);
      
    //optionl內容不存在 回傳orElseGet的內容 比較複雜的情況
      String str3 = option2.orElseGet(()->{
                Random ran = new Random();
                return ran.nextInt(50000)+"";
       });
       String str4 = option3.orElseGet(()->{
                Random ran = new Random();
                return ran.nextInt(50000)+"";
       });   
       System.out.println(str3+":"+str4);
       
       String str5 = "";
       //str5 = option2.orElseThrow(IllegalArgumentException::new);
       String str6 =  option3.orElseThrow(IllegalArgumentException::new);
       System.out.println(str5+":"+str6);
       
    }
    
}
