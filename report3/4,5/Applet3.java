import java.applet.*;
import java.awt.*;

public class Applet3 extends Applet {
  public void init(){ //paint()メソッドではなくinit()メソッドに記述
    Button a = new Button("ボタンa"); //ボタンのインスタンスを作成する。インスタンス名をaとする。
    add(a); //ボタンをアプレットに追加する。
  }
}
