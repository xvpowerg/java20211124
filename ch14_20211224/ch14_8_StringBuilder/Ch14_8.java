package ch14_20211224.ch14_8_StringBuilder;

public class Ch14_8 {    
    public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
            
            for(int i = 1;i<=10;i++){
                sb.append(i);
                sb.append(" ");
            }
            System.out.println(sb);            
    }
    
}
