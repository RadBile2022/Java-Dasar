package PolyGame;

/**
 *
 * @author WahRadar
 */
public class NoFlyer implements IFlyer{
    @Override
    public void fly() {
        System.out.println("saya tidak bisa terbang");
    }

    @Override
    public void landing() {
    }

    @Override
    public void takeOff() {
    }
}
