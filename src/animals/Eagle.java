
package animals;


public class Eagle extends Bird {
    
    private String name = "Orao";
    private int lifeSpan = 15; 

    @Override
    public void info() {
        super.info();
        System.out.println("Naziv ptice je " + this.name);
        System.out.println("Zivotni vek: " + this.lifeSpan);
        
    }
    
    
    
}
