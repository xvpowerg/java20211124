/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20220107.ch20_4_stream1;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch20_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        // TODO code application logic here
        Stream<String> st1 = Stream.of("A","B","C","D");
        //st1.forEach(v->System.out.println(v));
        Stream<Integer> st2 = Stream.generate(()->random.nextInt(500000));
        st2.limit(5).forEach(v->System.out.println(v));
        IntStream is =  IntStream.iterate(1, v->v + 1);
        System.out.println("============================");
        is.limit(6).forEach(v->System.out.println(v));
        
        
        
    }
    
}
