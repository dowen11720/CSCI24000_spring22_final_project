import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrapezoidFrame extends JFrame implements ActionListener{
  //instance vars
  ImageIcon theImage = new ImageIcon(getClass().getResource("trapezoid.png"));
  JLabel picLabel = new JLabel(theImage);
  JButton submitButton = new JButton("Submit");
  JTextField baseOneText = new JTextField("Enter bottom base value");
  JTextField baseTwoText = new JTextField("Enter top base value");
  JTextField heightText = new JTextField("Enter height value");
  JLabel areaOutput = new JLabel("Area:");
  Trapezoid theTrapezoid = new Trapezoid();

  public static void main(String args[]){
    new TrapezoidFrame();
  } // end main
  
  public TrapezoidFrame(){
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
    surfaceSouth.add(baseOneText);
    surfaceSouth.add(baseTwoText);
    surfaceSouth.add(heightText);
    surfaceSouth.add(submitButton);
    surfaceSouth.add(areaOutput);
    surface.add(surfaceCenter, BorderLayout.CENTER);
    surface.add(surfaceSouth, BorderLayout.SOUTH);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Trapezoid");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    if (theButton == submitButton){
      String baseOneStr = baseOneText.getText();
      double baseOne = Double.parseDouble(baseOneStr);
      theTrapezoid.setBaseOne(baseOne);
      String baseTwoStr = baseTwoText.getText();
      double baseTwo = Double.parseDouble(baseTwoStr);
      theTrapezoid.setBaseTwo((baseTwo));
      String heightStr = heightText.getText();
      double height = Double.parseDouble(heightStr);
      theTrapezoid.setHeight((height));
      double area = theTrapezoid.getArea();
      String areaStr = String.valueOf(area);
      areaOutput.setText("Area " + areaStr);
    } // end if
  } // end actionPerformed
} // end class def