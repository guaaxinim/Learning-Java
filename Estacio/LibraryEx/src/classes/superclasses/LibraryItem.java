package classes.superclasses;

public abstract class LibraryItem {
    
    private String name;
    private String author;
    private String publishmentDate;

    public LibraryItem(String name, String author, String publishmentDate){
        this.name = name;
        this.author = author;
        this.publishmentDate = publishmentDate;
    }

    // Getting class atributes zone.
    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getPublishmentDate(){
        return this.publishmentDate;
    }
    // End zone.

    // Setting class atributes zone.
    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublishmentdate(String publishmentDate){
        this.publishmentDate = publishmentDate;
    }
    // End zone.
}
