import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuadrilateralsFrame extends JFrame implements ActionListener{
  //instance vars
  JButton rectangleButton = new JButton("Rectangle");
  JButton trapezoidButton = new JButton("Trapezoid");

  public static void main(String args[]){
    new QuadrilateralsFrame();
  } // end main
  
  public QuadrilateralsFrame(){
    super();
    setupFrame();
  } // end constructor
  private void setupFrame(){
    Container surface = this.getContentPane();
    surface.setLayout(new GridLayout(0,1));
    surface.add(rectangleButton);
    surface.add(trapezoidButton);
    rectangleButton.addActionListener(this);    
    trapezoidButton.addActionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Quadrilaterals");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    this.setVisible(false);
    if (theButton == rectangleButton){
      RectangleFrame rectFrame = new RectangleFrame();
    } // end if    else if (theButton == trapeoidutton){
    else if(theButton == trapezoidButton){
      TrapezoidFrame trapezoidFrame = new TrapezoidFrame();
    } // end if
  } // end actionPerformed
} // end class def