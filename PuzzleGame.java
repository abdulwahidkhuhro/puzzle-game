import javax.swing.*;
public class PuzzleGame {
	private JFrame window = new JFrame("Puzzle Game");
	//private Container windowContainer = window.getContainer();
	private JButton[] button = new JButton[16];
	public PuzzleGame(){
		window.setBounds(0,0,400,400);
		
		
		window.setVisible(true);
	}
	
	public static void main(String[] args){
		new PuzzleGame();
	}
}