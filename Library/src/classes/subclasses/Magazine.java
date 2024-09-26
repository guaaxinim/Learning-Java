package classes.subclasses;

import classes.superclasses.LibraryItem;

public class Magazine extends LibraryItem{

    private int volume;
    private int editionNumber;

    public Magazine(String name, String author, String publishmentDate, int volume, int editionNumber){
        super(name, author, publishmentDate);
        this.volume = volume;
        this.editionNumber = editionNumber;
    }

    // Getting class atributtes zone.
    public int getVolume(){
        return this.volume;
    }

    public int getEditionNumber(){
        return this.editionNumber;
    }
    // End zone.

    // Setting class atributes zone.
    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setEditionnumber(int editionNumber){
        this.editionNumber = editionNumber;
    }
    //End zone.
}
