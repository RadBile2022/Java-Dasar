package Poly1;

/**
 *
 * @author WahRadar
 */
public class Test {
    public static void main(String[] args) {
        // KALIMAT ASLI POLYMORPHISM
        Remote r1 = new Remote("SCTV", 9);
        Remote r2 = new Polytron("Indosat", "Indosiar", 7);
        Remote r3 = new Samsung("Telkomsel", "Trans7", 5, 4.3, 10);
        
        // A .REMOTE (PARENT CLASS)
        System.out.println("A. REMOTE PLAY");
        r1.play();
        
        // B. POLYTRON CHILD CLASS DOES'NT NOT OVERRIDE
        System.out.println("B. POLYTRON DOESN'T OVERRIDE PLAY");
        r2.play();
        
        // C. SAMSUNG CHILD CLASS USING OVERRIDE
        System.out.println("C. SAMSUNG OVERRIDE PLAY");
        r3.play();
        
        
        // 1. INSTANCE OF POLYTRON
        System.out.println("1. INSTANCE OF POLYTRON");
        if (r2 instanceof Polytron){
            Polytron p = (Polytron) r2;
            p.play();
            System.out.println(p.getInternet());
        }
        
        if (r2 instanceof Samsung){
            Samsung p1 = (Samsung)r2;
            p1.infoRemote();
        }// tidak berjalan karena r2 adalah polytron
        
        // 2. INSTANCE OF SAMSUNG
        System.out.println("\n2. INSTANCE OF SAMSUNG");
        if(r3 instanceof Samsung){
            Samsung s = (Samsung) r3;
            s.infoRemote();
        }
    }
}
