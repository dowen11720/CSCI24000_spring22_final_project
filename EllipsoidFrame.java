import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EllipsoidFrame extends JFrame implements ActionListener{
  //instance vars
  ImageIcon theImage = new ImageIcon(getClass().getResource("ellipsoid.jpg"));
  JLabel picLabel = new JLabel(theImage);
  JButton submitButton = new JButton("Submit");
  JTextField yRadiusText = new JTextField("Enter 'a' value");
  JTextField xRadiusText = new JTextField("Enter 'b' value");
  JTextField zRadiusText = new JTextField("Enter 'c' value");
  JLabel volumeOutput = new JLabel("Volume:");
  Ellipsoid theEllipsoid = new Ellipsoid();

  public static void main(String args[]){
    new EllipsoidFrame();
  } // end main
  
  public EllipsoidFrame(){
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
    surfaceSouth.add(yRadiusText);
    surfaceSouth.add(xRadiusText);
    surfaceSouth.add(zRadiusText);
    surfaceSouth.add(submitButton);
    surfaceSouth.add(volumeOutput);
    surface.add(surfaceCenter, BorderLayout.CENTER);
    surface.add(surfaceSouth, BorderLayout.SOUTH);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Ellispoid");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    if (theButton == submitButton){
      String yRadiusStr = yRadiusText.getText();
      double yRadius = Double.parseDouble(yRadiusStr);
      theEllipsoid.setyRadius(yRadius);
      String xRadiusStr = xRadiusText.getText();
      double xRadius = Double.parseDouble(xRadiusStr);
      theEllipsoid.setxRadius((xRadius));
      String zRadiusStr = zRadiusText.getText();
      double zRadius = Double.parseDouble(zRadiusStr);
      theEllipsoid.setzRadius((zRadius));
      double volume = theEllipsoid.getVolume();
      String volumeStr = String.valueOf(volume);
      volumeOutput.setText("Volume: " + volumeStr);
    } // end if
  } // end actionPerformed
} // end class def