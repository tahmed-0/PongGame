import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {
	
	GamePanel panel = new GamePanel();
	
	GameFrame() {
		
		//window UI
		
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.pack(); //window to fit on preferred size
		this.setVisible(true);
		this.setLocationRelativeTo(null); //appears in the middle
	}

}
