public class Hexagon extends Shape {
  double sideLength = 0;
  public Hexagon(){
    setsideLength(0);
  } // end constructor
  public void setsideLength(double sideLength){
    this.sideLength = sideLength;
  }
  public double getsideLength(){
    return this.sideLength;
  }
  public double getArea(){
    return (this.sideLength*this.sideLength*2.6);
  }
} // end class def