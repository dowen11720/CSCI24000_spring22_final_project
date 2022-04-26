import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PentagonFrame extends JFrame implements ActionListener{
  //instance vars
  ImageIcon theImage = new ImageIcon(getClass().getResource("pentagon.png"));
  JLabel picLabel = new JLabel(theImage);
  JButton submitButton = new JButton("Submit");
  JTextField sideLengthText = new JTextField("Enter side length");
  JLabel areaOutput = new JLabel("Area:");
  Pentagon thePentagon = new Pentagon();

  public static void main(String args[]){
    new PentagonFrame();
  } // end main
  
  public PentagonFrame(){
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
    surfaceSouth.add(sideLengthText);
    surfaceSouth.add(submitButton);
    surfaceSouth.add(areaOutput);
    surface.add(surfaceCenter, BorderLayout.CENTER);
    surface.add(surfaceSouth, BorderLayout.SOUTH);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Regular Pentagon");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    if (theButton == submitButton){
      String sideLengthStr = sideLengthText.getText();
      double sideLength = Double.parseDouble(sideLengthStr);
      thePentagon.setsideLength(sideLength);
      double area = thePentagon.getArea();
      String areaStr = String.valueOf(area);
      areaOutput.setText("Area: " + areaStr);
    } // end if
  } // end actionPerformed
} // end class def