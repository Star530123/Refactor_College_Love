package Love_project;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class LoveProject extends JFrame implements ActionListener{

	int n = 0;// next����׃��
	int jump = 0;// ���o����
	int m = 0;// �Y�ַ�֧׃��


	// ȫ��׃����---------------------------------------
	static JPanel pl0 = new JPanel();// ����panel(�Ű��o)
	static JPanel pl1 = new JPanel();// ��1��·�panel
	static JPanel color = new JPanel();// �Rِ��

	static JTextArea story = new JTextArea(); // ���֔���

	static JButton btn_next = new JButton("NEXT");
	static JButton btn_back = new JButton("BACK");
	static JButton btn0_1 = new JButton("�_ʼ");
	static JButton btn0_2 = new JButton("������Ǹ߸���");
	static JButton btn1 = new JButton("a");
	static JButton btn2 = new JButton("b");
	static JButton btn3 = new JButton("c");

	static String girl = "Heroine";// Ů��������
	// ��------------------------------------------------

//	����׃��--------------------------------------------
	public static JPanel panelLove = new JPanel();   //���ĈD��
	public static JLabel labelBack = new JLabel();   //Ѫ�l����ɫ(�ۼt)
	public static JLabel labelColor = new JLabel();  //�{��Ѫ�l��(��ɫ)
	public int finalPosition;         //ÿ�����p�����KѪ�lλ��
	public static int x_Location = 70;	      //Ѫ�lλ��(x�S) (�̶�)
	public static int y_Location = 100;      //����λ��(y�S) (�ӑB)
	public static int colorLen;			  //Ѫ�l�L��
	public static int judge = 0;			  //�ڎׂ�back�I
	public static int scene = 0;			  //��һ��button
	public static int backInitialSize = 100; //��ʼѪ�l�L��  = (200-backInitialSize)
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
	
// ��Ƭ����^��-------------------------------------
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
	// ��------------------------------------------------
	
//	�DƬݔ��-------------------------------------------------------------------------------
	public static ImageIcon getIcon(String filePath) {  
		Image img;
		img = Toolkit.getDefaultToolkit().getImage(filePath);
		ImageIcon icon = new ImageIcon(img);
		return icon;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
