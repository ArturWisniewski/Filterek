package cs50;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	/**
	 * panel - p��tno dla obraz�w
	 */
	private static final long serialVersionUID = 1L;
	
	private BufferedImage image;
	private BufferedImage helperImage;
	private BufferedImage orginalImage;
	
	private JFileChooser fc = new JFileChooser();

	public MyPanel()
	{
		super();
		//File imageFile = new File("img/java.png");
		try {
			//helperImage = ImageIO.read(imageFile);
			helperImage = ImageIO.read(getClass().getResource("java.png"));
			//System.out.println("Wybrano plik "+imageFile.getPath());
		} catch (IOException er) {
			System.err.println("Blad odczytu obrazka");
			er.printStackTrace();
		}
		Dimension dimension = new Dimension(helperImage.getWidth(), helperImage.getHeight());
		setPreferredSize(dimension);
		image = helperImage;
	}
	

	@Override
	protected void paintComponent(Graphics arg0) {
		if (image!=null){
		Graphics2D g2d = (Graphics2D) arg0;		
		g2d.drawImage(image.getScaledInstance(this.getWidth(), this.getHeight(), 0), 0, 0, null);
		//System.out.println("printing image");
		}
	}
	
	public boolean choseAndLoadImage()
	{	
		boolean success = true;
		int returnVal = fc.showOpenDialog(MyPanel.this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File imageFile = fc.getSelectedFile();
	        try {
	    		image = ImageIO.read(imageFile);
	    		orginalImage = ImageIO.read(imageFile);
	    		//System.out.println("Wybrano plik "+imageFile.getPath());
	    	} catch (IOException er) {
	    		System.err.println("Blad odczytu obrazka");
	    		//er.printStackTrace();
	    	}
		}
		if (image==null)
		{
			success = false;
			image = helperImage;
		}
		Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
		setPreferredSize(dimension);
		//System.out.println("Przekazano obrazek.");
		this.repaint();
		return success;
	}
	public void choseAndSaveImage()
	{	
		int returnVal = fc.showSaveDialog(MyPanel.this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File imageFile = fc.getSelectedFile();
	        try {
	        	ImageIO.write(image, "jpg", imageFile);
	    		//System.out.println("Wybrano plik "+imageFile.getPath());
	    	} catch (IOException er) {
	    		System.err.println("Blad odczytu obrazka");
	    		//er.printStackTrace();
	    	}
		}
	}
	
	public void drawFiltrImage(int nr_filtra)
	{
		switch(nr_filtra){
			case 0: image = orginalImage; break;
			case 1: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f1); break;
			case 2: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f2); break;
			case 3: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f3); break;
			case 4: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f4); break;
			case 5: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f5); break;
			case 6: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f6); break;
			case 7: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f7); break;
			case 8: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f8); break;
			case 9: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f9); break;
			case 10: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f10); break;
			case 11: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f11); break;
			case 12: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f12); break;
			case 13: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f13); break;
			case 14: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f14); break;
			case 15: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f15); break;
			case 16: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f16); break;
			case 17: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f17); break;
			case 18: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f18); break;
			case 19: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f19); break;
			case 20: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f20); break;
			case 21: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f21); break;
			case 22: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f22); break;
			case 23: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f23); break;
			case 24: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f24); break;
			case 25: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f25); break;
			case 26: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f26); break;
			case 27: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f27); break;
			case 28: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f28); break;
			case 29: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f29); break;
			case 30: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f30); break;
			case 31: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f31); break;
			case 32: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f32); break;
			case 33: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f33); break;
			case 34: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f34); break;
			case 35: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f35); break;
			case 36: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f36); break;
			case 37: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f37); break;
			case 38: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f38); break;
			case 39: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f39); break;
			case 40: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f40); break;
			case 41: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f41); break;
			case 42: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f42); break;
			case 43: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f43); break;
			case 44: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f44); break;
			case 45: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f45); break;
			case 46: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f46); break;
			case 47: image = Filtry.FiltrLiniowy(orginalImage, Filtry.f47); break;
			case 100: image = orginalImage; break;
			case 101: image = Filtry.FiltrMinimalny(orginalImage); break;
			case 102: image = Filtry.FiltrMaksymalny(orginalImage); break;
			case 103: image = Filtry.FiltrKuwahara(orginalImage); break;
			case 104: image = Filtry.FiltrMedianowy(orginalImage); break;
			
			
			default: image = orginalImage; break;	
		}
		Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
		setPreferredSize(dimension);
		//System.out.println("Przekazano obrazek.");
		this.repaint();
	}	
}
