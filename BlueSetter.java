import java.awt.*;
import java.awt.event.*;

public class BlueSetter implements ActionListener{
    // 信号機
    private SignalDisplay signal;

    // 生成する
    public BlueSetter(SignalDisplay sd){
        signal=sd;   // 信号機を覚えておく
    }

    // ボタンが押された通知
    public void actionPerformed(ActionEvent ev){
        // SignalDisplay sd=new SignalDisplay();
        signal.setBlue();
    }
}
