package com.akanksha.AbstractFactory;

public class PublicUniversity extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course){
            case "Math":
                return new Fergusson();
            case "Physics":
                return new Sp();
            default:
                break;
        }
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch (course){
            case "Math":
                return new FergussonFee();
            case "Physics":
                return new SpFee();
            default:
                break;
        }
        return null;
    }
}
