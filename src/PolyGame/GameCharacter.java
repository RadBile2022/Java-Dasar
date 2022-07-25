package PolyGame;

abstract public class GameCharacter {
    // DATA
    private IFlyer flyWith = new Rocket();
    private ISwimmer swimWith;
    private Rocket flyWithRocket;
    

    // A. METHOD SETTER
    public void setFlyWith(IFlyer flyWith) {
        this.flyWith = flyWith;
    }
    

    public void setSwimWith(ISwimmer swimWith) {
        this.swimWith = swimWith;
    }

    
    public void fly (){
        flyWith.fly();
    }
    
    public void swim(){
        swimWith.swim();
    }
}