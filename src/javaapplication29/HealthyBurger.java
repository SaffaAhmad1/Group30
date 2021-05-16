
package javaapplication29;
public class HealthyBurger extends NormalBurger {
   

public HealthyBurger  (double price, String typeMeat) {
        super("Healthyburger",price, "brown bread", typeMeat);

    }

    public void ADDADITIONHEALTHY(String type, double BRICE ) {
        counter++;
        if (counter<=2){
            System.out.println("ADITIONAL  " + counter + " : " + type + " - " + BRICE );
            this.price = this.price+ BRICE;
        }
        else{
            System.out.println("Error supplement 2 maximum ");
        }
        
    }   

    @Override
    public String toString() {
        return "HealthyBurger{" + '}';
    }}


