package model;

import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ExitButton extends JButton{
	public ExitButton(){
		ImageIcon img=new ImageIcon("D:\\Program Files\\eclipse\\Workspace\\Crazy Crab\\exit2.png");
		setSize(img.getImage().getWidth(null),img.getImage().getHeight(null));
		setIcon(img);
		setMargin(new Insets(0,0,0,0));
		setIconTextGap(0);
		setBorderPainted(false);
		setBorder(null);
		setText(null);
		setOpaque(false);
		setContentAreaFilled(false); //���ð�ť͸��
		addMouseListener(new MouseAdapter() {  
            @Override  
            public void mouseEntered(MouseEvent e) {  
            	ImageIcon img=new ImageIcon("D:\\Program Files\\eclipse\\Workspace\\Crazy Crab\\exit.png");
                setIcon(img);
                setSize(img.getImage().getWidth(null),img.getImage().getHeight(null));
            	repaint();  
            }  
            @Override  
            public void mouseExited(MouseEvent e) {  
            	ImageIcon img=new ImageIcon("D:\\Program Files\\eclipse\\Workspace\\Crazy Crab\\exit2.png");
                setIcon(img);
                setSize(img.getImage().getWidth(null),img.getImage().getHeight(null));
            	repaint();  
            }  
		});
	}
}
