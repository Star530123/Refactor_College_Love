package Love_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea; 

public class Love_project extends JFrame implements ActionListener {

	int n = 0;// next執行變數
	int jump = 0;// 按鈕跳走
	int m = 0;// 結局分支變數


	// 全域變數↓---------------------------------------
	static JPanel pl0 = new JPanel();// 封面panel(放按鈕)
	static JPanel pl1 = new JPanel();// 第1頁下方panel
	static JPanel color = new JPanel();// 馬賽克

	static JTextArea story = new JTextArea(); // 文字敘述

	static JButton btn_next = new JButton("NEXT");
	static JButton btn_back = new JButton("BACK");
	static JButton btn0_1 = new JButton("開始");
	static JButton btn0_2 = new JButton("如果你是高富帥");
	static JButton btn1 = new JButton("a");
	static JButton btn2 = new JButton("b");
	static JButton btn3 = new JButton("c");

	static String girl = "Heroine";// 女主角名字
	// ↑------------------------------------------------

//	愛心變數--------------------------------------------
	public static JPanel panelLove = new JPanel();   //愛心圖案
	public static JLabel labelBack = new JLabel();   //血條背景色(粉紅)
	public static JLabel labelColor = new JLabel();  //調整血條用(白色)
	public int finalPosition;         //每次增減後的最終血條位置
	public static int x_Location = 70;	      //血條位置(x軸) (固定)
	public static int y_Location = 100;      //愛心位置(y軸) (動態)
	public static int colorLen;			  //血條長度
	public static int judge = 0;			  //第幾個back鍵
	public static int scene = 0;			  //哪一個button
	public static int backInitialSize = 100; //初始血條長度  = (200-backInitialSize)
	public static int score11 = -15;
	public static int score12 = -5;
	public static int score13 = 10;
	public static int score21 = -15;
	public static int score22 = -5;
	public static int score23 = 10;
	public static int score31 = -15;
	public static int score32 = -5;
	public static int score41 = -100;
	public static int score42 = -100;
	public static int score43 = 200;
	
//	----------------------------------------------------
	
// 照片宣告區↓-------------------------------------
	static ImageIcon bg = null;
	static ImageIcon bggif_1 = null;
	static ImageIcon bggif_2 = null;
	static JLabel Bg = null;
	static JLabel Bggif_1 = null;
	static JLabel Bggif_2 = null;

	static ImageIcon gif_1 = null, gif_2 = null, gif_3 = null, gif_4 = null;
	static JLabel Gif_1 = null, Gif_2 = null, Gif_3 = null, Gif_4 = null;

	static ImageIcon bg_1 = null, bg_11 = null, bg_12 = null, bg_13 = null, bg_14 = null;
	static JLabel Bg_1 = null, Bg_11 = null, Bg_12 = null, Bg_13 = null, Bg_14 = null;

	static ImageIcon bg_2 = null, bg_21 = null, bg_22 = null, bg_23 = null, bg_24 = null, bg_25 = null, bg_26 = null,
			bg_27 = null, bg_28 = null, bg_29 = null;
	static JLabel Bg_2 = null, Bg_21 = null, Bg_22 = null, Bg_23 = null, Bg_24 = null, Bg_25 = null, Bg_26 = null,
			Bg_27 = null, Bg_28 = null, Bg_29 = null;

	static ImageIcon bg_31 = null, bg_32 = null, bg_33 = null, bg_34 = null, bg_35 = null, bg_36 = null, bg_37 = null,
			bg_38 = null, bg_39 = null;
	static JLabel Bg_31 = null, Bg_32 = null, Bg_33 = null, Bg_34 = null, Bg_35 = null, Bg_36 = null, Bg_37 = null,
			Bg_38 = null, Bg_39 = null;
	// ↑------------------------------------------------
	
//	圖片輸入-------------------------------------------------------------------------------
	public static ImageIcon getIcon(String filePath) {  
	Image img;
	img = Toolkit.getDefaultToolkit().getImage(filePath);
	ImageIcon icon = new ImageIcon(img);
	return icon;
	}
//	------------------------------------------------------------
	public static void main(String[] args) { // 主要code
		Love_project frame = new Love_project();
		frame.setVisible(true);
		frame.setSize(809, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		pl0.setLayout(null);// 封面panel
		pl0.setSize(800, 635);//450
		pl0.setLocation(0, 0);

		pl1.setLayout(null);// 下方panel
		pl1.setSize(809, 160);
		pl1.setLocation(0, 450);
		pl1.setBackground(Color.PINK);

		color.setSize(115, 43);
		color.setLocation(133, 353);
		color.setBackground(Color.WHITE);
		frame.add(color);
		color.setVisible(false);

		story.setLocation(20, 20);// 文字敘述區
		story.setSize(600, 430);
		story.setText(girl + "：\n  你好~我叫" + girl);
		story.setFont(new Font("文鼎甜妞體B", Font.BOLD, 26));
		story.setBackground(Color.PINK);
		pl1.add(story);

		// 第一區元件↓~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		btn0_1.setLocation(300, 280);
		btn0_1.setSize(200, 50);
		btn0_1.setFont(new Font("文鼎甜妞體B", Font.BOLD, 32));
		btn0_2.setLocation(300, 340);
		btn0_2.setSize(200, 50);
		btn0_2.setFont(new Font("文鼎甜妞體B", Font.BOLD, 20));

		// 第二區元件↓~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		btn_next.setLocation(650, 85);
		btn_next.setSize(80, 30);
		btn_back.setLocation(650, 115);
		btn_back.setSize(80, 30);
		btn1.setLocation(10, 30);
		btn1.setSize(200, 50);
		btn1.setFont(new Font("文鼎甜妞體B", Font.BOLD, 32));
		btn2.setLocation(300, 30);
		btn2.setSize(200, 50);
		btn2.setFont(new Font("文鼎甜妞體B", Font.BOLD, 32));
		btn3.setLocation(580, 30);
		btn3.setSize(200, 50);
		btn3.setFont(new Font("文鼎甜妞體B", Font.BOLD, 32));

		// 背景照片↓-------------------------------------
		try {
			
//			愛心血條圖片---------------------------------------------------------
			ImageIcon icon = new ImageIcon(new URL("http://pic.90sjimg.com/design/00/21/84/57/58fc9396ec265.png"));
			Image image = icon.getImage();
			Image newImg = image.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
			// ↑ 調整愛心圖案大小
			icon = new ImageIcon(newImg);  // 將類別'Image' 變成 'ImageIcon'
			JLabel lb = new JLabel(icon);
			
			panelLove.setSize(30, 30);
			panelLove.setBackground(new Color(0, 0, 0, 0));
			panelLove.setLocation(x_Location - 10, y_Location + backInitialSize - 20);
			panelLove.add(lb);

			labelBack.setSize(10, 200);
			labelBack.setLocation(x_Location, y_Location);
			labelBack.setOpaque(true);   //label初始設定為透明，故要變成不透明
			labelBack.setBackground(Color.PINK);

			labelColor.setSize(10, backInitialSize);
			labelColor.setLocation(x_Location, y_Location);
			labelColor.setOpaque(true);	 //label初始設定為透明，故要變成不透明
			labelColor.setBackground(Color.WHITE);

			frame.add(panelLove);
			frame.add(labelColor);
			frame.add(labelBack);

			panelLove.setVisible(false);
			labelColor.setVisible(false);
			labelBack.setVisible(false);
//			---------------------------------------------------------------------
			Picture picture = new Picture();
		
//			開始頁面
			Bggif_1 = picture.setPicture(bggif_1,Bggif_1,frame,"bggif_1.gif",50,240,200,200,true);
			Bggif_2 = picture.setPicture(bggif_2,Bggif_2,frame,"bggif_2.gif",500,240,200,200,true);
			Bg = picture.setPicture(bg, Bg, frame, "bg.png", 0, -80, 835, 700, true);
			
//			第一幕
			Bg_1 = picture.setPicture(bg_1, Bg_1, frame, "bg_1.png", 0, 0, 835, 450, false);
			Bg_11 = picture.setPicture(bg_11, Bg_11, frame, "bg_11.png", 0, 0, 835, 450, false);
			Bg_12 = picture.setPicture(bg_12, Bg_12, frame, "bg_12.png", 0, 0, 835, 450, false);
			Bg_13 = picture.setPicture(bg_13, Bg_13, frame, "bg_13.png", 0, 0, 835, 450, false);
			Bg_14 = picture.setPicture(bg_14, Bg_14, frame, "bg_14.png", 0, 0, 835, 450, false);
			
//			第二幕
			Bg_2 = picture.setPicture(bg_2, Bg_2, frame, "bg_2.png", 0, 0, 835, 450, false);
			Bg_21 = picture.setPicture(bg_21, Bg_21, frame, "bg_21.png", 0, 0, 835, 450, false);
			Bg_22 = picture.setPicture(bg_22, Bg_22, frame, "bg_22.png", 0, 0, 835, 450, false);
			Bg_23 = picture.setPicture(bg_23, Bg_23, frame, "bg_23.png", 0, 0, 835, 450, false);
			Bg_24 = picture.setPicture(bg_24, Bg_24, frame, "bg_24.png", 0, 0, 835, 450, false);
			Bg_25 = picture.setPicture(bg_25, Bg_25, frame, "bg_25.png", 0, 0, 835, 450, false);
			Bg_26 = picture.setPicture(bg_26, Bg_26, frame, "bg_26.png", 0, 0, 835, 450, false);
			Bg_27 = picture.setPicture(bg_27, Bg_27, frame, "bg_27.png", 0, 0, 835, 450, false);
			Bg_28 = picture.setPicture(bg_28, Bg_28, frame, "bg_28.png", 0, 0, 835, 450, false);
			Bg_29 = picture.setPicture(bg_29, Bg_29, frame, "bg_29.png", 0, 0, 835, 450, false);
			Gif_1 = picture.setPicture(gif_1, Gif_1, frame, "gif_1.gif", 0, 50, 835, 450, false);
			Gif_2 = picture.setPicture(gif_2, Gif_2, frame, "gif_2.gif", 0, 50, 835, 400, false);
			
//			第三幕
			Bg_31 = picture.setPicture(bg_31, Bg_31, frame, "bg_31.png", 0, 0, 835, 450, false);
			Bg_32 = picture.setPicture(bg_32, Bg_32, frame, "bg_32.png", 0, 0, 835, 450, false);
			Bg_33 = picture.setPicture(bg_33, Bg_33, frame, "bg_33.png", 0, 0, 835, 450, false);
			Bg_34 = picture.setPicture(bg_34, Bg_34, frame, "bg_34.png", 0, 0, 835, 450, false);
			Bg_35 = picture.setPicture(bg_35, Bg_35, frame, "bg_35.png", 0, 0, 835, 450, false);
			
//			結局幕
			Bg_36 = picture.setPicture(bg_36, Bg_36, frame, "bg_36.png", 0, 0, 835, 450, false);
			Bg_37 = picture.setPicture(bg_37, Bg_37, frame, "bg_37.png", 0, 0, 835, 450, false);
			Bg_38 = picture.setPicture(bg_38, Bg_38, frame, "bg_38.png", 0, 0, 835, 450, false);
			Bg_39 = picture.setPicture(bg_39, Bg_39, frame, "bg_39.png", 0, 0, 835, 450, false);
			Gif_3 = picture.setPicture(gif_3, Gif_3, frame, "gif_3.gif", 0, 50, 835, 400, false);
			Gif_4 = picture.setPicture(gif_4, Gif_4, frame, "gif_4.gif", 0, 50, 835, 400, false);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ↑-----------------------------------------------

		// button放入panel & panel放入frame↓---------------
		// 封面幕
		pl0.add(btn0_1);
		pl0.add(btn0_2);
		frame.add(pl0);

		// 劇情幕
		pl1.add(btn_next);
		pl1.add(btn_back);
		pl1.add(btn1);
		pl1.add(btn2);
		pl1.add(btn3);
		frame.add(pl1);
		btn1.setVisible(false);
		btn2.setVisible(false);
		btn3.setVisible(false);
		pl1.setVisible(false);
		// ↑-----------------------------------------------

		// 按鈕事件指令↓-----------------------------------------
		btn0_1.addActionListener(frame);
		btn0_2.addActionListener(frame);
		btn1.addActionListener(frame);
		btn2.addActionListener(frame);
		btn3.addActionListener(frame);
		btn_next.addActionListener(frame);
		btn_back.addActionListener(frame);
		// ↑-------------------------------------------------

	}

//	愛心與血條顯示------------------------------------------------
	public void showLove(boolean a) {
		panelLove.setVisible(a);
		labelColor.setVisible(a);
		labelBack.setVisible(a);
//		scoreArea.setVisible(true);
//
//		score = String.valueOf(y_Location / 2);
//		scoreArea.setText(score);
	}
//	-------------------------------------------------------------

//	愛心移動-----------------------------------------------------------------------
	public void MoveDyn(int y) {
		finalPosition = y_Location - 2 * y;  
		// ↑ 1. 總長度200 , 血條顯示範圍為0~100，故加減都須*2
		//   2. 視覺上，愛心位置下降 → JFrame中，愛心位置增加
		y_Location = finalPosition;
		panelLove.setLocation(60, 80 + y_Location);
		labelColor.setSize(10, y_Location);
//		score = String.valueOf((200-y_Location) / 2);
//		scoreArea.setText(score);
	}
//	-----------------------------------------------------------------------------

	// 按鈕事件
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		// 一般選項按鈕事件區↓----------------------------
		switch (cmd) {
		case "NEXT":
			n += 1;
			break;
		case "BACK":
			n -= 3;
			break;
		case "開始":
			pl0.setVisible(false);
			pl1.setVisible(true);
			btn_next.setVisible(true);
			btn_back.setVisible(false);
			Bg_1.setVisible(true);
			Bggif_1.setVisible(false);
			Bggif_2.setVisible(false);
			Bg.setVisible(false);
			pl0.setSize(800, 450);
			showLove(true);
			break;

		case "如果你是高富帥":
			pl0.setVisible(false);
			pl1.setVisible(true);
			Bggif_1.setVisible(false);
			Bggif_2.setVisible(false);
			Bg.setVisible(false);
			pl0.setSize(800, 450);
			n=57;
			m=3;
			break;

		case "吉他社":
			MoveDyn(score11);
			scene = 11;
			
			Bg_1.setVisible(false);
			Bg_11.setVisible(true);
			Bg_12.setVisible(false);
			Bg_13.setVisible(false);
			btn_next.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
			story.setVisible(true);
			story.setText(girl + "：" + "\n  可是彈吉他手會痛欸......\n  不然加個葬儀社看看好了，應該滿有趣的");
			break;
		case "熱舞社":
			MoveDyn(score12);
			scene = 12;
			
			Bg_1.setVisible(false);
			Bg_11.setVisible(false);
			Bg_12.setVisible(true);
			Bg_13.setVisible(false);
			btn_next.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
			story.setVisible(true);
			story.setText(girl + "：" + "\n  跳舞會滿身汗耶，人家才不想流啦，\n  不然加個葬儀社看看好了，應該滿有趣的！");
			break;
		case "葬儀社":
			MoveDyn(score13);
			scene = 13;
			
			Bg_1.setVisible(false);
			Bg_11.setVisible(false);
			Bg_12.setVisible(false);
			Bg_13.setVisible(true);
			btn_next.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
			story.setVisible(true);
			story.setText(girl + "：" + "\n  好窩！好窩！人家對葬儀社最有興趣了！！！\n   看來我們興趣一樣喔≧///≦");
			break;
		case "甜麵屋":
			MoveDyn(score21);
			scene = 21;
			
			Bg_2.setVisible(false);
			Bg_21.setVisible(true);
			Bg_22.setVisible(false);
			Bg_23.setVisible(false);
			btn_next.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
			story.setVisible(true);
			story.setText(girl + "：" + "\n  吼呦......甜麵屋倒了啦\n  不然去居酒屋吃午餐！！");
			break;
		case "元味屋":
			MoveDyn(score22);
			scene = 22;
			
			Bg_2.setVisible(false);
			Bg_21.setVisible(false);
			Bg_22.setVisible(true);
			Bg_23.setVisible(false);
			btn_next.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
			story.setVisible(true);
			story.setText(girl + "：" + "\n  Hmm……不要啦，那間人好多我不想要排隊QAQ\n  不然去居酒屋吃午餐！！");
			break;
		case "居酒屋":
			MoveDyn(score23);
			scene = 23;
			
			Bg_2.setVisible(false);
			Bg_21.setVisible(false);
			Bg_22.setVisible(false);
			Bg_23.setVisible(true);
			btn_next.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
			story.setVisible(true);
			story.setText(girl + "：" + "\n  唉呦～你懂，你真的懂\n　午餐就是要去居酒屋吃啊  我們直接嗨起來");
			break;
		case "李商隱":
			MoveDyn(score31);
			scene = 31;
			
			btn_next.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
			story.setVisible(true);
			story.setText(girl + "：" + "\n  欸呀，不是啦 我記得李榮浩有講過………？");
			btn3.setLocation(580, 30);// btn3歸位
			break;
		case "李白":
			MoveDyn(score32);
			scene = 32;
			
			btn_next.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
			story.setVisible(true);
			story.setText(girl + "：" + "\n  欸呀，不是啦 我記得李榮浩有講過………？");
			btn3.setLocation(580, 30);// btn3歸位
			break;
		case "李榮浩":// 按鈕換位
			if (jump % 2 == 0) {
				btn3.setLocation(150, 90);
			} else {
				btn3.setLocation(580, 30);
			}
			jump += 1;
			break;
		case "看電影":
			MoveDyn(score41);
			scene = 41;
			
			Bg_36.setVisible(false);
			Bg_31.setVisible(true);
			Bg_32.setVisible(false);
			Bg_33.setVisible(false);
			btn_next.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
			story.setVisible(true);
			story.setText("你：\n  不然我帶你去看漫威最新的電影\n             ”發財俠”");
			m = 1;
			break;
		case "坐摩天輪":
			MoveDyn(score42);
			scene = 42;
			
			Bg_36.setVisible(false);
			Bg_31.setVisible(false);
			Bg_32.setVisible(true);
			Bg_33.setVisible(false);
			btn_next.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
			story.setVisible(true);
			story.setText("你：\n  不然我帶你去坐愛情摩天輪");
			m = 2;
			break;
		case "砍樹":		
			panelLove.setLocation(x_Location - 10,100);
			labelColor.setSize(10,0);
			scene = 43;
			
			Bg_36.setVisible(true);
			Bg_31.setVisible(false);
			Bg_32.setVisible(false);
			Bg_33.setVisible(false);
			btn_next.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
			story.setVisible(true);
			story.setText("你：\n  不然我帶你去砍樹洩恨");
			m = 3;
			break;

		}
		// ↑-------------------------------------------------

		// next事件區↓----------------------------------------

		switch (n) {
		case 1:
			story.setText(girl + "：" + "\n  好開心考上了成大！\n  之前都在認真讀書，剛上大學要好好玩一玩！！！");
			break;
		case 3:
			story.setText(girl + "：" + "\n  我們一起選社團吧，你想要參加甚麼社？");
			break;
		case 5:
			if (judge == 1) {  //根據先前按鍵，回復前一次血量
				if (scene == 11)
					MoveDyn(-score11);
				else if (scene == 12)
					MoveDyn(-score12);
				else if (scene == 13)
					MoveDyn(-score13);
				judge = 0;
			}
			
			Bg_1.setVisible(true);
			Bg_11.setVisible(false);
			Bg_12.setVisible(false);
			Bg_13.setVisible(false);
			Bg_14.setVisible(false);
			btn_next.setVisible(false);
			btn_back.setVisible(false);
			story.setVisible(false);
			btn1.setVisible(true);
			btn2.setVisible(true);
			btn3.setVisible(true);
			btn1.setText("吉他社");
			btn2.setText("熱舞社");
			btn3.setText("葬儀社");
			break;
		case 7:
			judge = 1;
			
			Bg_1.setVisible(false);
			Bg_11.setVisible(false);
			Bg_12.setVisible(false);
			Bg_13.setVisible(false);
			Bg_14.setVisible(true);
			btn_back.setVisible(true);
			story.setText(girl + "：" + "\n  走吧(≧^≦)   我們去登記社團！！\n    Go Go Go~~");
			break;
		case 9:
			btn_back.setVisible(false);
			story.setText("~~。~。~。~。~。~。~。~ ~~\n ~          登記社團ing          ~\n~~。~。~。~。~。~。~。~ " + "~~");
			break;
		case 11:
			Bg_14.setVisible(false);
			Bg_2.setVisible(true);
			story.setText(girl + "：" + "\n  終於辦好社團手續了（看時間）");
			break;
		case 13:
			story.setText(girl + "：" + "\n  哇！已經中午了耶，\n  我們一起去吃飯吧(o˙ω˙o)");
			break;
		case 15:
			story.setText(girl + "：" + "\n  育樂街根本就是美食天堂，你想要吃甚麼呢？");
			break;
		case 17:
			if (judge == 2) {
				if (scene == 21)
					MoveDyn(-score21);
				else if (scene == 22)
					MoveDyn(-score22);
				else if (scene == 23)
					MoveDyn(-score23);
				judge = 1;
			}
			
			Bg_2.setVisible(true);
			Bg_24.setVisible(false);
			btn_next.setVisible(false);
			btn_back.setVisible(false);
			story.setVisible(false);
			btn1.setVisible(true);
			btn2.setVisible(true);
			btn3.setVisible(true);
			btn1.setText("甜麵屋");
			btn2.setText("元味屋");
			btn3.setText("居酒屋");
			break;
		case 19:
			judge = 2;
			
			story.setVisible(false);
			Bg_21.setVisible(false);
			Bg_22.setVisible(false);
			Bg_23.setVisible(false);
			btn_next.setVisible(true);
			btn_back.setVisible(true);
			Bg_24.setVisible(true);
			break;
		case 21:
			btn_back.setVisible(false);
			Bg_24.setVisible(false);
			Bg_25.setVisible(true);
			story.setVisible(true);
			story.setText(girl + "：" + "\n  來這種地方就是要吃吃喝呵呵呵河河河啊…");
			break;
		case 23:
			story.setText(girl + "：" + "\n  記得喝酒不開車，開車不喝酒！！！！");
			break;
		case 25:
			story.setFont(new Font("文鼎甜妞體B", Font.BOLD, 50));
			story.setText(girl + "：" + "\n  記～得～ㄛ～");
			break;
		case 27:
			story.setFont(new Font("文鼎甜妞體B", Font.BOLD, 26));
			story.setText(girl + "：" + "\n  （看時間）快喝完最後一口，\n    等等要上國文課了啦=口=");
			Bg_25.setVisible(false);
			Bg_26.setVisible(true);
			Gif_1.setVisible(true);
			break;
		case 29:
			Gif_1.setVisible(false);
			Bg_26.setVisible(false);
			Bg_27.setVisible(true);
			story.setText("\n         （剛好趕在上課前回到教室）");
			break;
		case 31:
			Bg_28.setVisible(true);
			Bg_27.setVisible(false);
			story.setText("老師：\n  那位臉紅紅的女生不要一直趴著！！");
			break;
		case 33:
			story.setText("老師：\n  站起來回答這一題");
			break;
		case 35:
			story.setText("老師：\n  詩仙是誰?");
			break;
		case 37:
			Bg_29.setVisible(true);
			Bg_28.setVisible(false);
			story.setText(girl + "：" + "\n  （輕聲）欸欸，你知道答案嗎？");
			break;
		case 39:
			if (judge == 3) {
				if (scene == 31)
					MoveDyn(-score31);
				else if (scene == 32)
					MoveDyn(-score32);
				judge = 2;
			}
			
			Bg_29.setVisible(true);
			btn_next.setVisible(false);
			btn_back.setVisible(false);
			story.setVisible(false);
			btn1.setVisible(true);
			btn2.setVisible(true);
			btn3.setVisible(true);
			btn1.setText("李商隱");
			btn2.setText("李白");
			btn3.setText("李榮浩");
			break;
		case 41:
			judge = 3;
			btn_back.setVisible(true);
			story.setText(girl + "：" + "\n  答案是  李榮浩！！！");
			break;
		case 43:
			btn3.setLocation(580, 30);// btn3歸位
			btn_back.setVisible(false);
			Bg_29.setVisible(false);
			Bg_34.setVisible(true);
			Gif_2.setVisible(true);
			color.setVisible(true);
			story.setText("凍未條a老師：\n  鱟 氣氣氣氣氣......");
			AePlayWave apw=new AePlayWave("77777final.wav");
			apw.start();
			break;
		case 45:
			Gif_2.setVisible(false);
			color.setVisible(false);
			Bg_34.setVisible(false);
			Bg_35.setVisible(true);
			story.setText("凍未條a老師：\n  你為甚麼要這樣抹黑他！！！");
			break;
		case 47:
			Bg_35.setVisible(false);
			Bg_36.setVisible(true);
			story.setText(girl + "：" + "\n  被老師罵好討厭喔……");
			break;
		case 49:
			story.setText(girl + "：" + "\n  我只是上課喝醉而已啊  嗚嗚嗚(T.T)");
			break;
		case 51:
			story.setText("你：\n  不要傷心了啦\n  不然我帶你去隔壁高雄______");
			break;
		case 53:
			if (judge == 4) {
				if (scene == 41)
					MoveDyn(-score41);
				else if (scene == 42)
					MoveDyn(-score42);
				else if (scene == 43)
					MoveDyn(0);
				judge = 3;
			}
			Bg_36.setVisible(true);
			btn_next.setVisible(false);
			btn_back.setVisible(false);
			Bg_31.setVisible(false);
			Bg_32.setVisible(false);
			Bg_33.setVisible(false);
			story.setVisible(false);
			btn1.setVisible(true);
			btn2.setVisible(true);
			btn3.setVisible(true);
			btn1.setText("看電影");
			btn2.setText("坐摩天輪");
			btn3.setText("砍樹");
			break;
		case 55:
			judge = 4;
			story.setVisible(true);
			Bg_31.setVisible(false);
			Bg_32.setVisible(false);
			Bg_33.setVisible(false);
			btn_next.setVisible(true);
			btn_back.setVisible(true);
			if (m % 4 == 1) { // 1壞結局
				Bg_37.setVisible(true);
				story.setText(girl + "：" + "\n  吼……那是甚麼爛片啦，這個時候還在開玩笑\n  不理你了啦！！\n           。~。~。 配對失敗 。~。~。");
			} else if (m % 4 == 2) { // 2壞結局
				Bg_37.setVisible(true);
				story.setText(girl + "：" + "\n  這個時候還在開玩笑\n  不理你了啦！！\n           。~。~。 配對失敗 。~。~。");				
			} else if (m % 4 == 3) { // 3好結局
				Bg_33.setVisible(true);
				story.setText(girl + "：" + "\n  好啊好啊，聽說最近有人很愛亂爬樹，\n  這樣很危險，如果掉下來怎麼辦！");
			}
			break;
		case 57:
			btn_back.setVisible(false);
			btn_next.setVisible(false);
			Bg_33.setVisible(false);
			Bg_37.setVisible(false);
			Bg_39.setVisible(true);
			if (m % 4 == 1 || m % 4 == 2) {
				Gif_4.setVisible(true);
			} else if (m % 4 == 3) {
				Bg_38.setVisible(true);
				Bg_39.setVisible(false);
				Bg_36.setVisible(false);
				Gif_3.setVisible(true);

				story.setText(girl + "：" + "\n  看來我們真的很合喔>//////<\n      。~。~。 配對成功 。~。~。");
			}
			break;

		}
		if (n % 2 == 1) {
			n += 1;
		}

		// ↑--------------------------------------------------

	}
	
	

}
