public class Cone extends Circular {
  public Cone(){
    setRadius(0);
    setHeight(0);
  } // end constructor
  public double getVolume(){
    return (this.radius*this.radius*this.height*1.05);
  } // end getVolume
} // end class def