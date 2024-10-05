public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv(false, 1, 0);
        
        // Showing instance values zone.
        System.out.println();
        System.out.println("On: " + smartTv.getOn());
        System.out.println("Channel: " + smartTv.getChannel());
        System.out.println("Volume: " + smartTv.getVolume());
        System.out.println();
        // End zone.
        

        // Changing instance values zone.
        smartTv.power();
        smartTv.changingChannelByNumber(15);
        smartTv.increaseVolume();
        // End zone.

        // Showing instance values zone.
        System.out.println();
        System.out.println("On: " + smartTv.getOn());
        System.out.println("Channel: " + smartTv.getChannel());
        System.out.println("Volume: " + smartTv.getVolume());
        System.out.println();
        // End zone.
    }
}
