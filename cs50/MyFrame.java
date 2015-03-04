package cs50;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MyFrame extends JFrame {
	
	/**
	 * Extends JFrame - customize window
	 */
	private static final long serialVersionUID = 1L;
	private boolean imageLoaded = false;
	
	public MyFrame(){
		super("CS50 - image filters");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocation(300, 100);
		
		JDialog f = new AboutDialog(this);
		BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);
		
		JMenuBar menuBar = new JMenuBar();

//------MENU PLIK------------------
		
		JMenu menuPlik = new JMenu("File");
		menuPlik.setMnemonic(KeyEvent.VK_F);
		menuPlik.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
		menuBar.add(menuPlik);
		
		JMenuItem menuOtworzPlik = new JMenuItem("Open File", KeyEvent.VK_F);
		menuOtworzPlik.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.ALT_MASK));
		menuOtworzPlik.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuPlik.add(menuOtworzPlik);
		
		JMenuItem menuZapiszPlik = new JMenuItem("Save File", KeyEvent.VK_S);
		menuZapiszPlik.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
		menuZapiszPlik.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuPlik.add(menuZapiszPlik);
		
		menuPlik.addSeparator();
		
		JMenuItem menuZakoncz = new JMenuItem("Exit", KeyEvent.VK_E);
		menuZakoncz.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
		menuZakoncz.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuPlik.add(menuZakoncz);
		
//------MENU FILTRY LINIOWE------------------
		
		JMenu menuFiltryLiniowe = new JMenu("Linear Filters");
		menuFiltryLiniowe.setMnemonic(KeyEvent.VK_L);
		menuFiltryLiniowe.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
		menuFiltryLiniowe.setEnabled(false);
		menuBar.add(menuFiltryLiniowe);
		
		JMenuItem menuBezFiltra = new JMenuItem("No filter", KeyEvent.VK_0);
		menuBezFiltra.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.ALT_MASK));
		menuBezFiltra.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryLiniowe.add(menuBezFiltra);
		menuFiltryLiniowe.addSeparator();

		JMenu menuFiltryDolnoprzepustowe = new JMenu("Low-Pass Filters");
		menuFiltryDolnoprzepustowe.setMnemonic(KeyEvent.VK_1);
		menuFiltryDolnoprzepustowe.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryLiniowe.add(menuFiltryDolnoprzepustowe);

		JMenu menuFiltryGornoprzepustowe = new JMenu("High-Pass Filters");
		menuFiltryDolnoprzepustowe.setMnemonic(KeyEvent.VK_2);
		menuFiltryDolnoprzepustowe.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryLiniowe.add(menuFiltryGornoprzepustowe);

		JMenu menuFiltryPrzesuwania = new JMenu("Shift and Substract Filters");
		menuFiltryDolnoprzepustowe.setMnemonic(KeyEvent.VK_3);
		menuFiltryDolnoprzepustowe.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryLiniowe.add(menuFiltryPrzesuwania);

		JMenu menuFiltryGradientowe = new JMenu("Gradient Filters");
		menuFiltryDolnoprzepustowe.setMnemonic(KeyEvent.VK_4);
		menuFiltryDolnoprzepustowe.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryLiniowe.add(menuFiltryGradientowe);

		JMenu menuFiltryUwypuklajace = new JMenu("Emphasizing Filters");
		menuFiltryDolnoprzepustowe.setMnemonic(KeyEvent.VK_5);
		menuFiltryDolnoprzepustowe.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryLiniowe.add(menuFiltryUwypuklajace);

		JMenu menuFiltryKrawedziowe = new JMenu("Edge Filters");
		menuFiltryDolnoprzepustowe.setMnemonic(KeyEvent.VK_6);
		menuFiltryDolnoprzepustowe.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryLiniowe.add(menuFiltryKrawedziowe);

		JMenu menuFiltryKonturowe = new JMenu("Outline Filters");
		menuFiltryDolnoprzepustowe.setMnemonic(KeyEvent.VK_7);
		menuFiltryDolnoprzepustowe.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryLiniowe.add(menuFiltryKonturowe);

//-----------------Podmenu dla filtr�w
//------------------dolnoprzepustowe
		JMenuItem menuFiltr1 = new JMenuItem("Mean Filter", KeyEvent.VK_1);
		menuFiltr1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuFiltr1.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryDolnoprzepustowe.add(menuFiltr1);

		JMenuItem menuFiltr2 = new JMenuItem("LP1 Filter", KeyEvent.VK_2);
		menuFiltr2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuFiltr2.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryDolnoprzepustowe.add(menuFiltr2);

		JMenuItem menuFiltr3 = new JMenuItem("LP2 Filter", KeyEvent.VK_3);
		menuFiltr3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuFiltr3.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryDolnoprzepustowe.add(menuFiltr3);

		JMenuItem menuFiltr4 = new JMenuItem("LP3 Filter", KeyEvent.VK_4);
		menuFiltr4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		menuFiltr4.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryDolnoprzepustowe.add(menuFiltr4);

		JMenuItem menuFiltr40 = new JMenuItem("Quadratic Filter", KeyEvent.VK_5);
		menuFiltr40.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK));
		menuFiltr40.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryDolnoprzepustowe.add(menuFiltr40);

		JMenuItem menuFiltr41 = new JMenuItem("Circle Filter", KeyEvent.VK_6);
		menuFiltr41.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6, ActionEvent.ALT_MASK));
		menuFiltr41.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryDolnoprzepustowe.add(menuFiltr41);

		JMenuItem menuFiltr42 = new JMenuItem("Piramid Filter", KeyEvent.VK_7);
		menuFiltr42.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_7, ActionEvent.ALT_MASK));
		menuFiltr42.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryDolnoprzepustowe.add(menuFiltr42);

		JMenuItem menuFiltr43 = new JMenuItem("Cone Filter", KeyEvent.VK_8);
		menuFiltr43.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_8, ActionEvent.ALT_MASK));
		menuFiltr43.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryDolnoprzepustowe.add(menuFiltr43);
		
		JMenu menuFiltryGausa = new JMenu("Gaus Filters");
		menuFiltryDolnoprzepustowe.setMnemonic(KeyEvent.VK_9);
		menuFiltryDolnoprzepustowe.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryDolnoprzepustowe.add(menuFiltryGausa);
		
		JMenuItem menuFiltr5 = new JMenuItem("Gaus Filter 1", KeyEvent.VK_1);
		menuFiltr5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuFiltr5.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGausa.add(menuFiltr5);
		
		JMenuItem menuFiltr44 = new JMenuItem("Gaus Filter 2", KeyEvent.VK_2);
		menuFiltr44.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuFiltr44.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGausa.add(menuFiltr44);

		JMenuItem menuFiltr45 = new JMenuItem("Gaus Filter 3", KeyEvent.VK_3);
		menuFiltr45.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuFiltr45.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGausa.add(menuFiltr45);

		JMenuItem menuFiltr46 = new JMenuItem("Gaus Filter 4", KeyEvent.VK_4);
		menuFiltr46.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		menuFiltr46.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGausa.add(menuFiltr46);

		JMenuItem menuFiltr47 = new JMenuItem("Gaus Filter 5", KeyEvent.VK_5);
		menuFiltr47.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK));
		menuFiltr47.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGausa.add(menuFiltr47);

//--------------------gornoprzepustowe
		
		JMenuItem menuFiltr6 = new JMenuItem("Mean Filter", KeyEvent.VK_1);
		menuFiltr6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuFiltr6.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGornoprzepustowe.add(menuFiltr6);

		JMenuItem menuFiltr7 = new JMenuItem("HP1 Filter", KeyEvent.VK_2);
		menuFiltr7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuFiltr7.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGornoprzepustowe.add(menuFiltr7);

		JMenuItem menuFiltr8 = new JMenuItem("HP2 Filter", KeyEvent.VK_3);
		menuFiltr8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuFiltr8.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGornoprzepustowe.add(menuFiltr8);

		JMenuItem menuFiltr9 = new JMenuItem("HP3 Filter", KeyEvent.VK_4);
		menuFiltr9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		menuFiltr9.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGornoprzepustowe.add(menuFiltr9);
//---------przesuwanie i odejmowanie
		
		JMenuItem menuFiltr10 = new JMenuItem("Horizontal Filter", KeyEvent.VK_0);
		menuFiltr10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.ALT_MASK));
		menuFiltr10.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryPrzesuwania.add(menuFiltr10);

		JMenuItem menuFiltr11 = new JMenuItem("Vertical Filter", KeyEvent.VK_1);
		menuFiltr11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuFiltr11.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryPrzesuwania.add(menuFiltr11);

		JMenuItem menuFiltr12 = new JMenuItem("Diagonal Filter 1", KeyEvent.VK_2);
		menuFiltr12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuFiltr12.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryPrzesuwania.add(menuFiltr12);

		JMenuItem menuFiltr13 = new JMenuItem("Diagonal Filter 2", KeyEvent.VK_3);
		menuFiltr13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuFiltr13.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryPrzesuwania.add(menuFiltr13);

// --------------gradientowe

		JMenuItem menuFiltr14 = new JMenuItem("Gradient Filter E", KeyEvent.VK_1);
		menuFiltr14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuFiltr14.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGradientowe.add(menuFiltr14);

		JMenuItem menuFiltr15 = new JMenuItem("Gradient Filter SE", KeyEvent.VK_2);
		menuFiltr15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuFiltr15.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGradientowe.add(menuFiltr15);

		JMenuItem menuFiltr16 = new JMenuItem("Gradient Filter S", KeyEvent.VK_3);
		menuFiltr16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuFiltr16.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGradientowe.add(menuFiltr16);

		JMenuItem menuFiltr17 = new JMenuItem("Gradient Filter SW", KeyEvent.VK_4);
		menuFiltr17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		menuFiltr17.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGradientowe.add(menuFiltr17);

		JMenuItem menuFiltr18 = new JMenuItem("Gradient Filter W", KeyEvent.VK_5);
		menuFiltr18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK));
		menuFiltr18.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGradientowe.add(menuFiltr18);

		JMenuItem menuFiltr19 = new JMenuItem("Gradient Filter NW", KeyEvent.VK_6);
		menuFiltr19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6, ActionEvent.ALT_MASK));
		menuFiltr19.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGradientowe.add(menuFiltr19);
		
		JMenuItem menuFiltr20 = new JMenuItem("Gradient Filter N", KeyEvent.VK_7);
		menuFiltr20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_7, ActionEvent.ALT_MASK));
		menuFiltr20.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGradientowe.add(menuFiltr20);

		JMenuItem menuFiltr21 = new JMenuItem("Gradient Filter NE", KeyEvent.VK_8);
		menuFiltr21.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_8, ActionEvent.ALT_MASK));
		menuFiltr21.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryGradientowe.add(menuFiltr21);
		
//---------------------uwypuklaj�ce

		JMenuItem menuFiltr22 = new JMenuItem("Emphasizing Filter E", KeyEvent.VK_1);
		menuFiltr22.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuFiltr22.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryUwypuklajace.add(menuFiltr22);

		JMenuItem menuFiltr23 = new JMenuItem("Emphasizing Filter SE", KeyEvent.VK_2);
		menuFiltr23.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuFiltr23.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryUwypuklajace.add(menuFiltr23);

		JMenuItem menuFiltr24 = new JMenuItem("Emphasizing Filter S", KeyEvent.VK_3);
		menuFiltr24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuFiltr24.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryUwypuklajace.add(menuFiltr24);

		JMenuItem menuFiltr25 = new JMenuItem("Emphasizing Filter SW", KeyEvent.VK_4);
		menuFiltr25.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		menuFiltr25.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryUwypuklajace.add(menuFiltr25);

		JMenuItem menuFiltr26 = new JMenuItem("Emphasizing Filter W", KeyEvent.VK_5);
		menuFiltr26.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK));
		menuFiltr26.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryUwypuklajace.add(menuFiltr26);

		JMenuItem menuFiltr27 = new JMenuItem("Emphasizing Filter NW", KeyEvent.VK_6);
		menuFiltr27.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6, ActionEvent.ALT_MASK));
		menuFiltr27.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryUwypuklajace.add(menuFiltr27);

		JMenuItem menuFiltr28 = new JMenuItem("Emphasizing Filter N", KeyEvent.VK_7);
		menuFiltr28.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_7, ActionEvent.ALT_MASK));
		menuFiltr28.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryUwypuklajace.add(menuFiltr28);

		JMenuItem menuFiltr29 = new JMenuItem("Emphasizing Filter NE", KeyEvent.VK_8);
		menuFiltr29.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_8, ActionEvent.ALT_MASK));
		menuFiltr29.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryUwypuklajace.add(menuFiltr29);
		
//--------------krawedziowe

		JMenuItem menuFiltr30 = new JMenuItem("LAPLACE Filter 1", KeyEvent.VK_1);
		menuFiltr30.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuFiltr30.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryKrawedziowe.add(menuFiltr30);

		JMenuItem menuFiltr31 = new JMenuItem("LAPLACE Filter 2", KeyEvent.VK_2);
		menuFiltr31.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuFiltr31.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryKrawedziowe.add(menuFiltr31);

		JMenuItem menuFiltr32 = new JMenuItem("LAPLACE Filter 3", KeyEvent.VK_3);
		menuFiltr32.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuFiltr32.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryKrawedziowe.add(menuFiltr32);

		JMenuItem menuFiltr33 = new JMenuItem("Diagonal LAPLACE Filter", KeyEvent.VK_4);
		menuFiltr33.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		menuFiltr33.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryKrawedziowe.add(menuFiltr33);

		JMenuItem menuFiltr34 = new JMenuItem("Vertical LAPLACE Filter", KeyEvent.VK_5);
		menuFiltr34.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK));
		menuFiltr34.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryKrawedziowe.add(menuFiltr34);

		JMenuItem menuFiltr35 = new JMenuItem("Horizontal LAPLACE Filter", KeyEvent.VK_6);
		menuFiltr35.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6, ActionEvent.ALT_MASK));
		menuFiltr35.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryKrawedziowe.add(menuFiltr35);

//-------------------- konturowe
		
		JMenuItem menuFiltr36 = new JMenuItem("Horizontal SOBEL Filter", KeyEvent.VK_1);
		menuFiltr36.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuFiltr36.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryKonturowe.add(menuFiltr36);

		JMenuItem menuFiltr37 = new JMenuItem("Vertical SOBEL Filter", KeyEvent.VK_2);
		menuFiltr37.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuFiltr37.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryKonturowe.add(menuFiltr37);

		JMenuItem menuFiltr38 = new JMenuItem("Horizontal PREWITT Filter", KeyEvent.VK_3);
		menuFiltr38.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuFiltr38.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryKonturowe.add(menuFiltr38);

		JMenuItem menuFiltr39 = new JMenuItem("Vertical PREWITT Filter", KeyEvent.VK_4);
		menuFiltr39.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		menuFiltr39.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryKonturowe.add(menuFiltr39);

//------MENU FILTRY STATYSTYCZNE---------

		JMenu menuFiltryStatystyczne = new JMenu("Statistical Filters");
		menuFiltryStatystyczne.setMnemonic(KeyEvent.VK_K);
		menuFiltryStatystyczne.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
		menuFiltryStatystyczne.setEnabled(false);
			
		menuBar.add(menuFiltryStatystyczne);


		JMenuItem menuFiltr100 = new JMenuItem("No Filter", KeyEvent.VK_0);
		menuFiltr100.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.ALT_MASK));
		menuFiltr100.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryStatystyczne.add(menuFiltr100);
		menuFiltryStatystyczne.addSeparator();
		
		JMenuItem menuFiltr101 = new JMenuItem("Minimal Filter", KeyEvent.VK_1);
		menuFiltr101.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuFiltr101.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryStatystyczne.add(menuFiltr101);

		JMenuItem menuFiltr102 = new JMenuItem("Maximal Filter", KeyEvent.VK_2);
		menuFiltr102.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuFiltr102.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryStatystyczne.add(menuFiltr102);

		JMenuItem menuFiltr103 = new JMenuItem("Kuwahar's Filter", KeyEvent.VK_3);
		menuFiltr103.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuFiltr103.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryStatystyczne.add(menuFiltr103);
		
		JMenuItem menuFiltr104 = new JMenuItem("Median Filter", KeyEvent.VK_4);
		menuFiltr104.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		menuFiltr104.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuFiltryStatystyczne.add(menuFiltr104);
		
//------MENU O PROGRAMIE------------------
	
		JMenuItem menuOProgramie = new JMenuItem("About..");
		menuOProgramie.setMnemonic(KeyEvent.VK_P);
		menuOProgramie.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
		menuBar.add(menuOProgramie);
	
		setJMenuBar(menuBar);

		MyPanel panel = new MyPanel();
		add(panel);
		borderLayout.addLayoutComponent(panel, BorderLayout.CENTER);		
		this.setVisible(true);

//-----OBSLUGA ZDARZEN-------------------		
		
		menuOtworzPlik.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imageLoaded = panel.choseAndLoadImage();
				if(imageLoaded)
				{
					menuFiltryLiniowe.setEnabled(true);
					menuFiltryStatystyczne.setEnabled(true);
					
				}
				if(!imageLoaded)
				{
					menuFiltryLiniowe.setEnabled(false);
					menuFiltryStatystyczne.setEnabled(false);
			
				}
			}
		});
		
		menuZapiszPlik.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.choseAndSaveImage();
			}
		});
		
		menuZakoncz.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		menuOProgramie.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setVisible(true);
			}
		});
		
		
		menuBezFiltra.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(0);
			}
		});
		
		menuFiltr1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(1);
			}
		});
		
		menuFiltr2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(2);
			}
		});
		
		menuFiltr3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(3);
			}
		});
		
		menuFiltr4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(4);
			}
		});
		menuFiltr5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(5);
			}
		});
		menuFiltr6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(6);
			}
		});
		menuFiltr7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(7);
			}
		});
		menuFiltr8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(8);
			}
		});
		menuFiltr9.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(9);
			}
		});
		menuFiltr10.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(10);
			}
		});
		menuFiltr11.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(11);
			}
		});
		menuFiltr12.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(12);
			}
		});
		menuFiltr13.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(13);
			}
		});
		menuFiltr14.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(14);
			}
		});
		menuFiltr15.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(15);
			}
		});
		menuFiltr16.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(16);
			}
		});
		menuFiltr17.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(17);
			}
		});
		menuFiltr18.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(18);
			}
		});
		menuFiltr19.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(19);
			}
		});
		menuFiltr20.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(20);
			}
		});
		menuFiltr21.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(21);
			}
		});
		menuFiltr22.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(22);
			}
		});
		menuFiltr23.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(23);
			}
		});
		menuFiltr24.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(24);
			}
		});
		menuFiltr25.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(25);
			}
		});
		menuFiltr26.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(26);
			}
		});
		menuFiltr27.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(27);
			}
		});
		menuFiltr28.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(28);
			}
		});
		menuFiltr29.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(29);
			}
		});
		menuFiltr30.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(30);
			}
		});
		menuFiltr31.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(31);
			}
		});
		menuFiltr32.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(32);
			}
		});
		menuFiltr33.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(33);
			}
		});
		menuFiltr34.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(34);
			}
		});
		menuFiltr35.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(35);
			}
		});
		menuFiltr36.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(36);
			}
		});
		menuFiltr37.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(37);
			}
		});
		menuFiltr38.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(38);
			}
		});
		menuFiltr39.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(39);
			}
		});
		menuFiltr40.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(40);
			}
		});
		menuFiltr41.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(41);
			}
		});
		menuFiltr42.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(42);
			}
		});
		menuFiltr43.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(43);
			}
		});
		menuFiltr44.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(44);
			}
		});
		menuFiltr45.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(45);
			}
		});
		menuFiltr46.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(46);
			}
		});
		menuFiltr47.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(47);
			}
		});
		
		menuFiltr100.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(100);
			}
		});
		
		menuFiltr101.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(101);
			}
		});
		
		menuFiltr102.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(102);
			}
		});
		
		menuFiltr103.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(103);
			}
		});
		
		menuFiltr104.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.drawFiltrImage(104);
			}
		});

		
	}
}
