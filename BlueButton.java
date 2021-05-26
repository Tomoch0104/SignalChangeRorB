import java.awt.*;
import javax.swing.*;

public class BlueButton extends JButton{
    
    // 生成する
    public BlueButton(BlueSetter bs){
        super("青にする");
        addActionListener(bs);  // アクションリスナー
    }
}
