import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EllipseFrame extends JFrame implements ActionListener{
  //instance vars
  ImageIcon theImage = new ImageIcon(getClass().getResource("ellipse.png"));
  JLabel picLabel = new JLabel(theImage);
  JButton submitButton = new JButton("Submit");
  JTextField horizRadiusText = new JTextField("Enter horizontal radius");
  JTextField vertRadiusText = new JTextField("Enter vertical radius");
  JLabel areaOutput = new JLabel("Area:");
  Ellipse theEllipse = new Ellipse();

  public static void main(String args[]){
    new EllipseFrame();
  } // end main
  
  public EllipseFrame(){
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
    surfaceSouth.add(horizRadiusText);
    surfaceSouth.add(vertRadiusText);
    surfaceSouth.add(submitButton);
    surfaceSouth.add(areaOutput);
    surface.add(surfaceCenter, BorderLayout.CENTER);
    surface.add(surfaceSouth, BorderLayout.SOUTH);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Ellipse");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    if (theButton == submitButton){
      String horizRadiusStr = horizRadiusText.getText();
      double horizRadius = Double.parseDouble(horizRadiusStr);
      theEllipse.setHorizRadius(horizRadius);
      String vertRadiusStr = vertRadiusText.getText();
      double vertRadius = Double.parseDouble(vertRadiusStr);
      theEllipse.setVertRadius(vertRadius);
      double area = theEllipse.getArea();
      String areaStr = String.valueOf(area);
      areaOutput.setText("Area: " + areaStr);
    } // end if
  } // end actionPerformed
} // end class def