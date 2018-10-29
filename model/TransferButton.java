package model;

import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TransferButton extends JButton{
	private boolean login=true;
	public boolean isLogIn(){
		return login;
	}
	public TransferButton(){
		ImageIcon img=new ImageIcon("D:\\Program Files\\eclipse\\Workspace\\Crazy Crab\\LOGIN.png");
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
            public void mouseClicked(MouseEvent e) {  
            	ImageIcon img;
				if (login)
					img=new ImageIcon("D:\\Program Files\\eclipse\\Workspace\\Crazy Crab\\SIGNUP.png");
            	else 
            		img=new ImageIcon("D:\\Program Files\\eclipse\\Workspace\\Crazy Crab\\LOGIN.png");
				;
				login=!login;
                setIcon(img);
            	repaint();  
            }
		});
	}
}
