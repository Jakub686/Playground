package com.company.chapter4;
import java.util.function.Predicate;

public class PredicateTest implements Predicate<Integer> {
    @Override
    public boolean test(Integer t) {
        if (t % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Predicate<Integer> predicate = new PredicateTest();
        System.out.println(predicate.test(2));
    }
}
