import java.awt.*;
import java.awt.event.*;
public class PuzzleGame implements ActionListener{
	Frame window = new Frame();
	Button[] button = new Button[16];
	Font font = new Font("SansSerif", Font.BOLD, 45);
	
	public PuzzleGame(){
		window.setBounds(0,0,510,510);
		window.setLayout(null);
		window.setTitle(window.getWidth()+"");
		
		for(int i = 0; i < button.length; i++){
			if( i == 0)
				button[i] = new Button("");
			else
				button[i] = new Button(i+"");
			button[i].setFont(font);
			button[i].addActionListener(this);
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
	
	public void actionPerformed(ActionEvent e){
		if(button[0] == e.getSource()){
			moveBox(Integer.parseInt(button[0].getLabel()));
		}else if(button[1] == e.getSource()){
			moveBox(Integer.parseInt(button[1].getLabel()));
		}else if(button[2] == e.getSource()){
			moveBox(Integer.parseInt(button[2].getLabel()));
		}else if(button[3] == e.getSource()){
			moveBox(Integer.parseInt(button[3].getLabel()));
		}else if(button[4] == e.getSource()){
			moveBox(Integer.parseInt(button[4].getLabel()));
		}else if(button[5] == e.getSource()){
			moveBox(Integer.parseInt(button[5].getLabel()));
		}else if(button[6] == e.getSource()){
			
		}else if(button[7] == e.getSource()){
			
		}else if(button[8] == e.getSource()){
			
		}else if(button[9] == e.getSource()){
			
		}else if(button[10] == e.getSource()){
			
		}else if(button[11] == e.getSource()){
			
		}else if(button[12] == e.getSource()){
			
		}else if(button[13] == e.getSource()){
			
		}else if(button[14] == e.getSource()){
			
		}else if(button[15] == e.getSource()){
			
		}
	}
	
	private void moveBox(int selected){
		int left = selected - 1,up = selected - 4,right = selected + 1,down = selected + 4;
		if(up < 0){
			/*if(left < 0){
					if(indexOfEmptyBox != -2){
						int destination = indexOfEmptyBox(left, up, right, down);
						button[destination].setLabel(selected+"");
						button[selected].setLabel("");
					}
				}*/
			int destination = indexOfEmptyBox(left, up, right, down);
			if(destination != -2){
				button[destination].setLabel(selected+"");
				button[selected].setLabel("");
			}
		}else if(down > 15){
			int destination = indexOfEmptyBox(left, up, right, down);
			if(destination != -2){
				button[destination].setLabel(selected+"");
				button[selected].setLabel("");
			}
		}else{
			int destination = indexOfEmptyBox(left, up, right, down);
			if(destination != -2){
				button[destination].setLabel(selected+"");
				button[selected].setLabel("");
			}
		}
		
	}
	
	private void ifPossibleMoveIs(){
		
	}
	private int indexOfEmptyBox(int left, int up, int right, int down){
		if(isEmpty(left)){
			return left;
		}else if(isEmpty(up)){
			return up;
		}else if(isEmpty(right)){
			return right;
		}else if(isEmpty(down)){
			return down;
		}
		return -2;
	}
	
	private boolean isEmpty(int choice){
		if(choice < 0)
			return false;
		return button[choice].getLabel().equals("");
	}
	public static void main(String[] args){
		new PuzzleGame();
	}
}