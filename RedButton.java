import java.awt.*;
import javax.swing.*;

public class RedButton extends JButton{

    // 生成する
    public RedButton(RedSetter rs){
        super("赤にする");
        addActionListener(rs);  // アクションリスナー
    }
}