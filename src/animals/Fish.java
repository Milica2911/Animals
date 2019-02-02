
package animals;


public class Fish extends Animal {
    
    public String waterType = "Sea";
    public String outerCovering = "scales";

    @Override
    public void move() {
        System.out.println("Riba pliva.");
    }

    @Override
    public void eat() {
        System.out.println("Riba jede morsku hranu.");
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Lives in: " + this.waterType);
        System.out.println("Outer Covering: " + this.outerCovering);
    }
    
}
    
   
