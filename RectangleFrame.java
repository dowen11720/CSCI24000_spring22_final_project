import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RectangleFrame extends JFrame implements ActionListener{
  //instance vars
  ImageIcon theImage = new ImageIcon(getClass().getResource("rectangle.jpg"));
  JLabel picLabel = new JLabel(theImage);
  JButton submitButton = new JButton("Submit");
  JTextField widthText = new JTextField("Enter width");
  JTextField heightText = new JTextField("Enter height");
  JLabel areaOutput = new JLabel("Area:");
  Rectangle theRectangle = new Rectangle();

  public static void main(String args[]){
    new RectangleFrame();
  } // end main
  
  public RectangleFrame(){
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
    surfaceSouth.add(widthText);
    surfaceSouth.add(heightText);
    surfaceSouth.add(submitButton);
    surfaceSouth.add(areaOutput);
    surface.add(surfaceCenter, BorderLayout.CENTER);
    surface.add(surfaceSouth, BorderLayout.SOUTH);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Rectangle");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    if (theButton == submitButton){
      String widthStr = widthText.getText();
      double width = Double.parseDouble(widthStr);
      theRectangle.setWidth(width);
      String heightStr = heightText.getText();
      double height = Double.parseDouble(heightStr);
      theRectangle.setHeight(height);
      double area = theRectangle.getArea();
      String areaStr = String.valueOf(area);
      areaOutput.setText("Area: " + areaStr);
    } // end if
  } // end actionPerformed
} // end class def