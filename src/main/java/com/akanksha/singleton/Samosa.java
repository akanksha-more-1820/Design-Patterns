package com.akanksha.singleton;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Samosa implements Serializable,Cloneable {

    private static Samosa samosa;
    private Samosa(){
    if(samosa !=null){
        throw new RuntimeException("you are trying to break singleton");
    }
    }

    //lazy way of creating get samosa
    public static Samosa getSamosa(){
        //create object of class
        if(samosa==null) {
            synchronized (Samosa.class) {
                samosa = new Samosa();
            }
        }
        return samosa;
    }

   public Object readResolve(){
        return samosa;
   }

   public Object clone() throws CloneNotSupportedException {
        return samosa;
   }
}
