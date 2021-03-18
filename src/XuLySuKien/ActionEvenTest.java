package XuLySuKien;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class ActionEvenTest extends JFrame implements ActionListener
{
	JLabel lb1, lb2;
	JButton o ,e ;
	JTextField txt;
	List l;
	JPanel pn, pn1, pn2, pn3;
	@SuppressWarnings("deprecation")
	public void GUI()
	{
		lb1 = new JLabel ("Action Even Test");
		lb2 = new JLabel ();
		
		o = new JButton("OK");
		e = new JButton("Exit");
		txt = new JTextField(12);
		l = new List();
		l.add("Lion");
		l.add("Tiger");
		l.add("Fox");
		l.add("Woff");
		l.add("Elephant");
		
		l.addActionListener(this);
		o.addActionListener(this);
		e.addActionListener(this);
		txt.addActionListener(this); 
		
		pn  = new JPanel(new GridLayout(3,1));
		pn1 = new JPanel(new FlowLayout());
		pn2 = new JPanel(new GridLayout(1,3));
		pn3 = new JPanel(new GridLayout(2,1));
		
		pn1.add(lb1);
		
		pn2.add(o);
		pn2.add(txt);
		pn2.add(l);
		//pn2.setSize(400,50);
		
		pn3.add(e);
		pn3.add(lb2);
		
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pn);
		setVisible(true);
		setSize(400,200);
		show();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==e) System.exit(0);
		if (ae.getSource()==txt) 
			lb2.setText("You click in TextField");
		if (ae.getSource()== o)
			lb2.setText("You click in Button");
		if (ae.getSource()== l)
			lb2.setText("You double click in List");
	}
	public ActionEvenTest(String st)
	{
		super(st);
		GUI();
	}
	public static void main(String[] args)
	{
		new ActionEvenTest("Action Even Test");
	}
}
