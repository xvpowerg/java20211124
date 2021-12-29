/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20211229.ch16_3_set2;

public class Entity {
    private int id;
    private String name;
    public Entity(int id,String name){
        this.id = id;
        this.name = name;
    }   
    
    public boolean equals(Object obj){
        if (obj == null || obj instanceof Entity == false){
            return false;
        }
        Entity tmp = (Entity) obj;
        return this.id == tmp.id && this.name.equals(tmp.name);
    }
    
    //如果hashCode一樣 那麼 equals一樣的機率就很高!
    //如果hashCode不一樣 那麼 equals 一定不一樣!
    public int hashCode(){
        return this.id+this.name.hashCode();
    }
    
    public int getId(){
        return id;
    }    
    public String getName(){
        return name;
    }    
    public String toString(){
        return id+":"+name;
    }
}
