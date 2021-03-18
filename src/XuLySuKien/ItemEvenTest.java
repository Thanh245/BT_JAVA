package XuLySuKien;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class ItemEvenTest extends JFrame implements ItemListener
{
	JLabel lb1, lb2;
	JButton e ;
	JCheckBox male, female;
	Choice choice;
	List list;
	JPanel pn, pn1, pn2, pn3;
	@SuppressWarnings("deprecation")
	public void GUI()
	{
		lb1 = new JLabel ("Item Even Test");
		lb2 = new JLabel ();
		
		e = new JButton("Exit");
		
		male   = new JCheckBox("Male");
		female = new JCheckBox("Female");
		
		choice = new Choice();
		choice.add("Unix");
		choice.add("Linux");
		choice.add("Windows");
		
		list = new List();
		list.add("Lion");
		list.add("Tiger");
		list.add("Fox");
		list.add("Woff");
		list.add("Elephant");
		
		male.addItemListener(this);
		female.addItemListener(this);
		choice.addItemListener(this);
		list.addItemListener(this);
		e.addItemListener(this);
		
		pn  = new JPanel(new GridLayout(3,1));
		pn1 = new JPanel(new FlowLayout());
		pn2 = new JPanel(new GridLayout(1,3));
		pn3 = new JPanel(new GridLayout(2,1));
		
		pn1.add(lb1);
		
		pn2.add(male);
		pn2.add(female);
		pn2.add(choice);
		pn2.add(list);
		
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
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getSource()==e) System.exit(0);
		if (e.getSource() == female) {
			if (e.getStateChange() == ItemEvent.SELECTED) lb1.setText("You select Female");
			else if (e.getStateChange() == ItemEvent.DESELECTED) lb1.setText("You deselect Female");
		}
		
		else if (e.getSource() == male) {
			if (e.getStateChange() == ItemEvent.SELECTED) lb1.setText("You select Male");
			else if (e.getStateChange() == ItemEvent.DESELECTED) lb1.setText("You deselect Male");
		}
		
		else if (e.getSource() == choice) lb1.setText("You select a item in Choice List");
		else if (e.getSource() == list) lb1.setText("You select a item in List");
	}
	public ItemEvenTest(String st)
	{
		super(st);
		GUI();
	}
	public static void main(String[] args)
	{
		new ActionEvenTest("Item Even Test");
	}
}
