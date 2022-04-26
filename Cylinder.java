public class Cylinder extends Circular {
  public Cylinder(){
    setRadius(0);
    setHeight(0);
  } // end constructor
  public double getVolume(){
    return (this.radius*this.radius*this.height*3.14);
  } // end getVolume
} // end class def