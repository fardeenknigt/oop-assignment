import javax.swing.*;
import java.awt.*;
class GUIButton
{
	public static void main (String arg[])
	{
		JFrame frm = new JFrame();
		Container c = frm.getContentPane();
		FlowLayout flw = new FlowLayout();
		c.setLayout(flw);
		
		JButton b1 = new JButton("button 1");
		JButton b2 = new JButton("button 2 ");
		
	    c.add(b1);
		c.add(b2);
		
		frm.setVisible(true);
		frm.setBounds(100,100,900,300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setTitle("Knight_frame");
	}
}

