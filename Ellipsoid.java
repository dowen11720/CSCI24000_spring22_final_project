public class Ellipsoid extends Form {
  double xRadius = 0;
  double yRadius = 0;
  double zRadius = 0;
  public Ellipsoid(){
    setxRadius(0);
    setyRadius(0);
    setzRadius(0);
  } // end constructor
  public void setxRadius(double xRadius){
    this.xRadius = xRadius;
  }
  public double getxRadius(){
    return this.xRadius;
  }
  public void setyRadius(double yRadius){
    this.yRadius = yRadius;
  }
  public double getyRadius(){
    return this.yRadius;
  }
  public void setzRadius(double zRadius){
    this.zRadius = zRadius;
  }
  public double getzRadius(){
    return this.zRadius;
  }
  public double getVolume(){
    return (this.xRadius*this.yRadius*zRadius*4.2);
  } // end getVolume
} // end class def