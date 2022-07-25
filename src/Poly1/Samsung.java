package Poly1;

/**
 * @author WahRadar
 */
public class Samsung extends Remote{
    private String internet;
    private double kuota;
    private int masaAktif;

    public Samsung(String internet,  String channel, int volume,double kuota, int masaAktif) {
        super(channel, volume);
        this.internet = internet;
        this.kuota = kuota;
        this.masaAktif = masaAktif;
    }

    
    public String getInternet() {
        return internet;
    }

    public double getKuota() {
        return kuota;
    }

    public int getMasaAktif() {
        return masaAktif;
    }

    @Override
    public void play() {
        System.out.println("Override Play : Remote Samsung");
        System.out.println("Channel : " + getChannel());
        System.out.println("Volume : " + getVolume());
        System.out.println("Internet : " + getInternet());
        System.out.println();
        System.out.println();
    }
    
    public void infoRemote(){
        System.out.println("Limited Samsung Remote");
        System.out.println("Channel : " + getChannel());
        System.out.println("Volume : " + getVolume());
        System.out.println("Internet : " + getInternet());
        System.out.println("Kuota : " + getKuota() + " GB");
        System.out.println("Masa Aktif : " + getMasaAktif() + " Hari");
    }
    
    
    
}
