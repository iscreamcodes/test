package project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;
public class myframe extends JFrame implements ActionListener  {
	JLabel label;
	 JButton button;
	 Random random;
	 Image image1;
	 Image image2;
	 Image image3;
	 Image image4;
	 Image image5;
	 Image image6;
	myframe(){
		this.pack();
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(620,620);
		
	    label=new JLabel("Snakes n Ladders");
		label.setOpaque(true);
		label.setBackground(Color.GRAY);
		label.setBounds(100,100, 250, 250);
		
		button =new JButton();
		button.setBounds(80,100,50,50);
		button.setText("Roll");
		button.setHorizontalTextPosition(JLabel.CENTER);
		button.setVerticalTextPosition(JLabel.BOTTOM);
		button.addActionListener(this);
		
		
	    this.add(label);
	    this.add(button);
	  
	    
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method 

		 image1=new ImageIcon("2792943.png").getImage();
		 image2=new ImageIcon("2792940.png").getImage();
		 image3=new ImageIcon("2792939.png").getImage();
		 image4=new ImageIcon("2792938.png").getImage();
		 image5=new ImageIcon("2792949.png").getImage();
		 image6=new ImageIcon("2792948.png").getImage();
		
		
		if(e.getSource()==button) {
			
			random= new Random();
			int x= random.nextInt();
			if( x==1) {
				image1.setIcon()="2792943.png";
			}

			else if(x==2) {
				System.out.println("2792940.png");
			}
			else if(x==3) {
				System.out.println("2792939.png");
			}

			else if(x==5) {
				System.out.println("2792949.png");
			}
			else {
				System.out.println("2792948.png");
			}
			
		}
	}

}
