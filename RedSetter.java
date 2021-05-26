import java.awt.*;
import java.awt.event.*;

public class RedSetter implements ActionListener{
    // 信号機
    private SignalDisplay signal;

    // 生成する
    public RedSetter(SignalDisplay sd){
        signal=sd;   // 信号機を覚えておく
    }

    // ボタンが押された通知
    public void actionPerformed(ActionEvent ev){
        SignalDisplay sr=new SignalDisplay();
        sr.setRed();
    }
}
