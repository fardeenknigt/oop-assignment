import javax.swing.*;
import java.awt.*;
class GUI_Border_Panel
{
	public static void main (String arg[])
	{
		JFrame frm= new JFrame();
		Container c =frm.getContentPane();
		BorderLayout bl = new BorderLayout();
		c.setLayout(bl);
		
		Panel pnl = new Panel();
		pnl.setLayout(new GridLayout(3,4));
		
		JButton[] btn = new JButton[10];
		for(int i=0;i<btn.length;i++)
		{
			btn[i]=new JButton(i+1+" ");
			pnl.add(btn[i]);
		}
		TextField tf= new TextField();
		c.add(tf,BorderLayout.NORTH);
		c.add(pnl,BorderLayout.CENTER);
		
		frm.setBounds(100,50,300,400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setTitle("Knight_Borderpanel");
	}
}

 