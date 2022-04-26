public class Pentagon extends Shape {
  double sideLength = 0;
  public Pentagon(){
    setsideLength(0);
  } // end constructor
  public void setsideLength(double sideLength){
    this.sideLength = sideLength;
  }
  public double getsideLength(){
    return this.sideLength;
  }
  public double getArea(){
    return (this.sideLength*this.sideLength*1.72);
  }
} // end class def