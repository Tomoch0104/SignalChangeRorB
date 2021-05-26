import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignalManager extends JFrame{
    
    // 生成する
    public SignalManager(){
        super("信号管理システム");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // オブジェクトを生成する
        SignalDisplay sd=new SignalDisplay(); // 信号機
        RedSetter rs=new RedSetter(sd);       // 赤設定者
        BlueSetter bs=new BlueSetter(sd);     // 青設定者
        RedButton rb=new RedButton(rs);       // 赤ボタン
        BlueButton bb=new BlueButton(bs);     // 青ボタン

        // 配置する
        JPanel p=new JPanel();        // パネルを生成
        p.add(rb);                    // 赤ボタンを置く
        p.add(bb);                    // 青ボタンを置く
        add(p,BorderLayout.NORTH);    // パネルを置く
        add(sd);
    }

    // メイン
    public static void main(String[] args){
        (new SignalManager()).setVisible(true);
    }
}
