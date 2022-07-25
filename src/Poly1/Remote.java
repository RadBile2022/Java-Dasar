package Poly1;

/**
 *
 * @author WahRadar
 */
public class Remote {
    private String channel;
    private int volume;

    public Remote(String channel, int volume) {
        this.channel = channel;
        this.volume = volume;
    }

    public String getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
    
    public void play(){
        System.out.println("Play : Remote Generic");
        System.out.println("Channel : " + getChannel());
        System.out.println("Volume : " + getVolume());
    }
}
