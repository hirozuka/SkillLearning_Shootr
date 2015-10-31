import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	private String MAIN_FRAME_TITLE = "しゅ～てぃんぐげ～む（仮）";

	public MainFrame() {
		// タイトルバーの設定
		setTitle(MAIN_FRAME_TITLE);
		// サイズ変更を禁止
		setResizable(false);
		// 終了の設定（ウィンドウを閉じてプログラム終了）
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
