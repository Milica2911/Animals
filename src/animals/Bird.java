
package animals;


public class Bird extends Animal {
    
    private String reproduction = "egg";
    private String outerCovering = "feather";
    private Insect favouriteInsect;

    
    
    @Override
    public void move() {
        System.out.println("Ptica leti.");
    }

    @Override
    public void eat() {
        System.out.println("Ptica kljuca.");
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Reproduction: " + this.reproduction);
        System.out.println("Outer Covering: " + this.outerCovering);
    }
   
    
    
    
}
