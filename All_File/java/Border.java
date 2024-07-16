import java.awt.*;
import javax.swing.*;
public class Border{
	JFrame f;
	Border(){
		f=new JFrame();
		JButton b1=new JButton("NORTH");
		JButton b1=new JButton("SOUTH");
		JButton b1=new JButton("EAST");
		JButton b1=new JButton("WEST");
		JButton b1=new JButton("CENTER");
		f.add(b1,BorderLayout.NORTH);
		f.add(b1,BorderLayout.SOUTH);
		f.add(b1,BorderLayout.EAST);
		f.add(b1,BorderLayout.WEST);
		f.add(b1,BorderLayout.CENTER);
		f.setsize(300,300);
		f.setvisible(true);
	}
	 public static void main(String[] args) {
		new Border();
	}
}