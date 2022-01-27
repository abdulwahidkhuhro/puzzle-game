import java.awt.*;
import java.awt.event.*;
public class PuzzleGame implements ActionListener{
	Frame window = new Frame();
	Button[][] button = new Button[4][4];
	Font font = new Font("SansSerif", Font.BOLD, 45);
	
	public PuzzleGame(){
		window.setBounds(0,0,510,510);
		window.setLayout(null);
		
		for(int i = 0,k = 1; i < button.length; i++){
			for(int j = 0; j < button[i].length; j++){
				if( i == 0 && j == 0){
					button[i][j] = new Button("");
				}
				else{
					button[i][j] = new Button(k+"");
				}
				
				button[i][j].setFont(font);
				button[i][j].addActionListener(this);
				window.add(button[i][j]);
				k++;
			}
		}
		
		button[0][0].setBounds(10,35,125,125);
		button[0][1].setBounds(130,35,125,125);
		button[0][2].setBounds(255,35,125,125);
		button[0][3].setBounds(380,35,125,125);
		
		button[1][0].setBounds(10,155,125,125);
		button[1][1].setBounds(130,155,125,125);
		button[1][2].setBounds(255,155,125,125);
		button[1][3].setBounds(380,155,125,125);
		
		button[2][0].setBounds(10,275,125,125);
		button[2][1].setBounds(130,275,125,125);
		button[2][2].setBounds(255,275,125,125);
		button[2][3].setBounds(380,275,125,125);
		
		button[3][0].setBounds(10,395,125,125);
		button[3][1].setBounds(130,395,125,125);
		button[3][2].setBounds(255,395,125,125);
		button[3][3].setBounds(380,395,125,125);
		
		
		window.setTitle(window.getWidth()+"");
		window.show();
	}
	
	public void actionPerformed(ActionEvent e){
		if(button[0][0] == e.getSource()){
			moveBox(0,0);
		}else if(button[0][1] == e.getSource()){
			moveBox(0,1);
		}else if(button[0][2] == e.getSource()){
			moveBox(0,2);
		}else if(button[0][3] == e.getSource()){
			moveBox(0,3);
		}else if(button[1][0] == e.getSource()){
			moveBox(1,0);
		}else if(button[1][1] == e.getSource()){
			moveBox(1,1);
		}else if(button[1][2] == e.getSource()){
			moveBox(1,2);
		}else if(button[1][3] == e.getSource()){
			moveBox(1,3);
		}else if(button[2][0] == e.getSource()){
			moveBox(2,0);
		}else if(button[2][1] == e.getSource()){
			moveBox(2,1);
		}else if(button[2][2] == e.getSource()){
			moveBox(2,2);
		}else if(button[2][3] == e.getSource()){
			moveBox(2,3);
		}else if(button[3][0] == e.getSource()){
			moveBox(3,0);
		}else if(button[3][1] == e.getSource()){
			moveBox(3,1);
		}else if(button[3][2] == e.getSource()){
			moveBox(3,2);
		}else if(button[3][3] == e.getSource()){
			moveBox(3,3);
		}
	}
	
	public void moveBox(int a, int b){
		int left = b-1;
		int right = b+1;
		int up = a-1;
		int down = a+1;
		if(left >= 0){
			if(button[a][left].getLabel().equals("")){
					button[a][left].setLabel(button[a][b].getLabel());
					button[a][b].setLabel("");
			}
		}
		if(right <=3){
			if(button[a][right].getLabel().equals("")){
					button[a][right].setLabel(button[a][b].getLabel());
					button[a][b].setLabel("");
			}
		}
		if(up >=0){
			if(button[up][b].getLabel().equals("")){
					button[up][b].setLabel(button[a][b].getLabel());
					button[a][b].setLabel("");
			}
		}
		if(down <= 3){
			if(button[down][b].getLabel().equals("")){
					button[down][b].setLabel(button[a][b].getLabel());
					button[a][b].setLabel("");
			}
		}
	}

	public static void main(String[] args){
		new PuzzleGame();
	}
}