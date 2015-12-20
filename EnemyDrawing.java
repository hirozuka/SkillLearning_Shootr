 import java.awt.Color;
import java.awt.Graphics;


public class EnemyDrawing implements Drawing {
	private int x = 200;	// 円の始点x座標
	private int y = 0;	// 円の始点y座標
	private final int KUKEI =16;//
	private Color color = Color.WHITE;
	private int move_amount = 3; //x軸方向の移動量
	private int move_count = 0;  //移動方向変更用カウント
	private final int INIT_VALUE =0; //移動変更カウントの初期化値
	private final int RET_CNT = 30;  //移動変更カウントの上限値


	public EnemyDrawing(){

	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		// 色を設定して円を描画
		g.setColor(color);
		g.fillRect(x, y, KUKEI, KUKEI);
		g.fillRect(x+KUKEI*2, y, KUKEI, KUKEI);
		g.fillRect(x+KUKEI, y+KUKEI*2, KUKEI, KUKEI);
		g.setColor(Color.RED);
		g.fillOval(x+KUKEI-1, y+KUKEI-1, KUKEI, KUKEI);

	}

	@Override
	public void move() {
		// TODO 自動生成されたメソッド・スタブ
		y += 3;
		x += move_amount;

		//規定カウント数移動したら移動方向変更
		if(move_count == RET_CNT){
			move_amount *= -1;
			move_count = INIT_VALUE;

		}
		move_count ++;
	}

}
