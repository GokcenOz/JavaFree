package FreeExercises;

public class Book {
    String title;
    String author;
    int publish;
    static int pages;

    public Book(String title, String author, int publish) {
        this.title = title;
        this.author = author;
        this.publish = publish;
    }

    public Book() {

    }


    public void displayInfo(){
        System.out.println(title+" "+author+" "+publish+" "+pages);
    }

    public static void main(String[] args) {
        Book b1=new Book("kurk mant"," sab. Ali",1998);

        b1.displayInfo();
    }
}
