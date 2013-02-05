import java.applet.*;
import java.awt.*;

public class Applet1 extends Applet {
  public void paint(Graphics g){
    int[] x = {100,50,150}; //描画する図形のx座標を指定
    int[] y = {50,100,100}; //描画する図形のy座標を指定
    g.drawPolygon(x,y,3); //配列x,yと3を引数とし,三角形を描画
  }
}
