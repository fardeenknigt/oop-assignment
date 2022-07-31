import javax.swing.*;
import java.awt.*;

class GUI_5_Borders
{
	public static void main (String arg[])
	{
		JFrame frm = new JFrame();
		Container c = frm.getContentPane();
		BorderLayout bl = new BorderLayout();
		c.setLayout(bl);
		
		String[] strDirection = {"North","South","East","West","Center"};
		JButton[] btn = new JButton[5];
		for (int i=0;i<btn.length;i++)
		{
			btn[i]=new JButton(strDirection[i]);
			c.add(btn[i],strDirection[i]);
		}
		frm.setVisible(true);
		frm.setTitle("Knight_Border");
		frm.setBounds(100,50,600,500);
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
	}
}