package FreeExercises;

import java.util.Scanner;

public class Student {
    String name;
    String address;


    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private void displayInfo(){
        System.out.println(name+"   "+address);
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter student name");
        String str=scan.nextLine();
        System.out.println("enter address");
        String add=scan.nextLine();

        Student st=new Student(str,add);
        st.displayInfo();







    }
}
