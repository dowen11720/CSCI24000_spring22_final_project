import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TrianglesFrame extends JFrame implements ActionListener{
  //instance vars
  ImageIcon theImage = new ImageIcon(getClass().getResource("triangle.jpg"));
  JLabel picLabel = new JLabel(theImage);
  JButton submitButton = new JButton("Submit");
  JTextField baseText = new JTextField("Enter base");
  JTextField heightText = new JTextField("Enter height");
  JLabel areaOutput = new JLabel("Area:");
  Triangle theTriangle = new Triangle();

  public static void main(String args[]){
    new TrianglesFrame();
  } // end main
  
  public TrianglesFrame(){
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
    surfaceSouth.add(baseText);
    surfaceSouth.add(heightText);
    surfaceSouth.add(submitButton);
    surfaceSouth.add(areaOutput);
    surface.add(surfaceCenter, BorderLayout.CENTER);
    surface.add(surfaceSouth, BorderLayout.SOUTH);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Triangle");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    if (theButton == submitButton){
      String baseStr = baseText.getText();
      double base = Double.parseDouble(baseStr);
      theTriangle.setBase(base);
      String heightStr = heightText.getText();
      double height = Double.parseDouble(heightStr);
      theTriangle.setHeight(height);
      double area = theTriangle.getArea();
      String areaStr = String.valueOf(area);
      areaOutput.setText("Area: " + areaStr);
    } // end if
  } // end actionPerformed
} // end class def