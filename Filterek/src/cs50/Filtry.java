package cs50;

import java.awt.image.BufferedImage;

public class Filtry {
	//filtry 3x3
	public static int f1[] = {1, 1, 1, 1, 1, 1, 1, 1, 1}; 			//usredniajacy
	public static int f2[] = {1, 1, 1, 1, 2, 1, 1, 1, 1}; 			//LP1
	public static int f3[] = {1, 1, 1, 1, 4, 1, 1, 1, 1}; 			//LP2
	public static int f4[] = {1, 1, 1, 1, 12, 1, 1, 1, 1}; 			//LP3
	public static int f5[] = {1, 2, 1, 2, 4, 2, 1, 2, 1}; 			//gaus
	public static int f6[] = {-1, -1, -1, -1, 9 , -1, -1, -1, -1};	//usun srednia
	public static int f7[] = { 0, -1,  0, -1,  5, -1,	0, -1,  0};	//hp1
	public static int f8[] = { 1, -2,  1, -2,  5, -2,	1, -2,  1};	//hp2
	public static int f9[] = { 0, -1,  0, -1,  20, -1, 0, -1,  0};	//hp3
	public static int f10[] = { 0,  0,  0, -1,  1,  0, 0,  0,  0};	//poziomy
	public static int f11[] = { 0, -1,  0, 0,  1,  0, 0,  0,  0};	//pionowy
	public static int f12[] = {-1,  0,  0, 0,  1,  0, 0,  0,  0};	//ukosny
	public static int f13[] = { 0,  0, -1, 0, 1, 0, 0,  0,  0}; 	//ukosny2
	public static int f14[] = {-1,  1,  1, -1, -2,  1, -1,  1,  1}; //gradient E
	public static int f15[] = {-1, -1,  1, -1, -2,  1, 1,  1,  1}; 	//gradient SE
	public static int f16[] = {-1, -1, -1, 1, -2,  1, 1,  1,  1}; 	//gradient S
	public static int f17[] = { 1, -1, -1, 1, -2, -1, 1,  1,  1}; 	//gradient SW
	public static int f18[] = { 1,  1, -1, 1, -2, -1, 1,  1, -1};	//gradient W
	public static int f19[] = { 1,  1,  1, 1, -2, -1, 1, -1, -1};	//gradient NW
	public static int f20[] = { 1,  1,  1, 1, -2,  1, -1, -1, -1};	//gradient N
	public static int f21[] = { 1,  1,  1, -1, -2,  1, -1, -1,  1}; //gradient NE
	public static int f22[] = {-1,  0,  1, -1,  1,  1, -1,  0,  1}; //uwypuklajacy E
	public static int f23[] = {-1, -1,  0, -1,  1,  1, 0,  1,  1};	//uwypuklajacy SE
	public static int f24[] = {-1, -1, -1, 0,  1,  0, 1,  1,  1};	//uwypuklajacy S
	public static int f25[] = { 0, -1, -1, 1,  1, -1, 1,  1,  0};	//uwypuklajacy SW
	public static int f26[] = { 1,  0, -1, 1,  1, -1, 1,  0, -1};	//uwypuklajacy W
	public static int f27[] = { 1,  1,  0, 1,  1, -1, 0, -1, -1};	//uwypuklajacy NW
	public static int f28[] = { 1,  1,  1, 0,  1,  0, -1, -1, -1};	//uwypuklajacy N
	public static int f29[] = { 0,  1,  1, -1,  1,  1, -1, -1,  0}; //uwypuklajacy NE
	public static int f30[] = { 0, -1,  0, -1,  4, -1, 0, -1,  0};	//LAPL1
	public static int f31[] = {-1, -1, -1, -1,  8, -1, -1, -1, -1};	//LAPL2
	public static int f32[] = { 1, -2,  1, -2,  4, -2, 1, -2,  1};	//LAPL3
	public static int f33[] = {-1,  0, -1, 0,  4,  0, -1,  0, -1};	//LAPL skosny
	public static int f34[] = { 0, -1,  0, 0,  2,  0, 0, -1,  0};	//LAPL pionowy
	public static int f35[] = { 0,  0,  0, -1,  2, -1, 0,  0,  0};	//LAPL poziomy
	public static int f36[] = { 1,  2,  1, 0,  0,  0, -1, -2, -1};	//SOBEL poziomy
	public static int f37[] = { 1,  0, -1, 2,  0, -2, 1,  0, -1};	//SOBEL pionowy 
	public static int f38[] = {-1, -1, -1, 0,  0,  0, 1,  1,  1};	//PREWITT poziomy
	public static int f39[] = { 1,  0, -1, 1,  0, -1, 1,  0, -1};	//PREWITT pionowy
	
	//filtry 5x5
	public static int f40[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};	//kwadratowy
	public static int f41[] = {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0};	//kolowy
	public static int f42[] = {1, 2, 3, 2, 1, 2, 4, 6, 4, 2, 3, 6, 9, 6, 3, 2, 4, 6, 4, 2, 1, 2, 3, 2, 1};	//piramidalny
	public static int f43[] = {0, 0, 1, 0, 0, 0, 2, 2, 2, 0, 1, 2, 5, 2, 1, 0, 2, 2, 2, 0, 0, 0, 1, 0, 0};	//stozkowy
	public static int f44[] = {1, 1, 2, 1, 1, 1, 2, 4, 2, 1, 2, 4, 8, 4, 2, 1, 2, 4, 2, 1, 1, 1, 2, 1, 1};	//gaus2
	public static int f45[] = {0, 1, 2, 1, 0, 1, 4, 8, 4, 1, 2, 8, 16,8, 2, 1, 4, 8, 4, 1, 0, 1, 2, 1, 0};	//gaus3
	public static int f46[] = {1, 4, 7, 4, 1, 4,16,26,16, 4, 7,26,41,26, 7, 4,26,16,26, 4, 1, 4, 7, 4, 1};	//gaus4
	
	//filtry 7x7 - gaus5
	public static int f47[] = {1,1,2,2,2,1,1,1,2,2,4,2,2,1,2,2,4,8,4,2,2,2,4,8,16,8,4,2,2,2,4,8,4,2,2,1,2,2,4,2,2,1,1,1,2,2,2,1,1};
	 		
	
	public static BufferedImage FiltrLiniowy(BufferedImage image, int[] filtr)
	{
		
		int height = image.getHeight();
		int width = image.getWidth();
		BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	
		int rozmiar = 0;
		int margines = 0;
		int wagaMaski = 0;
		int dlugosc = filtr.length;
		
		if(dlugosc == 9) { rozmiar = 3; margines = 1;}
		else if(dlugosc == 25) { rozmiar = 5; margines = 2;}
		else if(dlugosc == 49) { rozmiar = 7; margines = 3;}
		else if(dlugosc == 81)  { rozmiar = 9; margines = 4;}
		else 
		{ 
			//System.out.println("Nieprawid�owy rozmiar filtra");   
			return image; 
		}
		
		for (int pozycja=0; pozycja<dlugosc; pozycja++)
		{
			wagaMaski += filtr[pozycja];
		}
		
		for(int rows = 0 + margines; rows < height - margines; rows++)
		{
			for(int cols = 0 + margines; cols < width - margines; cols++)
			{
				int sumaR = 0;
				int sumaG = 0;
				int sumaB = 0;

				for (int linia = 0; linia < rozmiar; linia++)
					for (int kolumna = 0; kolumna < rozmiar; kolumna++)
					{					
						int rgb = image.getRGB(cols + kolumna - margines, rows + linia - margines);
						int b = (rgb)&0xFF;
						int g = (rgb>>8)&0xFF;
						int r = (rgb>>16)&0xFF;
						
						sumaR += filtr[linia * rozmiar + kolumna]*r;
						sumaG += filtr[linia * rozmiar + kolumna]*g;
						sumaB += filtr[linia * rozmiar + kolumna]*b;
					}
				if(wagaMaski != 0) 
				{
					sumaR /= wagaMaski;
					sumaG /= wagaMaski;
					sumaB /= wagaMaski;
				}
				if (sumaR > 255) sumaR = 255;
				else if (sumaR < 0)	sumaR = 0;
				
				if (sumaG > 255) sumaG = 255;
				else if (sumaG < 0) sumaG = 0;
				
				if (sumaB > 255) sumaB = 255;
				else if (sumaB < 0) sumaB = 0;
				
				int newrgb = sumaB+(sumaG<<8)+(sumaR<<16);
				newImage.setRGB(cols, rows, newrgb);
			}
		}
		return newImage;
	}
	
	public static BufferedImage FiltrMinimalny(BufferedImage image)
	{
		int height = image.getHeight();
		int width = image.getWidth();
		BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		int rozmiar = 3;
		int margines = 1;

		for(int rows = 0 + margines; rows < height - margines; rows++)
		{
			for(int cols = 0 + margines; cols < width - margines; cols++)
			{
				int minR = 255;
				int minG = 255;
				int minB = 255;
				for (int linia = 0; linia < rozmiar; linia++)
				{
					for (int kolumna = 0; kolumna < rozmiar; kolumna++)
					{					
						int rgb = image.getRGB(cols + kolumna - margines, rows + linia - margines);
						int b = (rgb)&0xFF;
						int g = (rgb>>8)&0xFF;
						int r = (rgb>>16)&0xFF;
						if (minR > r) minR = r;
						if (minG > r) minG = g;
						if (minB > r) minB = b;
					}
				}
				int newrgb = minB+(minG<<8)+(minR<<16);
				newImage.setRGB(cols, rows, newrgb);
			}
		}
		return newImage;
	}
	
	public static BufferedImage FiltrMaksymalny(BufferedImage image)
	{
		int height = image.getHeight();
		int width = image.getWidth();
		BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		int rozmiar = 3;
		int margines = 1;

		for(int rows = 0 + margines; rows < height - margines; rows++)
		{
			for(int cols = 0 + margines; cols < width - margines; cols++)
			{
				int maxR = 0;
				int maxG = 0;
				int maxB = 0;
				for (int linia = 0; linia < rozmiar; linia++)
				{
					for (int kolumna = 0; kolumna < rozmiar; kolumna++)
					{					
						int rgb = image.getRGB(cols + kolumna - margines, rows + linia - margines);
						int b = (rgb)&0xFF;
						int g = (rgb>>8)&0xFF;
						int r = (rgb>>16)&0xFF;
						if (maxR < r) maxR = r;
						if (maxG < r) maxG = g;
						if (maxB < r) maxB = b;
					}
				}
				int newrgb = maxB+(maxG<<8)+(maxR<<16);
				newImage.setRGB(cols, rows, newrgb);
			}
		}
		return newImage;
	}
	public static BufferedImage FiltrKuwahara(BufferedImage image)
	{
		int height = image.getHeight();
		int width = image.getWidth();
		BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//int rozmiar = 5; //rozmiar macierzy zmienna nie u�ywana
		int margines = 2;
		int podzial = 4;
		int granica = 3;
		double pola = 9.0;
		
		double sredniaR[] = new double[podzial];   
		double sredniaG[] = new double[podzial];   
		double sredniaB[] = new double[podzial];   
		
		double wariancjaR[] = new double[podzial];  
		double wariancjaG[] = new double[podzial];  
		double wariancjaB[] = new double[podzial];  
		
		//najmniejsza wariancja
		int minR = 0;
		int minG = 0;
		int minB = 0; 
		
		for(int rows = 0 + margines; rows < height - margines; rows++)
		{
			for(int cols = 0 + margines; cols < width - margines; cols++)
			{
				for (int counter = 0; counter < podzial; counter++) //zeruj tablice
				{
					sredniaR[counter] = 0;
					sredniaG[counter] = 0;
					sredniaB[counter] = 0;
					
					wariancjaR[counter] = 0;
					wariancjaG[counter] = 0;
					wariancjaB[counter] = 0;
				}
				
				//policz srednie
				for (int linia = 0; linia < granica; linia++)
				{
					for (int kolumna = 0; kolumna < granica; kolumna++)
					{					
						int rgb = image.getRGB(cols + kolumna - margines, rows + linia - margines);
						int b = (rgb)&0xFF;
						int g = (rgb>>8)&0xFF;
						int r = (rgb>>16)&0xFF;
						sredniaR[0] += r / pola;
						sredniaG[0] += g / pola;
						sredniaB[0] += b / pola;
						
						rgb = image.getRGB(cols + kolumna, rows + linia - margines);
						b = (rgb)&0xFF;
						g = (rgb>>8)&0xFF;
						r = (rgb>>16)&0xFF;
						sredniaR[1] += r / pola;
						sredniaG[1] += g / pola;
						sredniaB[1] += b / pola;
						
						rgb = image.getRGB(cols + kolumna - margines, rows + linia);
						b = (rgb)&0xFF;
						g = (rgb>>8)&0xFF;
						r = (rgb>>16)&0xFF;
						sredniaR[2] += r / pola;
						sredniaG[2] += g / pola;
						sredniaB[2] += b / pola;
						
						rgb = image.getRGB(cols + kolumna, rows + linia);
						b = (rgb)&0xFF;
						g = (rgb>>8)&0xFF;
						r = (rgb>>16)&0xFF;
						sredniaR[3] += r / pola;
						sredniaG[3] += g / pola;
						sredniaB[3] += b / pola;
					}
				}
				
				//policz wariancje
				for (int linia = 0; linia < granica; linia++)
				{
					for (int kolumna = 0; kolumna < granica; kolumna++)
					{					
						int rgb = image.getRGB(cols + kolumna - margines, rows + linia - margines);
						int b = (rgb)&0xFF;
						int g = (rgb>>8)&0xFF;
						int r = (rgb>>16)&0xFF;
						wariancjaR[0] += (r - sredniaR[0]) * (r - sredniaR[0]);
						wariancjaG[0] += (g - sredniaG[0]) * (g - sredniaG[0]);
						wariancjaB[0] += (b - sredniaB[0]) * (b - sredniaB[0]);
						
						rgb = image.getRGB(cols + kolumna, rows + linia - margines);
						b = (rgb)&0xFF;
						g = (rgb>>8)&0xFF;
						r = (rgb>>16)&0xFF;
						wariancjaR[1] += (r - sredniaR[1]) * (r - sredniaR[1]);
						wariancjaG[1] += (g - sredniaG[1]) * (g - sredniaG[1]);
						wariancjaB[1] += (b - sredniaB[1]) * (b - sredniaB[1]);
						
						rgb = image.getRGB(cols + kolumna - margines, rows + linia);
						b = (rgb)&0xFF;
						g = (rgb>>8)&0xFF;
						r = (rgb>>16)&0xFF;
						wariancjaR[2] += (r - sredniaR[2]) * (r - sredniaR[2]);
						wariancjaG[2] += (g - sredniaG[2]) * (g - sredniaG[2]);
						wariancjaB[2] += (b - sredniaB[2]) * (b - sredniaB[2]);
						
						rgb = image.getRGB(cols + kolumna, rows + linia);
						b = (rgb)&0xFF;
						g = (rgb>>8)&0xFF;
						r = (rgb>>16)&0xFF;
						wariancjaR[3] += (r - sredniaR[3]) * (r - sredniaR[3]);
						wariancjaG[3] += (g - sredniaG[3]) * (g - sredniaG[3]);
						wariancjaB[3] += (b - sredniaB[3]) * (b - sredniaB[3]);
					}
				}
				
				//znajdz najmniejsza wariancje
				for (int counter = 0; counter < podzial; counter++)
				{
					if (wariancjaR[counter] < wariancjaR[minR]) minR = counter;
					if (wariancjaG[counter] < wariancjaG[minG]) minG = counter;
					if (wariancjaB[counter] < wariancjaB[minB]) minB = counter;
				}
				int newrgb = (int)sredniaB[minB]+((int)sredniaG[minG]<<8)+((int)sredniaR[minR]<<16);
				newImage.setRGB(cols, rows, newrgb);
			}
		}
		return newImage;
	}
	
	
	//dla algorytmu Hoar'e - obliczanie mediany autor: Tomasz Lubi�ski
	private static int partition(int c[], int a, int b)
	{
		int e=c[a];        //elemennt dzielacy
		int tmp;
		while (a<b)
		{
			while ((a<b) && (c[b]>=e)) b--;
			while ((a<b) && (c[a]<e)) a++;
			if (a<b)
			{
				tmp=c[a];
				c[a]=c[b];
				c[b]=tmp;
			}
		}
		return a;
	}
	 
	//algorytmu Hoar'e - obliczanie mediany autor: Tomasz Lubi�ski
	private static int med(int c[], int size)
	{
		//algorytm Hoare'a
		int i = 0;
		int j = size - 1;
		int w = j / 2;
		int k;
		while (i!=j)
		{
			k=partition(c,i,j);
			k=k-i+1;
			if (k>=w)
				j=i+k-1;
			if (k<w)
			{
				w-=k;
				i+=k;
			}
		}
		return c[i];
	}

	public static BufferedImage FiltrMedianowy(BufferedImage image)
	{
		int height = image.getHeight();
		int width = image.getWidth();
		BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		int rozmiar = 3;
		int margines = 1;
		int macierz = rozmiar * rozmiar;
		
		int R[] = new int[macierz];  
		int G[] = new int[macierz];   
		int B[] = new int[macierz]; 
	
		for(int rows = 0 + margines; rows < height - margines; rows++)
		{
			for(int cols = 0 + margines; cols < width - margines; cols++)
			{
				int counter = 0;
				for (int linia = 0; linia < rozmiar; linia++)
				{
					for (int kolumna = 0; kolumna < rozmiar; kolumna++)
					{					
						int rgb = image.getRGB(cols + kolumna - margines, rows + linia - margines);
						int b = (rgb)&0xFF;
						int g = (rgb>>8)&0xFF;
						int r = (rgb>>16)&0xFF;
						
						R[counter] = r;
						G[counter] = g;
						B[counter] = b;
						
						counter++;
					}
				}
				int newrgb = med(B,macierz)+(med(G,macierz)<<8)+(med(R,macierz)<<16);
				newImage.setRGB(cols, rows, newrgb);
			}
		}
		return newImage;
	}
}