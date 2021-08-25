package lambdaclass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming04dt {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        getSumOfAllEements(l);
        getSumOfIntFrom7To100();
        getSumOfIntFromXToY(7, 100);
        getMultip(3, 5);
        calcFact(5);
        calcSumOfEvenIntegers(5,8);
        calcSumOfDigitsInTheGivenRange(23,27);
    }

    //1)Create a method to find the sum of all elements in the list
    static void getSumOfAllEements(List<Integer> l) {
        Integer sum = l.stream().reduce(0, Math::addExact);
        System.out.println(sum);

    }

    //2)Create a method to find the sum of integers from 7 to 100
    //1.way
    static void getSumOfIntFrom7To100() {
        Integer sum = IntStream.range(7, 101).reduce(0, Math::addExact);
        System.out.println(sum);
    }

    //2way
    static void getSumOfIntFrom7To100B() {
        Integer sum = IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
        System.out.println(sum);
    }

    //3.way
    static void getSumOfIntFromXToY(int x, int y) {// daha flexible method yapmak
        Integer sum = IntStream.rangeClosed(x, y).reduce(0, Math::addExact);
        System.out.println(sum);
    }

    //3)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    static void getMultip(int x, int y) {
        Integer mult = IntStream.rangeClosed(x, y).reduce(1, Math::multiplyExact);
        System.out.println(mult);
    }

    //4)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    static void calcFact(int x) {//12den fazla girersek hata verir ınteger dan buyuk old ıcın
        Integer fac = IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
        System.out.println(fac);
    }
//5)Create a method to calculate the sum of even integers between given two integers
    static void calcSumOfEvenIntegers(int x,int y){
        Integer sum=IntStream.rangeClosed(x,y).filter(Utils::checkToBeEven).reduce(0,Math::addExact);
        System.out.println(sum);
    }
//6)Create a method to calculate the sum of digits of every integers between given two integers
    static void  calcSumOfDigitsInTheGivenRange(int x,int y){
        Integer sum=IntStream.rangeClosed(x,y).map(Utils::getSumOfDigits).sum();//instead of reduce you can use sum method
        System.out.println(sum);
    }



}