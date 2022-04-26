public class Rectangle extends Shape {
  double width = 0;
  double height = 0;
  public Rectangle(){
    setWidth(0);
    setHeight(0);
  } // end constructor
  public void setHeight(double height){
    this.height = height;
  }
  public double getHeight(){
    return this.height;
  }
  public void setWidth(double width){
    this.width = width;
  }
  public double getWidth(){
    return this.width;
  }
  public double getArea(){
    return (this.width*this.height);
  } // end getArea
} // end class def