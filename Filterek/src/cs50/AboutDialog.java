package cs50;

import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutDialog extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AboutDialog(JFrame parent) 
	{	 		
		super(parent, "About");
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.CENTER);
		this.setLayout(layout);
		this.setLocation(350, 170);
		this.setSize(300, 200);
		
		add(new JLabel("2014 CS50 - image filters"));
		add(new JLabel("---------------------------------------------")); 
		add(new JLabel("This is CS50 final project."));
		add(new JLabel("It demonstrates usage of image filters"));
		add(new JLabel("----------------------------------------------"));
		add(new JLabel("Code By: Artur Wiśniewski"));
		
		
		this.setVisible(false);
	}
}
