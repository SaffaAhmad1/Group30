
package javaapplication29;

public class DeluxeBurger extends NormalBurger{
    public DeluxeBurger(double price, String typeMeat) {
        super( "DeluxeBurger",price,"white" , typeMeat);
    }

    

  
       public void ADDADITIONDELUXE(String type, double BRICE ) {
        counter++;
        if (counter<=2){
            System.out.println(" ADITIONAL " + counter + " : " + type + " - " + BRICE );
            this.price = this.price+ BRICE;
        }
        else{
            System.out.println("Error supplement 2 maximum ");
        }
    } 

    @Override
    public String toString() {
        return "DeluxeBurger{" + '}';
}}
