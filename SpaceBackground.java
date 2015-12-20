import java.awt.*;
import java.util.ArrayList;

class SpaceBackground implements Drawing{

	/** 星オブジェクト */
	private ArrayList<SpaceStarDrawing> SpaceStarDrawingList = new ArrayList<SpaceStarDrawing>();

	/**
	 * コンストラクタ
	 */
	public SpaceBackground() {
		for(int i=0; i<20; i++) {
			SpaceStarDrawingList.add(new SpaceStarDrawing());
		}
	}

	/**
	 * 動作
	 */
	public void move() {
		for(SpaceStarDrawing drawing : SpaceStarDrawingList) {
			drawing.move();
		}
	}

	/**
	 * 描画
	 */
	public void draw(Graphics g) {
		// 色を設定して円を描画
		for(SpaceStarDrawing drawing : SpaceStarDrawingList) {
			drawing.draw(g);
		}
	}
}