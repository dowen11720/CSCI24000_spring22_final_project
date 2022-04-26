public class Trapezoid extends Shape {
  double baseOne = 0;
  double height = 0;
  double baseTwo = 0;
  public Trapezoid(){
    setBaseOne(0);
    setHeight(0);
    setBaseTwo(0);
  } // end constructor
  public void setHeight(double height){
    this.height = height;
  }
  public double getHeight(){
    return this.height;
  }
  public void setBaseOne(double baseOne){
    this.baseOne = baseOne;
  }
  public double getBaseOne(){
    return this.baseOne;
  }
  public void setBaseTwo(double baseTwo){
    this.baseTwo = baseTwo;
  }
  public double getBaseTwo(){
    return this.baseTwo;
  }
  public double getArea(){
    return ((this.baseOne + this.height)/2*this.height);
  }
} // end class def