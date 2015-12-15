import java.security.SecureRandom;
import java.util.*;
import java.awt.*;

class SpaceStarDrawing{

	/** 星の色 */
	private Color color;
	/** 星の始点x座標 */
	private double x = 0;
	/** 星の始点y座標 */
	private double y = 0;
	/** 星の大きさx */
	private int x_size = 0;
	/** 星の大きさy */
	private int y_size = 0;
	/** 星の加速度 */
	private double a = 0;

	/**
	 * コンストラクタ
	 */
	public SpaceStarDrawing() {
		// Randomクラスのインスタンス化
		Random rnd = new SecureRandom();
		// 座標、大きさ、色、加速度をランダムで決定
		this.x = rnd.nextInt(MainPanel.PANEL_WIDTH);
		this.y = rnd.nextInt(MainPanel.PANEL_HEIGHT);
		this.x_size = 3;
		this.y_size = this.x_size;
		int tmp = rnd.nextInt(12);
		switch (tmp) {
			case 0:
				this.color = Color.blue;
				break;
			case 1:
				this.color = Color.gray;
				break;
			case 2:
				this.color = Color.gray;
				break;
			case 3:
				this.color = Color.gray;
				break;
			case 4:
				this.color = Color.gray;
				break;
			case 5:
				this.color = Color.gray;
				break;
			case 6:
				this.color = Color.gray;
				break;
			case 7:
				this.color = Color.gray;
				break;
			case 8:
				this.color = Color.gray;
				break;
			case 9:
				this.color = Color.red;
				break;
			case 10:
				this.color = Color.gray;
				break;
			case 11:
				this.color = Color.yellow;
				break;
		}
		a = 2 + rnd.nextInt(3) + rnd.nextDouble();
	}

	/**
	 * 動作
	 */
	public void move() {
		y += a;
		if (MainPanel.PANEL_HEIGHT < y) {
			y = 0;
		}
	}

	/**
	 * 描画処理
	 */
	public void draw(Graphics g) {
		// 色を設定して円を描画
		g.setColor(color);
		g.fillOval((int)this.x, (int)this.y, this.x_size, this.y_size);
	}


	public static void main(String[] args) {
		SpaceStarDrawing s = new SpaceStarDrawing();
		for(int i=0; i<10; i++) {
			s.move();
		}
	}
}