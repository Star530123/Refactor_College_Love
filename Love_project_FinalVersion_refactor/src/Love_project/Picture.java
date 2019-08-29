package Love_project;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Picture {
	public JLabel setPicture(ImageIcon imgIcon,JLabel img,Love_project frame,String path,int lx,int ly,int sx,int sy,boolean visible) {
		imgIcon = getIcon(path);
		img = new JLabel(imgIcon);
		img.setLocation(lx, ly);
		img.setSize(sx, sy);
		frame.add(img);
		img.setVisible(visible);
		return img;
		
	}
	public static ImageIcon getIcon(String filePath) {  
		Image img;
		img = Toolkit.getDefaultToolkit().getImage(filePath);
		ImageIcon icon = new ImageIcon(img);
		return icon;
		}
}
