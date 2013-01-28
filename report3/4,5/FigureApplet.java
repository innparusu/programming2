import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FigureApplet extends Applet implements ActionListener{
    boolean circle = false;
    boolean polygon = false;
    public void init(){
        Button but1 = (Button)add(new Button("多角形 (3~8)角形がランダムで表示されます。"));
        but1.addActionListener(this);
        Button but2 = (Button)add(new Button("円 ランダムな位置で表示されます。"));
        but2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
      if(e.getActionCommand() == "多角形 (3~8)角形がランダムで表示されます。"){
        polygon = true;
        repaint();
      }
      else{
        circle = true;
        repaint();
      }
    }

    public void paint(Graphics g){
      Random rand = new Random(); //ランダムな値を出すインスタンスを生成
      if(polygon == true){
        int polygon = rand.nextInt(5)+3;
        int[] xPoints = new int[polygon];
        int[] yPoints = new int[polygon];
        for(int count=0; count < polygon; count++){
          xPoints[count] = rand.nextInt(800);
          yPoints[count] = rand.nextInt(800);
        }
        g.drawPolygon(xPoints, yPoints, polygon);
      } else if (circle == true){
        int x = rand.nextInt(800);
        int y = rand.nextInt(800);
        g.drawOval(x, y,60,60);
      }
      circle = false;
      polygon = false;
    }
}

