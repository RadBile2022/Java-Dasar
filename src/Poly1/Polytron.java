package Poly1;

/**
 * @author WahRadar
 */
public class Polytron extends Remote{
    private String internet;

    public Polytron(String internet, String channel, int volume) {
        super(channel, volume);
        this.internet = internet;
    }

    public String getInternet() {
        return internet;
    }
    
}
