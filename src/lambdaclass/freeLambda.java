package lambdaclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class freeLambda {
   // 3)Create a method to print the even list elements on the console in the same line with a space between
    //two consecutive elements.(Functional)
    static void printEvenElements(List<Integer> l){
        l.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }

    //4)Create a method to print the square of odd list elements on the console in the same line with a space
//between two consecutive elements.
    static void printSquareOfOddElements(List<Integer> l){
        l.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }
//5)Create a method to print the cube of distinct odd list elements on the console in the same line with a
//space between two consecutive elements
static void printCubeOddElements(List<Integer> l){
        l.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
}
//6)Create a method to calculate the sum of the squares of distinct even elements
static void printSumOfSquares(List<Integer> l) {
       Integer sum= l.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t,u)->t+u);
    System.out.println(sum);
}
    //8)Create a method to find the maximum value from the list elements
    static void printMaxValue(List<Integer> l){
        Integer max=l.stream().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
        System.out.println(max);
    }
//10)Create a method to find the minimum value which is greater than 7 and even from the list
static void printMinValueGrtThenSeven(List<Integer> l){
     Integer minvl=   l.stream().distinct().filter(t->t>7&&t%2==0).reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
    System.out.println(minvl);
}
    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse in the list.
    static void findHalfElemnt(List<Integer> l){
      List<Integer> listt=  l.stream().distinct().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listt);
    }
    //4)Create a method to print the cube of distinct odd list elements on the console in the same line with a
    //space between two consecutive elements.
    static void cube(List<Integer> l){
        l.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::getCube).forEach(Utils::printInTheSameLineWithASpace);


    }









        public static void main(String[] args) {
       List<Integer> l = new ArrayList<Integer>();
       l.add(12);
       l.add(9);
       l.add(131);
       l.add(14);
       l.add(9);
       l.add(10);
       l.add(4);
       l.add(12);
       l.add(15);
       printEvenElements(l);
       System.out.println();
       printSquareOfOddElements(l);
       System.out.println();
       printCubeOddElements(l);
       System.out.println();
       printSumOfSquares(l);
       System.out.println();
       printMaxValue(l);
       System.out.println();
       printMinValueGrtThenSeven(l);
       System.out.println();
       findHalfElemnt(l);
            System.out.println();
            cube(l);
   }
}
