package com.cardGame;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;


public class GUI extends JFrame implements ActionListener, MouseListener, MouseMotionListener{

	private Solitaire game;
	public static String IMG_PATH = System.getProperty("user.dir")+"/src/main/java/com/cardGame/resources/";
   public GUI(Solitaire game){
	   this.game= game;
        //Create and set up the window.
       setTitle("Solitaire");
       setSize(900,700);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
       // this supplies the background
       try {
		Image blackImg = ImageIO.read(new File(IMG_PATH+"background.jpg"));
		
		setContentPane(new ImagePanel(blackImg));

       }catch(IOException e) {
    	   e.printStackTrace();
       }
	   setLayout(null);
	   	JPanel gameArea = new JPanel();
		gameArea.setOpaque(false);
		gameArea.setLayout(new GridLayout(2,1));
		gameArea.setBounds(new Rectangle(0,0, 890,690));
		gameArea.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
		

		JPanel gameArea2 = new JPanel();
		gameArea2.setOpaque(false);
		gameArea2.setLayout(new FlowLayout());
		gameArea2.setSize(new Dimension(800,400));
		gameArea2.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.YELLOW));
		gameArea.add(gameArea2);

		//JPanel gameArea2 = new JPanel();
		//gameArea2.setOpaque(false);
		//gameArea2.setLayout(new BoxLayout(gameArea2, BoxLayout.PAGE_AXIS));
		//gameArea2.setPreferredSize(new Dimension(800,400));
		//gameArea2.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.YELLOW));
		//gameArea.add(gameArea2);

		JPanel gameArea3 = new JPanel();
		gameArea3.setOpaque(false);
		gameArea3.setLayout(new FlowLayout());
		gameArea3.setSize(new Dimension(800,240));
		gameArea3.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLUE));
		gameArea.add(gameArea3);

		//JPanel gameArea3 = new JPanel();
		//gameArea3.setOpaque(false);
		//gameArea3.setLayout(new BoxLayout(gameArea3, BoxLayout.PAGE_AXIS));
		//gameArea3.setPreferredSize(new Dimension(800,240));
		//gameArea3.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLUE));
		//gameArea.add(gameArea3);

       /*******
        * This is just a test to make sure images are being read correctly on your machine. Please replace
        * once you have confirmed that the card shows up properly. The code below should allow you to play the solitare
        * game once it's fully created.
        */
        Card card = new Card(2, Card.Suit.Diamonds);
      	gameArea2.add(card);    
		gameArea3.add(card);
	   this.add(gameArea);
        this.setVisible(true);
    }


	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}