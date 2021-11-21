package com.company.d;

public class StaticFields {
    private int poleInstancji;
    private static int poleStatyczne = 5;
    public StaticFields(int poleInstancji) {
        this.poleInstancji = poleInstancji;
    }
    public static void main(String[] args) {
        System.out.println("Pole statyczne (przez klase): " +
                StaticFields.poleStatyczne // 1
        );
        StaticFields obiekt1 = new StaticFields(10);
        System.out.println("Pole statyczne (przez obiekt1): " +
                obiekt1.poleStatyczne // 2
        );
    }
}
