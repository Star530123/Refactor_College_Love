package Love_project;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Test {
	public JLabel test1(ImageIcon imgic,JLabel Img,Love_project frame,String path,int lx,int ly,int sx,int sy) {
		imgic = getIcon(path);
		Img = new JLabel(imgic);
		Img.setLocation(lx, ly);
		Img.setSize(sx, sy);
		frame.add(Img);
		Img.setVisible(true);
		return Img;
		
	}
	public static ImageIcon getIcon(String filePath) {  
		Image img;
		img = Toolkit.getDefaultToolkit().getImage(filePath);
		ImageIcon icon = new ImageIcon(img);
		return icon;
		}
}
