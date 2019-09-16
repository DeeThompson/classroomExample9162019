import java.util.ArrayList;

public class Main {

   public static void main (String[] args) {
       int x;
       int y;
       ArrayList<String> newList = new  ArrayList<>();
       Building gBTC = new Building(5,6,5,7 );
       Building tPMC = new Building (7,7,7,7);
       gBTC.printNumberOfRooms();
       tPMC.printNumberOfRooms();
       gBTC.setHeight(14);
       System.out.println();
          // public Book(String title, String author, String genre, int numberOfPages) {
       Book novel = new Book ("Autobiography of Malcolm X,", "Alex Haley", "nonfiction", 400);
       System.out.println(novel.getAuthor());




       x=5;
       y=0;
       int sum = add(x,y);
       System.out.println(sum);

   }
   public static int add(int num1, int num2 ) {
    int sum = num1 + num2;
    return sum;
   }

}
