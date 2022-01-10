/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220110.ch21_2_optional_1;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Student st1 = new Student();
     //st1.setName("Ken");
    st1.setName(null);
     st1.setAge(25);
     //如果getName 是null希望出現 姓名不可空白
//     if (st1.getName() == null){
//         System.out.println("姓名不可空白");
//     }else{
//         System.out.println(st1.getName().toUpperCase());         
//     }
     Optional<String> optional 
             = Optional.ofNullable(st1.getName());
     optional.ifPresent(v->System.out.println(v.toUpperCase()));
     if (optional.isEmpty()){
         System.out.println("姓名不可空白");
     }
     
    }
    
}
