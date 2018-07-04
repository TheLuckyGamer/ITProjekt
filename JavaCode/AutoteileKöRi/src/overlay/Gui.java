package overlay;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;
	

;
public class Gui extends JFrame {
	
	JPanel sFeld;
	JPanel tFeld;
	JButton sButton;
	JScrollPane tabelle;
	JTextArea inhalt;
	float PPM;
	
	
	public Gui(){
		
		PPM = this.getHeight();
		inhalt = new JTextArea();
		
		sFeld = new JPanel();
		tFeld = new JPanel();
		sButton = new JButton();
		tabelle = new JScrollPane(inhalt);
		
		inhalt.setText("xx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\n");
		
		this.setSize(new Dimension(500, 500));
		this.setLocation(430, 200);
		this.setTitle("KoSi - Werkstätten");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		tFeld.setPreferredSize(new Dimension(400, 400));
		tFeld.setSize(new Dimension(200, 200));
		
		sFeld.setPreferredSize(new Dimension(200, 200));
		sFeld.setSize(new Dimension(200, 200));
		sFeld.setLayout(null);
		
		tabelle.setSize(new Dimension(200, 400));
		tabelle.setVisible(true);
		
		
		
		
		sButton.setVisible(true);
		sButton.setSize(new Dimension((int) (80/PPM) , (int)(20/PPM)));
		
		sButton.setText("Suchen");
		
		sFeld.add(sButton);
		tFeld.add(tabelle);
		
		this.add(BorderLayout.WEST, sFeld);
		this.add(BorderLayout.EAST, tFeld);
		this.setVisible(true);
	}


}

