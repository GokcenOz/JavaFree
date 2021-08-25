package lambdaclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming05dt {
    public static void main(String[] args) {

        Course courseTurkishDay=new Course("Summer","Turkish Day",97,128);
        Course courseTurkishNight=new Course("Winter","Turkish Night",98,154);
        Course courseEnglishDay=new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);


        List<Course> coursesList=new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        System.out.println(checkAvgScore(coursesList,91));
        System.out.println(checkName(coursesList,"Turkish"));
        courseHasHighestAvg(coursesList);
        System.out.println(sortAvgAscSkipFirstTwo(coursesList));
        System.out.println(sortinAscSkip(coursesList,1,2));
    }
    //1)Create a method to check if all average scores are greater than 91
    public static boolean checkAvgScore(List<Course> coursesList,int x){

        boolean result=coursesList.stream().allMatch(t->t.getAverageScore()>x);
    return result;
    }

//2)Create a method to check if at least one of the course names contains “Turkish” word
public static boolean checkName(List<Course> coursesList,String x) {
    boolean result = coursesList.stream().anyMatch(t -> t.getCourseName().contains(x));
//anymatch herhangi birinde varsa true

    return result;
}
//3)Create a method to print the course whose average score is the highest
public static void courseHasHighestAvg (List<Course> coursesList){
    Course result =  coursesList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
    System.out.println(result);
}
    //4)Sort the list elements according to the average score in ascending order and skip first 2 elements
    public static List<Course> sortAvgAscSkipFirstTwo (List<Course> coursesList){
        return coursesList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
    }
//5)Sort the list elements according to the average score in ascending order and print just 3rd one
public static List<Course> sortinAscSkip (List<Course> coursesList,int skipNum,int limitNum) {
    return coursesList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(skipNum).limit(limitNum).collect(Collectors.toList());

}

}
