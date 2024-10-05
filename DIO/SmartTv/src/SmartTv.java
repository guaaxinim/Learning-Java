import java.util.Arrays;

public class SmartTv {

    private final int[] ALL_CHANNELS = {1, 5, 7, 10, 11, 15};
    private boolean on = false;
    private int channel = 1;
    private int volume = 20;

    public SmartTv(boolean on, int channel, int volume){
        this.on = on;
        this.channel = channel;
        this.volume = volume;
    }

    // Changing state zone.
    public void power(){
        this.on = !this.on;
    }
    // End zone.

    // Changing volume zone.
    public void increaseVolume(){
        if (this.on == false){
            System.out.println("The TV is off!");
        }
        else{
            if (this.volume == 100){
                System.out.println("Volume is already 100%");
            }
            else{this.volume++;}
        }
            
    }
    
    public void decreaseVolume(){
        if (this.on == false){
            System.out.println("The TV is off!");
        }
        else{
            if (this.volume == 0){
                System.out.println("Volume is already 0%");
            }
            else{this.volume--;}
        }
    }
    // End zone.

    // Changing channel zone.
    public void increaseChannel(){
        boolean inArray = Arrays.stream(ALL_CHANNELS).anyMatch(chan -> chan == this.channel);
        if (inArray){
            for (int i = 0; i <= ALL_CHANNELS.length; i++){
                if (ALL_CHANNELS[i] == this.channel){
                    int currentChannelIndex = i;
                    int nextChannelIndex = currentChannelIndex+1;
                    this.channel = ALL_CHANNELS[nextChannelIndex];
                    break;
                }
            }
        }
        else{System.out.println("Error message");}
    }

    public void decreaseChannel(){
        boolean inArray = Arrays.stream(ALL_CHANNELS).anyMatch(chan -> chan == this.channel);
        if (inArray){
            for (int i = 0; i <= ALL_CHANNELS.length; i++){
                int currentChannelIndex = i;
                int nextChannelIndex = currentChannelIndex-1;
                this.channel = ALL_CHANNELS[nextChannelIndex];
            }
        }
        else{System.out.println("Error message");}
    }

    public void changingChannelByNumber(int channelNumber){
        boolean inArray = Arrays.stream(ALL_CHANNELS).anyMatch(chan -> chan == channelNumber);
        if (inArray){
            this.channel = channelNumber;
        }
        else{System.out.println("Error message");}
    }
    // End zone.

    // Getting SmartTv atributtes zone.
    public boolean getOn(){
        return this.on;
    }

    public int getChannel(){
        return this.channel;
    }

    public int getVolume(){
        return this.volume;
    }
    // End zone.
}
