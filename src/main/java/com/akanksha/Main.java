package com.akanksha;

import com.akanksha.AbstractFactory.UniversityFactory;
import com.akanksha.Decorator.BasePizza;
import com.akanksha.Decorator.Chicken;
import com.akanksha.Decorator.ExtraCheese;
import com.akanksha.Decorator.ExtraChicken;
import com.akanksha.Factory.Circle;
import com.akanksha.Factory.Shape;
import com.akanksha.Factory.ShapeFactory;
import com.akanksha.ObserverDesignPattern.Observable.IphoneObservalbleImpl;
import com.akanksha.ObserverDesignPattern.Observable.StocksObservable;
import com.akanksha.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import com.akanksha.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import com.akanksha.ObserverDesignPattern.Observer.NotificationAlertObserver;
import com.akanksha.strategy.GoodsVehicle;
import com.akanksha.strategy.SportVehicle;
import com.akanksha.strategy.Vehicle;

public class Main {
    public static void main(String[] args) {
        int score=11;
        UniversityFactory universityFactory=UniversityFactory.getUniversityFactory(score);
        System.out.println(universityFactory.getAdmitCard("Physics"));
        System.out.println(universityFactory.getFeeCalculator("Math").calculateFee());
//
//        ShapeFactory shapeFactory= (ShapeFactory) new ShapeFactory().getShape("Circle");
//        Shape shape=shapeFactory.getShape("Circle");
//        shape.draw();

        Shape shape=new ShapeFactory().getShape("Circle");
        shape.draw();

        Vehicle vehicle=new SportVehicle();
        vehicle.drive();

        IphoneObservalbleImpl iphoneObservalble=new IphoneObservalbleImpl();

        NotificationAlertObserver obs1=new EmailAlertObserverImpl("asd",iphoneObservalble);
        NotificationAlertObserver obs2=new MobileAlertObserverImpl("fgh",iphoneObservalble);

        iphoneObservalble.add(obs1);
        iphoneObservalble.add(obs2);

        iphoneObservalble.setStockCount(1);


        BasePizza pizza=new ExtraCheese(new ExtraChicken(new Chicken()));
        System.out.println(pizza.cost());



    }
}