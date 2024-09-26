package apps;

import classes.subclasses.Book;

public class BookApp {

    public static void main(String[] args) throws Exception {
        // Instances zone.
        Book book1 = new Book("Light Waters", "Mister Hann", "20/10/1999", 128, 99);
        Book book2 = new Book("Misteryous Lake", "Dave Davidsoon", "15/11/2022", 412, 88);
        // End zone.

        // Showing instances values zone.
        System.out.println(("-=-=-=-=")+" BOOKS "+("-=-=-=-="));

        System.out.println("Name: "+book1.getName());
        System.out.println("Author: "+book1.getAuthor());
        System.out.println("Publishment Date: "+book1.getPublishmentDate());
        System.out.println("Pages Number: "+book1.getPagesNumber());
        System.out.println("ISBN: "+book1.getIsbn());

        System.out.println("");

        System.out.println("Name: "+book2.getName());
        System.out.println("Author: "+book2.getAuthor());
        System.out.println("Publishment Date: "+book2.getPublishmentDate());
        System.out.println("Pages Number: "+book2.getPagesNumber());
        System.out.println("ISBN: "+book2.getIsbn());

        System.out.println("");
        // End zone.

        // Setting instances values zone.
        book1.setName("An Ignorant Individous");
        book1.setAuthor("Patrick Pen");
        book1.setPublishmentdate("10/10/2010");
        book1.setPagesNumber(56);
        book1.setIsbn(145);

        book2.setName("Mountain");
        book2.setAuthor("Bruce Bombastic");
        book2.setPublishmentdate("09/07/2000");
        book2.setPagesNumber(768);
        book2.setIsbn(91);
        // End zone.

        // Showing instances values zone.
        System.out.println(("-=-=-=-=")+" BOOKS "+("-=-=-=-="));

        System.out.println("Name: "+book1.getName());
        System.out.println("Author: "+book1.getAuthor());
        System.out.println("Publishment Date: "+book1.getPublishmentDate());
        System.out.println("Pages Number: "+book1.getPagesNumber());
        System.out.println("ISBN: "+book1.getIsbn());

        System.out.println("");

        System.out.println("Name: "+book2.getName());
        System.out.println("Author: "+book2.getAuthor());
        System.out.println("Publishment Date: "+book2.getPublishmentDate());
        System.out.println("Pages Number: "+book2.getPagesNumber());
        System.out.println("ISBN: "+book2.getIsbn());

        System.out.println("");
        // End zone.
    }
}
