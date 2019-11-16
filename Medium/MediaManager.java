import java.util.*;
public class MediaManager{
   public static void main(String[] args) { 
   ArrayList<Video> allVideos = new ArrayList<Video>();
   ArrayList<Book> allBooks = new ArrayList<Book>();
   Video video1 = new Video("Transformers", "John Adams", 400, "Lex Armstrong");
   Video video2 = new Video("Shrek", "Roald Dahl", 353, "Adam Smith");
   Video video3 = new Video("Joker", "Bruce Wayne", 312, "Harley Quinn");
   Book book1 = new Book("Jack and the Beanstock", "Jackie Chan", 331, false);
   Book book2 = new Book("Programming Bitcoin", "Jimmy Song", 554, true);
   Book book3 = new Book("Jimi Hendrix", "Jeffrey Loadher", 679, false);
   allVideos.add(video1);
   allVideos.add(video2);
   allVideos.add(video3);
   allBooks.add(book1);
   allBooks.add(book2);
   allBooks.add(book3);
   System.out.println(book1.toString());
   System.out.println(book2.toString());
   System.out.println(book3.toString());
   System.out.println(video1.toString());
   System.out.println(video2.toString());
   System.out.println(video3.toString());
   ArrayList<Medium> everything = new ArrayList<Medium>();
   for(int i = 0; i<allVideos.size(); i++){
      everything.add(allVideos.get(i));
   }
   for(int i = 0; i<allBooks.size(); i++){
      everything.add(allBooks.get(i));
   }
   for(int i = 0; i<everything.size(); i++){
      System.out.println(everything.get(i));
   }
 }// end main
}// end class