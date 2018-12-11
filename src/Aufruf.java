import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf {


    public static void main (String [] args){
        Book a = new Book(200,new Date(),"my Book","124546444-456141711-455541");
        System.out.println("Das Buch hat " + a.getPages() + " und wurde am " + a.getReleased() + " veröffentlicht und trägt den Titel " + a.getTitle());

      //  Aufgabe 4:

        List<Book> myList = new ArrayList<>();

        myList.add(new Book(200,new Date(),"my Book 1","154541-264664-4666467"));
        myList.add(new Book(200,new Date(),"my Book 2","154541-264664-466784469"));
        myList.add(new Book(200,new Date(),"my Book 3","154541-264664-466784414"));
        myList.add(new Book(200,new Date(),"my Book 4","154541-264664-466784435"));
        myList.add(new Book(200,new Date(),"my Book 5","154541-264664-466784431"));






        for(Book f:myList){

            System.out.println(f.getTitle() + " hat " + f.getPages() + " Seiten und folgende ISBN: " + f.getIsbn());
        }


// Aufgabe 5

        List<Paperbook> myList2 = new ArrayList<>();
        myList2.add(new Paperbook(200, new Date(), "my Paperbook 1", "154541-264664-4666467","Series 1", "April"));
        myList2.add(new Paperbook(200, new Date(), "my Paperbook 2", "154541-264664-466784469", "Series 2","April"));
        myList2.add(new Paperbook(200, new Date(), "my Paperbook 3", "154541-264664-466784414", "Series 3", "January"));
        myList2.add(new Paperbook(200, new Date(), "my Paperbook 4", "154541-264664-466784435", "Series 4", "March"));
        myList2.add(new Paperbook(200, new Date(), "my Paperbook 5", "154541-264664-466784431","Series 5", "October"));

         for(Paperbook f:myList2){

        System.out.println(f.getTitle() + " hat " + f.getPages() + " Seiten und folgende ISBN: " + f.getIsbn() + " zusätzlich ist es im " + f.getMonth() + " erschienen");
    }


}
    }
