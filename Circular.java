public class Circular extends Form {
  double radius = 0;
  double height = 0;
  public Circular(){
    setRadius(0);
    setHeight(0);
  } // end constructor
  public void setHeight(double height){
    this.height = height;
  }
  public double getHeight(){
    return this.height;
  }
  public void setRadius(double radius){
    this.radius = radius;
  }
  public double getRadius(){
    return this.radius;
  }
  public double getVolume(){
    return 0;
  }
} // end class def