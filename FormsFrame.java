import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormsFrame extends JFrame implements ActionListener{
  //instance vars
  JButton ellipsoidButton = new JButton("Ellipsoid");
  JButton coneButton = new JButton("Cone");
  JButton cylinderButton = new JButton("Cylinder");

  public static void main(String args[]){
    new FormsFrame();
  } // end main
  
  public FormsFrame(){
    super();
    setupFrame();
  } // end constructor
  private void setupFrame(){
    Container surface = this.getContentPane();
    surface.setLayout(new GridLayout(0,1));
    surface.add(ellipsoidButton);
    surface.add(coneButton);
    surface.add(cylinderButton);
    ellipsoidButton.addActionListener(this);
    coneButton.addActionListener(this);
    cylinderButton.addActionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Forms");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    this.setVisible(false);
    if (theButton == ellipsoidButton){
      EllipsoidFrame ellipsoidFrame = new EllipsoidFrame();
    } // end if
    else if (theButton == coneButton){
      ConeFrame coneFrame = new ConeFrame();
    } // end if
    else if (theButton == cylinderButton){
      CylinderFrame cylinderFrame = new CylinderFrame();
    } // end if
  } // end actionPerformed
} // end class def