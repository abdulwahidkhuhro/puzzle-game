import java.awt.*;
public class PuzzleGame {
	Frame window = new Frame();
	Button[] button = new Button[16];
	Font font = new Font("SansSerif", Font.BOLD, 45);
	
	public PuzzleGame(){
		window.setBounds(0,0,510,510);
		window.setLayout(null);
		window.setTitle(window.getWidth()+"");
		
		for(int i = 0; i < button.length; i++){
			if( i == 0)
				button[i] = new Button();
			else
				button[i] = new Button(i+"");
			button[i].setFont(font);
			window.add(button[i]);
		}
		
		button[0].setBounds(10,35,125,125);
		button[1].setBounds(130,35,125,125);
		button[2].setBounds(255,35,125,125);
		button[3].setBounds(380,35,125,125);
		
		button[4].setBounds(10,155,125,125);
		button[5].setBounds(130,155,125,125);
		button[6].setBounds(255,155,125,125);
		button[7].setBounds(380,155,125,125);
		
		button[8].setBounds(10,275,125,125);
		button[9].setBounds(130,275,125,125);
		button[10].setBounds(255,275,125,125);
		button[11].setBounds(380,275,125,125);
		
		button[12].setBounds(10,395,125,125);
		button[13].setBounds(130,395,125,125);
		button[14].setBounds(255,395,125,125);
		button[15].setBounds(380,395,125,125);
		
		
		window.setTitle(window.getWidth()+"");
		window.show();
	}
	public static void main(String[] args){
		new PuzzleGame();
	}
}