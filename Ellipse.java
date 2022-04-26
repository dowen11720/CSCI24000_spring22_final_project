public class Ellipse extends Shape {
  double vertRadius = 0;
  double horizRadius = 0;
  public Ellipse(){
    setVertRadius(0);
    setHorizRadius(0);
  } // end constructor
  public void setVertRadius(double vertRadius){
    this.vertRadius = vertRadius;
  }
  public double getVertRadius(){
    return this.vertRadius;
  }
  public void setHorizRadius(double horizRadius){
    this.horizRadius = horizRadius;
  }
  public double getHorizRadius(){
    return this.horizRadius;
  }
  public double getArea(){
    return (this.vertRadius*this.horizRadius*3.14);
  } // end getArea
  public boolean isCircle(){
    if (horizRadius == vertRadius){
      return true;
    } // end if
    else{
      return false;
    } // end else
  }// end isCircle
} // end class def