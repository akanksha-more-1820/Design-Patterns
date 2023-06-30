package com.akanksha.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

//        Samosa samosa=Samosa.getSamosa();
//        System.out.println(samosa.hashCode());
//        Samosa samosa2=Samosa.getSamosa();
//        System.out.println(samosa2.hashCode());
//
//        Jalebi jalebi=Jalebi.getJalebi();
//        System.out.println(jalebi.hashCode());
//        Jalebi jalebi2=Jalebi.getJalebi();
//        System.out.println(jalebi2.hashCode());

        //how to break singleton pattern

        //1.reflection api
//        Samosa s1=Samosa.INSTANCE;
//        System.out.println(s1.hashCode());
//         Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
//         constructor.setAccessible(true);
//         Samosa s2=constructor.newInstance();
//        System.out.println(s2.hashCode());

        //2.deserialization
//        Samosa s1=Samosa.getSamosa();
//        System.out.println(s1.hashCode());
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(s1);
//
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa s2=(Samosa) ois.readObject();
//        System.out.println(s2.hashCode());

        //3.cloning

        Samosa samosa=Samosa.getSamosa();
        System.out.println(samosa.hashCode());
         Samosa s2=(Samosa) samosa.clone();
        System.out.println(s2.hashCode());


    }
}
