package PolyGame;

/**
 * @author WahRadar
 */
public class Test_Game {
    public static void main(String[] args) {
        KuraKura kura = new KuraKura();
        kura.setFlyWith(new NoFlyer());
        kura.fly();
        
        Rocket redRocket = new Rocket();
        System.out.println("Kura menemukan item Rocket");
        kura.setFlyWith(redRocket);
        kura.fly();
        
        // aplikasi lebih reusable
        Bird bird = new Bird();
        bird.setFlyWith(new Sayap());
        bird.fly();
        
        // ternyata ketembak, sayap patah
        System.out.println("\nBurung Ditembak, Sayap Patah");
        bird.setFlyWith(new NoFlyer());
        bird.fly();
        
        bird.setFlyWith(redRocket);
        bird.fly();
        
        System.out.println("\nIkan berengang dengan sirip");
        Fish fish = new Fish();
        fish.setSwimWith(new Sirip());
        fish.swim();
    }
}
 