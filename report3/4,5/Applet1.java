import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Applet1 extends Applet {
  public void paint(Graphics g){
    int[] x = {100,50,150};
    int[] y = {50,100,100};
    g.drawPolygon(x,y,3);
  }
}
