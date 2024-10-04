package classes.subclasses;

import classes.superclasses.LibraryItem;

public class Book extends LibraryItem{
    
    private int pagesNumber;
    private int isbn; // International Standart Book Number.

    public Book(String name, String author, String publishmentDate, int pagesNumber, int isbn){
        super(name, author, publishmentDate);
        this.pagesNumber = pagesNumber;
        this.isbn = isbn;
    }

    // Getting class atributtes zone.
    public int getPagesNumber(){
        return this.pagesNumber;
    }

    public int getIsbn(){
        return this.isbn;
    }
    // End zone.

    // Setting class atributes zone.
    public void setPagesNumber(int pagesNumber){
        this.pagesNumber = pagesNumber;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    // End zone.
}
