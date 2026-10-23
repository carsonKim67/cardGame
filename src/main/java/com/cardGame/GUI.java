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
import java.util.Stack;


public class GUI extends JFrame implements ActionListener, MouseListener, MouseMotionListener{

	private Solitaire game;
	public static String IMG_PATH = System.getProperty("user.dir")+"/src/main/java/com/cardGame/resources/";
   public GUI(Solitaire game){
	   this.game= game;
        //Create and set up the window.
       setTitle("Blackjack");
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
       // Card card = new Card(2, Card.Suit.Diamonds);
      	//gameArea2.add(card);    
		//gameArea3.add(card);
	   this.add(gameArea);
        this.setVisible(true);
   // Create a single test stack of cards
		Stack<Card> testStack = new Stack<>();
		testStack.push(new Card(1, Card.Suit.Spades));
		testStack.push(new Card(2, Card.Suit.Hearts));
		testStack.push(new Card(3, Card.Suit.Clubs));
		testStack.push(new Card(4, Card.Suit.Diamonds));

		//passed the stack to drawPile and added the returned JLayeredPane to gameArea3
		JLayeredPane stackPane = drawPile(testStack);
		gameArea3.add(stackPane);

		this.add(gameArea);
		this.setVisible(true);
	}
	//Takes in a stack of cards and returns the cards on the screen.
	public JLayeredPane drawPile(Stack<Card> stackIn) {
        JLayeredPane layeredPane = new JLayeredPane();

		Object[] cards = stackIn.toArray();
		int cardCount = cards.length;
		//sizing
		int cardWidth = 73;
		int cardHeight = 97;
		int verticalOffset=25;

		//pref size & bounds of the pane dimensions
		int totalHeight = cardHeight + (cardCount * verticalOffset);
        layeredPane.setPreferredSize(new Dimension(cardWidth, totalHeight));
        layeredPane.setBounds(0, 0, cardWidth, totalHeight);
		//itereatin through cards
		for(int i=0;i<cardCount;i++){
			Card card = (Card) cards[i];
			//vertical
			int yPos = i * verticalOffset;
			card.setBounds(0,yPos,cardWidth,cardHeight);
			layeredPane.add(card,Integer.valueOf(i));
		}
		return layeredPane;
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