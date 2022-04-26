import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomeFrame extends JFrame implements ActionListener{
  //instance vars
  JButton shapesButton = new JButton("Shapes");
  JButton formsButton = new JButton("Forms");

  public static void main(String args[]){
    new HomeFrame();
  } // end main
  
  public HomeFrame(){
    super();
    setupFrame();
  } // end constructor
  private void setupFrame(){
    Container surface = this.getContentPane();
    surface.setLayout(new GridLayout(0,1));
    surface.add(shapesButton);
    surface.add(formsButton);
    shapesButton.addActionListener(this);
    formsButton.addActionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Fun with Geometry");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    this.setVisible(false);
    if (theButton == shapesButton){
      ShapesFrame shapesFrame = new ShapesFrame();
    } // end if
    else if (theButton == formsButton){
      FormsFrame formsFrame = new FormsFrame();
    }
  } // end actionPerformed
} // end class def