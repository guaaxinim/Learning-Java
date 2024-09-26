package apps;

import classes.subclasses.Magazine;

public class MagazineApp {
    
    public static void main(String[] args) throws Exception{
        // Instances zone.
        Magazine magazine1 = new Magazine("Curious Things that Happened at 2023", "The Entrance", "15/01/2024", 2, 1);
        Magazine magazine2 = new Magazine("Most Weared Clothes this Month", "Paris Models", "29/08/2024", 1, 54);
        // End zone.

        // Showing instances values zone.
        System.out.println("-=-=-=-="+" MAGAZINES "+"-=-=-=-=");

        System.out.println("Name: "+magazine1.getName());
        System.out.println("Author: "+magazine1.getAuthor());
        System.out.println("Publishment Date: "+magazine1.getPublishmentDate());
        System.out.println("Volume: "+magazine1.getVolume());
        System.out.println("Edition Number: "+magazine1.getEditionNumber());

        System.out.println("");

        System.out.println("Name: "+magazine2.getName());
        System.out.println("Author: "+magazine2.getAuthor());
        System.out.println("Publishment Date: "+magazine2.getPublishmentDate());
        System.out.println("Volume: "+magazine2.getVolume());
        System.out.println("Edition Number: "+magazine2.getEditionNumber());

        System.out.println("");
        // End zone.

        // Setting instances values zone.
        magazine1.setName("History of the France");
        magazine1.setAuthor("Histories Every Week (HEW)");
        magazine1.setPublishmentdate("18/06/2018");
        magazine1.setVolume(4);
        magazine1.setEditionnumber(165);

        magazine2.setName("Cars from 90'");
        magazine2.setAuthor("Fanaticars");
        magazine2.setPublishmentdate("01/12/2020");
        magazine2.setVolume(85);
        magazine2.setEditionnumber(354);
        // End zone.

        // Showing instances values zone.
        System.out.println("-=-=-=-="+" MAGAZINES "+"-=-=-=-=");

        System.out.println("Name: "+magazine1.getName());
        System.out.println("Author: "+magazine1.getAuthor());
        System.out.println("Publishment Date: "+magazine1.getPublishmentDate());
        System.out.println("Volume: "+magazine1.getVolume());
        System.out.println("Edition Number: "+magazine1.getEditionNumber());

        System.out.println("");

        System.out.println("Name: "+magazine2.getName());
        System.out.println("Author: "+magazine2.getAuthor());
        System.out.println("Publishment Date: "+magazine2.getPublishmentDate());
        System.out.println("Volume: "+magazine2.getVolume());
        System.out.println("Edition Number: "+magazine2.getEditionNumber());

        System.out.println("");
        // End zone.
    }
}
