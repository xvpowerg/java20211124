/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20211227.list_4;

/**
 *
 * @author xvpow
 */
public class Item {
    private int id;
    private String name;
    
    public Item(int id,String name){
        this.id = id;
        this.name = name;
    }
    
    public boolean equals(Object obj){
          if (obj == null || 
                  obj instanceof Item == false){
              return false;
          }
          Item tmp = (Item)obj;
        return this.id == tmp.id && 
                this.name == tmp.name;
    }
    
    public String toString(){
        return name+":"+id;
    }
}
