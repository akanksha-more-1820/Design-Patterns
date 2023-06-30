package com.akanksha.Adapter;

import java.util.List;

public class Test {
    public static void main(String[] args) {
//        StudentClient client=new StudentClient();
//        List<Student> studentList=client.getStudentList();
//        System.out.println(studentList);

       // WeightMachineAdapter weightMachineAdapter=new WeightMachineAdapterImpl(new WeightMachineForBabies());
        //ystem.out.println(weightMachineAdapter.getWeightKg());

        WeightMachine weightMachine=new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachine.getWeightPound());
    }
}
