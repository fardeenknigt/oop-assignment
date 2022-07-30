import javax.swing.*;
import java.awt.*;
class GUIArrayButtons
{
	public static void main (String arg[])
	{
		JFrame frm= new JFrame();
		Container  c = frm.getContentPane();
		FlowLayout flw = new FlowLayout();
		c.setLayout(flw);
		
		JButton[] btn=new JButton[100];
		for(int i=0;i<btn.length;i++)
		{
			btn[i]=new JButton((i+1)+" ");
			c.add(btn[i]);
		}
		frm.setBounds(100,200,600,400);
		frm.setTitle("Knight Array Buttons");
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}