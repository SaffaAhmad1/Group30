
package javaapplication29;

public class NormalBurger {
    
  // Attributes 
String name;
  double price; 
  private String typeBread;
  private String typeMeat;
  int counter; 


  public NormalBurger (String name,double price, String typeBread, String typeMeat)
  { this.name=name;
    this.price = 60;
    this.typeBread = typeBread;
    this.typeMeat = typeMeat;
    this.counter = 0;

    System.out.println( this.getTypeBread() + " - " + this.typeMeat + " - " + this.getPrice() );
  }

    public NormalBurger() {
    }
  

  // add supplement 4 maximum
 final public void ADDADITIONNORMAL(String type,double BRICE)
  {
    counter++;
    if(counter <= 4)
    {
      System.out.println("ADITIONAL " + counter + " : " + type + " - "+ BRICE );
      this.price = this.price + BRICE ; 
    }
    else
    {
      System.out.println("Error supplement maximum is 4 ");
    }
  }

 final public void total()
  {
    System.out.println("Total => " + this.getPrice() ); 
  }

   /* public void setPrice(double price) {
        this.price = price;
    }*/

    public void setTypeBread(String typeBread) {
        this.typeBread = typeBread;
    }

    public void setTypeMeat(String typeMeat) {
        this.typeMeat = typeMeat;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
  //  getters

  public double getPrice()
  {
    return price; 
  }

  public String getTypeBread()
  {
    return typeBread;
  }

  public String getTypeMeat()
  {
    return typeMeat;
  }

  public int getCounter()
  {
    return counter;
  }

    @Override
    public String toString() {
        return  "price=" + price + ", typeBread=" + typeBread + ", typeMeat=" + typeMeat + ", counter=" + counter + '}';
    }
  

}
