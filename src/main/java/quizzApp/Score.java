package quizzApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class Score extends JFrame implements ActionListener {
   
	JButton submit,exit;
	
	Score(String name, int score) {
		setBounds(350, 100, 750, 500);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/quiz1.jpg"));
		Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 200, 300, 250);
		add(image);

		JLabel heading = new JLabel("Thankyou " + name + " for playing Simple Minds");
		heading.setBounds(45, 30, 700, 30);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
		add(heading);

		JLabel lblscore = new JLabel("Your score is " + score);
		lblscore.setBounds(350, 150, 300, 30);
		lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
		add(lblscore);

		 submit = new JButton("Play Again");
		submit.setBounds(350, 270, 120, 30);
//		submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
		submit.setBackground(new Color(30, 144, 254));
		submit.setForeground(Color.WHITE);
//		submit.setEnabled(false);
		submit.addActionListener(this);
		add(submit);
		
		 exit = new JButton("Exit");
		exit.setBounds(500, 270, 120, 30);
//		submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
		exit.setBackground(new Color(30, 144, 254));
		exit.setForeground(Color.WHITE);
//		submit.setEnabled(false);
		exit.addActionListener(this);
		add(exit);

		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Score("User", 0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit)
		{
			setVisible(false);
		    new Login();
		}
		else {
			setVisible(false);
		}

	}

}
