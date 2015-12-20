import java.awt.Container;

class MainThread implements Runnable {
	// スレッドの休止時間（ms）
	private static final int THREAD_SLEEP = 17;

	// メインフレーム
	private MainFrame frame;
	// メインパネル
	private MainPanel panel;
	// メインスレッド
	private Thread thread;

	/**
	/  mainメソッド
	*/
	public static void main(String[] args) {
		MainThread mainThread = new MainThread();
	}

	/**
	/  コンストラクタ
	*/
	public MainThread() {
		//-----------------------------------------------------------
		//  Windowの初期構築
		//-----------------------------------------------------------
		// メインフレームの作成
		frame = new MainFrame();
		// メインパネルを作成してメインフレームに追加
		panel = new MainPanel();
		Container contentPane = frame.getContentPane();
		contentPane.add(panel);
		// パネルに合わせてフレームのサイズ変更
		frame.pack();
		// フレームの表示
		frame.setVisible(true);

		// スレッド開始
		thread = new Thread(this);
		thread.start();

	}

	/**
	/  スレッド処理。ゲームのメインループ
	*/
	public void run() {

		// サンプル用の描画オブジェクトを生成
		SampleDrawing sample = new SampleDrawing();
		EnemyDrawing sample1 = new EnemyDrawing();

		// パネルに描画オブジェクトを登録
		panel.addDrawing(sample1);

		while(true) {
			// 描画オブジェクトを動かす
			sample1.move();
			// パネルに再描画処理を指示
			panel.paintImmediately(0, 0, MainPanel.PANEL_WIDTH, MainPanel.PANEL_HEIGHT);

			// 一定時間訂正させる（ms）
			try {
				thread.sleep(THREAD_SLEEP);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}