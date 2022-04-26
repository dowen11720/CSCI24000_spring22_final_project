public class Triangle extends Shape {
  double base = 0;
  double height = 0;
  public Triangle(){
    setBase(0);
    setHeight(0);
  } // end constructor
  public void setHeight(double height){
    this.height = height;
  }
  public double getHeight(){
    return this.height;
  }
  public void setBase(double base){
    this.base = base;
  }
  public double getBase(){
    return this.base;
  }
  public double getArea(){
    return (this.base*this.height/2);
  }
} // end class def