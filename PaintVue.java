import javax.swing.*;
import javax.swing.border.Border;

import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.KeyEvent;
class Fichier extends JMenuBar{
	private JMenu fichier;
	private JMenuItem m1,m2,m3,m4,m5,m6,m7,m8;
	public Fichier(){
		 fichier= new JMenu("Fichier");
		 fichier.setMnemonic('F');
		 fichier.setCursor(new Cursor(Cursor.HAND_CURSOR));  
		// fichier.setBorder (BorderFactory.	createBevelBorder(5, Color.blue, Color.blue));
		 m1= new JMenuItem("Nouvelle",'v');
		 m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK,true));
		 m1.setToolTipText("Creer une Nouvelle image");
		 m1.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\New_ico.png"));
		 m2=new JMenuItem("Ouvrir",'O');
		 m2.setToolTipText("Ouvrir Un Fichier Image existee");
		 m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,Event.CTRL_MASK,true));
		 m2.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\open.png"));
		 m3= new JMenuItem("Enregistrer",'g');
		 m3.setToolTipText("Enregistrer L'image courante");
		 m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,Event.CTRL_MASK,true));
		 m3.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\Save.png"));
		 m4= new JMenuItem("Enregistrer Sous",'u');
		 m4.setToolTipText("Enregistrer L'image courante comme un Nouveau Fichier");
		 m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,Event.CTRL_MASK,true));
		 m4.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\save_as.png"));
		 m5= new JMenuItem("Imprimer",'p');
		 m5.setToolTipText("Imprimer L'image courante");
		 m5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,Event.CTRL_MASK,true));
		 m5.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\print.png"));
	     m6= new JMenuItem("Mise en page",'M');
	     m6.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\mise_en_page.png"));
		 m7= new JMenuItem("Fermer image",'r');
		 m7.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\delete.png"));
		 m8= new JMenuItem("Quitter",'Q');
		 m8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,Event.CTRL_MASK,true));
		 m8.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\exit.png"));
		fichier.add(m1);
		fichier.add(m2);
		fichier.addSeparator();
		fichier.add(m3);
		fichier.add(m4);
		//activation(false);
		fichier.addSeparator();
		fichier.add(m5);
		fichier.addSeparator();
		fichier.add(m6);
		fichier.addSeparator();
		fichier.add(m7);
		fichier.addSeparator();
		fichier.add(m8);
		add(fichier);
		setVisible(true);
	}
	 /*private void activation(boolean actif) {
	      m3.setEnabled(actif);  
	      m4.setEnabled(actif);
	   }*/
	//les SETTEURS et GUETTEURS de FICHIER 
	 public JMenu getfichier() {
			return fichier;
	}
	public void setfichier(JMenu fichier) {
			this.fichier=fichier;
	}
		
	 public JMenuItem getm1() {
		 return m1;
	 }
	 public void setm1(JMenuItem m1) {
		 this.m1=m1;
	 }
	 public JMenuItem getm2() {
		 return m2;
	 }
	 public void setm2(JMenuItem m2) {
		 this.m2=m2;
	 }
	 public JMenuItem getm3() {
		 return m3;
	 }
	 public void setm3(JMenuItem m3) {
		 this.m3=m3;
	 }
	 public JMenuItem getm4() {
		 return m4;
	 }
	 public void setm4(JMenuItem m4) {
		 this.m4=m4;
	 }
	 public JMenuItem getm5() {
		 return m5;
	 }
	 public void setm5(JMenuItem m5) {
		 this.m5=m5;
	 }
	 public JMenuItem getm6() {
		 return m6;
	 }
	 public void setm6(JMenuItem m6) {
		 this.m6=m6;
	 }
	 public JMenuItem getm7() {
		 return m7;
	 }
	 public void setm7(JMenuItem m7) {
		 this.m7=m7;
	 }
	 public JMenuItem getm8() {
		 return m8;
	 }
	 public void setm8(JMenuItem m8) {
		 this.m8=m8;
	 }
}
class Edition extends JMenuBar{
	private JMenu edition;
	private JRadioButton b;
	private JMenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15;
	public Edition(){
		edition= new JMenu("Edition");
		edition.setMnemonic('E');
		edition.setCursor(new Cursor(Cursor.HAND_CURSOR));  
		 m1= new JMenu("Selection");
		 m1.setMnemonic('e');
		 m1.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\selection.png"));
		 m2=new JMenuItem("Effacer contenu image",'f');
		 m2.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\image_remove.png"));
		 m3= new JMenuItem("copier",'i');
		 m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,Event.CTRL_MASK,true));
		 m3.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\copy.png"));
		 m4= new JMenuItem("couper",'p');
		 m4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,Event.CTRL_MASK,true));
		 m4.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\cut.png"));
		 m5= new JMenu("coller");
		 m5.setToolTipText("Coller le contenu d'Image");
		 m5.setMnemonic('l');
		 m5.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\paste.png"));
		 m14=new JMenuItem("coller",'l');
		 m14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,Event.CTRL_MASK,true));
		 m15=new JMenuItem("coller comme nouvelles image",'n');
		 m15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK,true));
		 m6= new JMenuItem("dupliquer image ",'d');
		 m6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,Event.CTRL_MASK,true));
	     m6.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\duplique.png"));
		 m7= new JMenuItem("annuler",'a');
		 m7.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\annuler.png"));
		 m8= new JMenuItem("historique d'Annulation",'h');
		 m8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,Event.CTRL_MASK,true));
		 m8.setIcon (new ImageIcon ("C:\\Users\\pc\\Desktop\\icone\\list.png"));
		 m9=new JCheckBoxMenuItem("detection de contour");
		 m10=new JCheckBoxMenuItem("selectionner tous");
		 m11=new JCheckBoxMenuItem("selectionner par couleurs");
		 m12=new JCheckBoxMenuItem("selection rectangulaire");
		 m13=new JCheckBoxMenuItem("selection a main levee");
		 m1.add(m9);
		 m1.add(m10);
		 m1.add(m11);
		 m1.add(m12);
		 m1.add(m13);
		edition.add(m1);
		edition.add(m2);
		edition.addSeparator();
		edition.add(m3);
		edition.add(m4);
		edition.addSeparator();
		 m5.add(m14);
		 m5.add(m15);
		edition.add(m5);
		edition.addSeparator();
		edition.add(m6);
		edition.addSeparator();
		edition.add(m7);
		edition.addSeparator();
		edition.add(m8);
		add(edition);
		setVisible(true);
	}
	//les SETTEURS et GUETTEURS d'EDITION 
	 public JMenuItem getm1() {
		 return m1;
	 }
	 public void setm1(JMenuItem m1) {
		 this.m1=m1;
	 }
	 public JMenuItem getm2() {
		 return m2;
	 }
	 public void setm2(JMenuItem m2) {
		 this.m2=m2;
	 }
	 public JMenuItem getm3() {
		 return m3;
	 }
	 public void setm3(JMenuItem m3) {
		 this.m3=m3;
	 }
	 public JMenuItem getm4() {
		 return m4;
	 }
	 public void setm4(JMenuItem m4) {
		 this.m4=m4;
	 }
	 public JMenuItem getm5() {
		 return m5;
	 }
	 public void setm5(JMenuItem m5) {
		 this.m5=m5;
	 }
	 public JMenuItem getm6() {
		 return m6;
	 }
	 public void setm6(JMenuItem m6) {
		 this.m6=m6;
	 }
	 public JMenuItem getm7() {
		 return m7;
	 }
	 public void setm7(JMenuItem m7) {
		 this.m7=m7;
	 }
	 public JMenuItem getm8() {
		 return m8;
	 }
	 public void setm8(JMenuItem m8) {
		 this.m8=m8;
	 }
	 public void setm9(JMenuItem m9) {
		 this.m1=m9;
	 }
	 public JMenuItem getm9() {
		 return m9;
	 }
	 public void setm10(JMenuItem m10) {
		 this.m10=m10;
	 }
	 public JMenuItem getm10() {
		 return m10;
	 }
	 public void setm11(JMenuItem m11) {
		 this.m11=m11;
	 }
	 public JMenuItem getm11() {
		 return m11;
	 }
	 public void setm12(JMenuItem m12) {
		 this.m12=m12;
	 }
	 public JMenuItem getm12() {
		 return m12;
	 }
	 public void setm13(JMenuItem m13) {
		 this.m13=m13;
	 }
	 public JMenuItem getm13() {
		 return m13;
	 }
	 public void setm14(JMenuItem m14) {
		 this.m14=m14;
	 }
	 public JMenuItem getm15() {
		 return m15;
	 }
	 public void setm15(JMenuItem m15) {
		 this.m15=m15;
	 }
}
class Insertion extends JToolBar {
	private JPanel toolsDock,mDock;
	private JToolBar mToolBar;
	private Border dockBorder;
	private JButton mNewPaintTool,mOpenFileTool,mSaveTool,mTaillePinceauTool,mCrayonTool,mGommeTool,mBgColorTool,mPinceauTool,mPinceauColor;
	public Insertion() {
	
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		mToolBar = new JToolBar();
		mNewPaintTool= new JButton(new ImageIcon("C:\\Users\\pc\\Desktop\\icone\\paint\\pencil1.png"));
		mOpenFileTool = new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\pencil.png"));
		mSaveTool= new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\pencil2.png"));
		mTaillePinceauTool= new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\pencil3.png"));
		mCrayonTool= new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\pencil4.png"));
		mPinceauTool= new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\pencil5.png"));
		mPinceauColor= new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\gomme.png"));
		mGommeTool= new JButton(new ImageIcon("images/folder_32.png"));
		mBgColorTool= new JButton(new ImageIcon("images/folder_32.png"));
		mToolBar.add(mNewPaintTool);
		mToolBar.add(mOpenFileTool);
		mToolBar.add(mSaveTool);
		mToolBar.addSeparator();
		mToolBar.add(mTaillePinceauTool);
		mToolBar.add(mCrayonTool);
		mToolBar.add(mPinceauTool);
		mToolBar.add(mPinceauColor);
		mToolBar.addSeparator();
		mToolBar.add(mGommeTool);
		mToolBar.add(mBgColorTool);
		mToolBar.setOrientation(JToolBar.HORIZONTAL);
		add(mToolBar);
		//
		 
		
	}
	public void setmDock(JPanel mDock) {
		this.mDock=mDock;
	}
	public JPanel getmDock() {
		return mDock;
	}
	
}
class Palette extends JMenuBar{
	private JPanel toolsDock,mDock;
	private JButton mColorRed,mColorBlue ,mColorBlack,mColorViolet, mColorWhite ,mColorGrey ,mColorGreen ,mColorYellow;
	public Palette() {
		mDock = new JPanel();
		mDock.setPreferredSize(new Dimension(50, 50));
		mDock.setLayout(new GridLayout(2,1));
		Border[]dockBorder= {BorderFactory.createTitledBorder(""), 
				BorderFactory.createTitledBorder("Palette"),
				BorderFactory.createLineBorder(Color.white), 
				BorderFactory.createRaisedBevelBorder()};
		toolsDock=new JPanel();	
		toolsDock.setLayout(new GridLayout(8,1));
		 mColorRed = new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\paint\\couleur\\rouge.png"));
		 mColorBlue = new JButton(new ImageIcon("C:\\Users\\pc\\Desktop\\icone\\paint\\couleur\\bleu.jpg"));
		 mColorBlack = new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\couleur\\\\noir.jpg"));
		 mColorViolet = new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\couleur\\\\violet.jpg"));
		 mColorWhite = new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\couleur\\\\white.jpg"));
		 mColorGrey = new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\couleur\\\\gris.jpg"));
		 mColorYellow = new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\couleur\\\\vert.jpg"));
		 mColorGreen = new JButton(new ImageIcon("C:\\\\Users\\\\pc\\\\Desktop\\\\icone\\\\paint\\\\couleur\\\\jaune.jpg"));
		toolsDock.add(mColorRed );
		toolsDock.add(mColorBlue);
		toolsDock.add(mColorBlack);
		toolsDock.add(mColorViolet);
		toolsDock.add(mColorWhite);
		toolsDock.add(mColorGrey);
		toolsDock.add(mColorYellow);
		toolsDock.add(mColorGreen);
		toolsDock.setBorder(dockBorder[0]);	
		toolsDock.setVisible(true);
		mDock.setBorder(dockBorder[1]);
		mDock.add(toolsDock, BorderLayout.NORTH);
        setVisible(true);
        add(mDock);
		
	}
	public void setmDock(JPanel mDock) {
		this.mDock=mDock;
	}
	public JPanel getmDock() {
		return mDock;
	}
	
}
class Couleurs extends JMenuBar{
	private JMenu color;
	public Couleurs() {
		color=new JMenu("Couleurs");
		add(color);
		setVisible(true);
	}
}
class Image{
	public Image() {
		
	}
}
class Affichage{
	public Affichage() {
		
	}
}
class Aide{
	public Aide() {
		
	}
}
class Menubar extends JMenuBar{
	private JMenuBar menubar;
	private  Fichier fichier;
	private  Edition edition;
	private Couleurs color;
	public Menubar() {

	    fichier =new Fichier();
	    edition =new Edition();
	    color=new Couleurs();
        menubar=new JMenuBar();
        menubar.add(fichier);
        menubar.add(edition);
        menubar.add(color);
        menubar.setVisible(true);
        add(menubar);
        
	}
	//les SETTEURS et GUETTEURS de MENUBAR 
	public Fichier getfichier() {
		 return fichier;
	 }
	public void setfichier(Fichier fichier) {
		 this.fichier=fichier;
	 } 
	public Edition getedition() {
		 return edition;
	 }
	public void setedition(Edition edition) {
		 this.edition=edition;
	 } 
	
}
/*
class Toolbar extends JToolBar{
	private JToolBar toolbar;
	private JButton b1,b2,b3,b4,b5,b6,b8,b9;
	public Toolbar() {
		toolbar=new JToolBar();
		b1=new JButton("ok");
		b1.setBorder(BorderFactory.createRaisedBevelBorder());
		toolbar.add(b1);
		toolbar.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.LIGHT_GRAY));
		toolbar.setSize(3000,35000);
	    toolbar.setOrientation(JToolBar.HORIZONTAL);
	    toolbar.setFloatable(true);
	    toolbar.setLayout(new FlowLayout());
	    add(toolbar,BorderLayout.NORTH); 
		setVisible(true);
	}
}
*/
/*class dessin extends JComponent{

	  public void paintComponent(Graphics g) {
		    g.setColor(Color.white);
		    g.fillRect(0, 0, getWidth(), getHeight());
		        
		  }
	  
}*/
class Point {

	  //Couleur du point
	  private Color color = Color.BLACK;
	  //Taille
	  private int size = 10;
	  //Position sur l'axe X : initialisé au dehors du conteneur
	  private int x = -10;
	  //Position sur l'axe Y : initialisé au dehors du conteneur
	  private int y = -10;
	  //Type de point
	  private String type = "ROND";

	  // Constructeur par défaut
	  public Point(){}

	  public Point(int x, int y, int size, Color color, String type){
	    this.size = size;
	    this.x = x;
	    this.y = y;
	    this.color = color;
	    this.type = type;
	  }
	  public Color getColor() {
	    return color;
		  }
		  public void setColor(Color color) {
		    this.color = color;
		  }
		  public int getSize() {
		    return size;
		  }
		  public void setSize(int size) {
		    this.size = size;
		  }
		  public int getX() {
		    return x;
		  }
		  public void setX(int x) {
		    this.x = x;
		  }
		  public int getY() {
		    return y;
		  }
		  public void setY(int y) {
		    this.y = y;
		  }
		  public String getType() {
		    return type;
		  }
		  public void setType(String type) {
		    this.type = type;
		  }}
class DrawPanel extends JPanel{
	 //Couleur du pointeur
	  private Color pointerColor = Color.BLACK;
	  //Forme du pointeur
	  private String pointerType = "CIRCLE";
	  //Position X du pointeur
	  private int posX = -10, oldX = -10;
	  //Position Y du pointeur
	  private int posY = -10, oldY = -10;
	  //Pour savoir si on doit dessiner ou non
	  private boolean erasing = true;
	  //Taille du pointeur
	  private int pointerSize = 15;
	  //Collection de points ! 
	  private ArrayList<Point> points = new ArrayList<Point>();  
	  
	  public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, getWidth(), getHeight());

		    //Si on doit effacer, on ne passe pas dans le else => pas de dessin
		    if(this.erasing){
		      this.erasing = false;
		    }
		    else{
		      //On parcourt notre collection de points
		      for(Point p : this.points)
		      {
		        //On récupère la couleur
		        g.setColor(p.getColor());

		        //Selon le type de point
		        if(p.getType().equals("SQUARE")){
		          g.fillRect(p.getX(), p.getY(), p.getSize(), p.getSize());
		        }
		        else{
		          g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
		        }
		      }
		    }        
		  }

		  //Efface le contenu
		  public void erase(){
		    this.erasing = true;
		    this.points = new ArrayList<Point>();
		    repaint();
		  }

		  //Définit la couleur du pointeur
		  public void setPointerColor(Color c){
		    this.pointerColor = c;
		  }

		  //Définit la forme du pointeur
		  public void setPointerType(String str){
		    this.pointerType = str;
		  }      

}
 

public class PaintVue extends JFrame{
	private Menubar menubar;
	private Insertion insertion;
	private Palette palette;
	private JTextArea text;
	private JPanel p1,p2;
	private dessin des;
	private java.awt.Image icon;
	public PaintVue() {
		icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\pc\\Desktop\\icone\\paint\\palette.PNG");  
		setIconImage(icon); 
		setTitle("Paint");
	    setBounds(200,200,500,300);
		menubar=new Menubar();
		insertion =new Insertion();
		palette=new Palette();
		  DrawPanel drawPanel = new DrawPanel();
		  this.getContentPane().add(drawPanel, BorderLayout.CENTER);
		    this.setVisible(true);  
		getContentPane().add(insertion, BorderLayout.NORTH);
		getContentPane().add(palette, BorderLayout.WEST);
		setJMenuBar(menubar);
		text=new JTextArea();
		p2=new JPanel(); 
		/*p2.setPreferredSize(new Dimension(100,400));
s		des=new dessin();
		add(des);
		//add(p2);
		p2.setVisible(true);*/
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public Menubar getmenubar() {
		 return menubar;
	 }
	public void setmenubar(Menubar menubar) {
		 this.menubar=menubar;
	 }
	public JTextArea gettext() {
		 return text;
	 }
	public void settext(JTextArea text) {
		 this.text=text;
	 } 
	

}