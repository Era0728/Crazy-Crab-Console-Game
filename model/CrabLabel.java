package model;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CrabLabel extends JLabel{
	public CrabLabel(){
		ImageIcon img=new ImageIcon("D:\\Program Files\\eclipse\\Workspace\\Crazy Crab\\crazy crab.png");
		setSize(img.getImage().getWidth(null),img.getImage().getHeight(null));
		setIcon(img);
		setIconTextGap(0);
		setBorder(null);
		setText(null);
		setOpaque(false);
	}
	
}
