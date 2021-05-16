
package javaapplication29;

public class JavaApplication29 {

    public static void main(String[] args) {
       System.out.println("NORMAL BURGER");
  NormalBurger mynormalburger = new NormalBurger("NormalBurger",60, "brown||white", "beef||chicken") ;
 
  mynormalburger.ADDADITIONNORMAL("Tomatos", 3);   
  mynormalburger.ADDADITIONNORMAL("cheese", 4);
  mynormalburger.ADDADITIONNORMAL("Onions", 5);
  mynormalburger.ADDADITIONNORMAL("Ketchup",6 );
    System.out.println("__");
   mynormalburger.total();
   mynormalburger.toString();
    System.out.println("-----------------------");
    
     System.out.println("Healthy Burger ");
    HealthyBurger st = new HealthyBurger( 60 ,"beef||chicken");
    st.ADDADITIONHEALTHY( "Tomatos", 3);
    st.ADDADITIONHEALTHY("cheese", 4);
    System.out.println("__");
    st.total();
    st.toString();
    
    System.out.println("-----------------------");
    System.out.println(" DeluxeBurger ");
    DeluxeBurger sc = new DeluxeBurger (60 ,"beef||chicken" );
    sc.ADDADITIONDELUXE( "chips", 5);
    sc.ADDADITIONDELUXE( "drink", 10);
    System.out.println("__");
    sc.total();
    sc.toString();
    }
    
}
    
    

