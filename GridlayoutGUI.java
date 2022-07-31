import javax.swing.*;
import java.awt.*;
class GridLayoutGUI
{
	public static void main (String arg[])
	{
		JFrame frm= new JFrame();
		Container c =frm.getContentPane();
		GridLayout bl = new GridLayout(3,4,5,6);
		c.setLayout(bl);
		
		JButton[] btn= new JButton[15];
		for(int i=0;i<btn.length;i++)
		{
			btn[i]=new JButton((i+1)+"");
			c.add(btn[i]);
		}
		frm.setBounds(100,50,300,400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setTitle("Knight_Grid_Layout");
	}
}

 