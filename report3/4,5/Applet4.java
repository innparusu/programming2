import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet4 extends Applet implements ActionListener {
  Button a;
  int number;
  public void init(){
    a = new Button("ボタンa");
    add(a);
    a.addActionListener(this); //ボタンにアクションを受け取れるようにする。アクション処理を記述するクラスはthis(このApplet4クラス)で記述する。
  }
  public void actionPerformed(ActionEvent e){ //アクションの内容を記述するactionPerformed()メソッド
    if(e.getSource() == a){ //getSouce()メソッドはこのアクションがどのオブジェクトから呼び出されたかを調べる。
        number ++;
        repaint(); //再びpaint()メソッドを呼び出す。
    }
  }
  public void paint(Graphics g){
    g.drawString(String.valueOf(number),100,100); //文字列を出力する。numberはint型であるため,valueOf()メソッドでString型に変換する。
  }
}

