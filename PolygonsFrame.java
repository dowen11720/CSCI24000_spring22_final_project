import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PolygonsFrame extends JFrame implements ActionListener{
  //instance vars
  JButton trianglesButton = new JButton("Triangles");
  JButton quadsButton = new JButton("Quadrilaterals");
  JButton pentagonButton = new JButton("Pentagon");
  JButton hexagonButton = new JButton("Hexagon");

  public static void main(String args[]){
    new PolygonsFrame();
  } // end main
  
  public PolygonsFrame(){
    super();
    setupFrame();
  } // end constructor
  private void setupFrame(){
    Container surface = this.getContentPane();
    surface.setLayout(new GridLayout(0,1));
    surface.add(trianglesButton);
    surface.add(quadsButton);
    surface.add(pentagonButton);
    surface.add(hexagonButton);
    trianglesButton.addActionListener(this);
    quadsButton.addActionListener(this);
    pentagonButton.addActionListener(this);
    hexagonButton.addActionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width, screenSize.height);
    this.setTitle("Polygons");
    this.setVisible(true);
  } // end setupFrame

  public void actionPerformed(ActionEvent e){
    Object theButton = e.getSource();
    this.setVisible(false);
    if (theButton == trianglesButton){
      TrianglesFrame triFrame = new TrianglesFrame();
    } // end if
    else if (theButton == quadsButton){
      QuadrilateralsFrame quadsFrame = new QuadrilateralsFrame();
    } // end if
    else if (theButton == pentagonButton){
      PentagonFrame pentaFrame = new PentagonFrame();
    } // end if
    else if (theButton == hexagonButton){
      HexagonFrame hexFrame = new HexagonFrame();
    }
  } // end actionPerformed
} // end class def