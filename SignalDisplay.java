import java.awt.*;
import javax.swing.*;

public class SignalDisplay extends JPanel{
    // 現在の色
    private Color color;

    // 生成する
    public SignalDisplay(){
        color=Color.red;     // 最初の色は赤
    }

    // 赤にする
    public void setRed(){
        color=Color.red;   // 赤にして
        repaint();
    }

    // 青にする
    public void setBlue(){
        color=Color.blue;   // 青にして
        repaint();
    }

    // 描画する
    public void paintComponent(Graphics g){
        System.out.println("ペイントコンポーネントの呼び出し");
        super.paintComponent(g);
        int w=getWidth(),h=getHeight();      // 大きさ
        g.setColor(Color.white);             // 白で
        g.fillRect(0,0,w,h);                 // 全体を塗りつぶす
        int cx=w/2,cy=h/2;                   // 中心座標
        g.setColor(color);                   // 現在の色で
        g.fillOval(cx-100,cy-100,200,200);   // 円を描画する
    }
}