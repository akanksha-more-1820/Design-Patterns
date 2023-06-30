package com.akanksha.AbstractFactory;

public class IvyLeagueUniversity extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course){
            case "Math":
                return new IITBombay();
            case "Physics":
                return new IITBanglore();
            default:
                break;
        }
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch (course){
            case "Math":
                return new IITBombayFee();
            case "Physics":
                return new IITBangloreFee();
            default:
                break;
        }
        return null;
    }
}
