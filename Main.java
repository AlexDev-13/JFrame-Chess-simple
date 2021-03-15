import java.lang.String;
import java.lang.System;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;




public class Main {
    public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setBounds(10,10,512,512);
		frame.setUndecorated(true);
		JPanel panel = new JPanel(){
			@Override
			public void paint(Graphics g){
				boolean white = true;
				for (int y = 0; y<8; y++){
					for (int x = 0; x<8; x++){
						if(white){
							g.setColor(Color.white);
						}
						else{
							g.setColor(Color.black);
						}
						g.fillRect(x*64,y*64,64,64);
					white = !white;
					}	
					white =! white;
				}
			} 
		};
		frame.add(panel);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
	}
}


