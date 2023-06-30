package com.akanksha.AbstractFactory;

public abstract class UniversityFactory {

    private static int cutoff=100;
    public static UniversityFactory getUniversityFactory(int score){
        if (score>cutoff){
            return new IvyLeagueUniversity();
        }else{
            return new PublicUniversity();
        }
    }

    public abstract AdmitCard getAdmitCard(String course);
    public abstract  FeeCalculator getFeeCalculator(String course);
}
