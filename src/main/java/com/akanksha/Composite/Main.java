package com.akanksha.Composite;

public class Main {
    public static void main(String[] args) {
//        Directory directory=new Directory("Movie");
//        FileSystem border=new File("border");
//        directory.add(border);
//
//        Directory comedy=new Directory("comedy");
//        FileSystem comedyFile=new File("Hulchul");
//        comedy.add(comedyFile);
//        Directory innerComedy=new Directory("inner Comedy");
//        comedy.add(innerComedy);
//
//
//        innerComedy.add(comedyFile);
//
//        directory.add(comedy);
//        directory.ls();

        //(2*(1+7))

//                *
//              /   \
//            2      +
//                  /  \
//                 1    7

        Number two=new Number(2);
        Number one=new Number(1);
        Number seven=new Number(7);

        Expression add=new Expression(one,seven,Operation.ADD);
        Expression multiply=new Expression(two,add,Operation.MULTIPLY);

        System.out.println(multiply.evaluate());


    }
}
