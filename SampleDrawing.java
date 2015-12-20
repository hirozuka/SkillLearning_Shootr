import java.awt.Color;
import java.awt.Graphics;

public class SampleDrawing implements Drawing{

	private int x = 200;	// 円の始点x座標
	private int y = 0;	// 円の始点y座標
	private int x_size = 30; 	// 円の大きさx
	private int y_size = 30;	// 円の大きさy
	private Color color = Color.WHITE;

	/**
	/ コンストラクタ
	*/
	public SampleDrawing() {
	}

	/**
	/ 動作
	*/
	public void move() {
		x += 5;		// とりあえず、適当に
	}

	/**
	/ 描画処理
	*/
	public void draw(Graphics g) {
		// 色を設定して円を描画
		g.setColor(color);
		g.fillOval(this.x, this.y, this.x_size, this.y_size);
	}
}