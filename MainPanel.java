import java.util.List;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

class MainPanel extends JPanel{
	// パネルサイズ
	public static final int PANEL_WIDTH = 640;
	public static final int PANEL_HEIGHT = 720;

	// 描画オブジェクトリスト
	private List<Drawing> drawingList = new ArrayList<Drawing>();

	/**
	/ コンストラクタ
	*/
	public MainPanel() {
		// パネルのサイズを設定
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}

	/**
	/ 描画オブジェクトの登録
	*/
	public void addDrawing(Drawing d) {
		drawingList.add(d);
	}

	/**
	/ パネルの描画処理
	*/
	public void paint(Graphics g) {
		// 基本的な描画はさせる
		super.paint(g);

		// 黒で画面クリア
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, PANEL_WIDTH, PANEL_HEIGHT);

		// 描画オブジェクトを描画する
		for(Drawing drawing : drawingList) {
			drawing.draw(g);
		}
	}
}