import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CylinderFrame extends JFrame implements ActionListener{
  //instance vars
  ImageIcon theImage = new ImageIcon(getClass().getResource("cylinder.png"));
  JLabel picLabel = new JLabel(theImage);
  JButton submitButton = new JButton("Submit");
  JTextField radiusText = new JTextField("Enter radius");
  JTextField heightText = new JTextField("Enter height");
  JLabel volumeOutput = new JLabel("Volume:");
  Cylinder theCylinder = new Cylinder();

  public static void main(String args[]){
    new CylinderFrame();
  } // end main
  
  public CylinderFrame(){
    super();
    setupFrame();
  } // end constructor
  private void setupFrame(){
    Container surface = this.getContentPane();
    surface.setLayout(new BorderLayout());

    Panel surfaceCenter = new Panel();
    surfaceCenter.setLayout(new FlowLayout());
    surfaceCenter.add(picLabel);

    Panel surfaceSouth = new Panel();
    surfaceSouth.setLayout(new GridLayout(0,1));
    surfaceSouth.add(radiusText);
    surfaceSouth.add(heightText);
    surfaceSouth.add(submitButton);
    surfaceSouth.add(volumeOutput);
    surface.add(surfaceCenter, BorderLayout.CENTER);
    surface.add(surfaceSouth, BorderLayout.SOUTH);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Cylinder");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    if (theButton == submitButton){
      String radiusStr = radiusText.getText();
      double radius = Double.parseDouble(radiusStr);
      theCylinder.setRadius(radius);
      String heightStr = heightText.getText();
      double height = Double.parseDouble(heightStr);
      theCylinder.setHeight(height);
      double volume = theCylinder.getVolume();
      String volumeStr = String.valueOf(volume);
      volumeOutput.setText("Volume: " + volumeStr);
    } // end if
  } // end actionPerformed
} // end class def