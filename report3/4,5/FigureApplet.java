import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FigureApplet extends Applet implements ActionListener{ //ボタンアクションのためActionListenerインターフェースを実装
  boolean circle = false; //図形判断のブーリアン型変数
  boolean polygon = false; 
  Button but1 ,but2; //Buttonクラスの変数を宣言
  public void init(){
    but1 = (Button)add(new Button("多角形 (3~8)角形がランダムで表示されます。")); //ボタンを作成
    but1.addActionListener(this); //ボタンを押した時にアクションを受け取れるようにする
    but2 = (Button)add(new Button("円 ランダムな位置で表示されます。"));
    but2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == but1){ //ボタンのアクションがオブジェクトbot1ならば
      polygon = true; //polygonをtrueにする
      repaint(); //paint()を呼び出す
    }else if(e.getSource() == but2){ //それ以外なら
      circle = true; //circleをtrueにする
      repaint(); //paint()を呼び出す
    }
  }

  public void paint(Graphics g){
    Random rand = new Random(); //ランダムな値を出すインスタンスを生成
    if(polygon == true){ //polygonがtrueなら
      int polygon = rand.nextInt(5)+3; //ランダムな値を整数型変数polygonに代入 polygonは角数を表す
      int[] xPoints = new int[polygon]; //描写される図形の角x座標が代入される配列xPointsを宣言
      int[] yPoints = new int[polygon]; //描写される図形の角y座標が代入される配列yPointsを宣言
      for(int count=0; count < polygon; count++){ //各配列にランダムな値を代入
        xPoints[count] = rand.nextInt(800);
        yPoints[count] = rand.nextInt(800);
      }
      g.drawPolygon(xPoints, yPoints, polygon); //(3~8)角形の描写
    } else if (circle == true){ //circleがtrueなら
      int x = rand.nextInt(800); //整数型変数xにランダムな値を代入
      int y = rand.nextInt(800); //整数型変数yにランダムな値を代入
      g.drawOval(x, y,60,60); //指定されたx,y座標に円を描写
    }
    circle = false;
    polygon = false;
  }
}
