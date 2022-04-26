import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapesFrame extends JFrame implements ActionListener{
  //instance vars
  JButton polygonsButton = new JButton("Polygons");
  JButton ellipseButton = new JButton("Ellipse");

  public static void main(String args[]){
    new ShapesFrame();
  } // end main
  
  public ShapesFrame(){
    super();
    setupFrame();
  } // end constructor
  private void setupFrame(){
    Container surface = this.getContentPane();
    surface.setLayout(new GridLayout(0,1));
    surface.add(polygonsButton);
    surface.add(ellipseButton);
    polygonsButton.addActionListener(this);
    ellipseButton.addActionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Shapes");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    this.setVisible(false);
    if (theButton == polygonsButton){
      PolygonsFrame shapesFrame = new PolygonsFrame();
    } // end if
    else if (theButton == ellipseButton){
      EllipseFrame formsFrame = new EllipseFrame();
    }
  } // end actionPerformed
} // end class def