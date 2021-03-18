package ThietKeGiaoDien;
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class GridBagLayoutDemo extends JFrame
{
	JLabel lb1 = new JLabel("Name");
	JTextField tf1 = new JTextField(50);
	JLabel lb2 = new JLabel("Address");
	JTextArea ta1  = new JTextArea();
	JLabel lb3 = new JLabel("Sex");
	CheckboxGroup cb = new CheckboxGroup();
	Checkbox cb1 = new Checkbox("Male",cb,true);
	Checkbox cb2 = new Checkbox("Female",cb, false);
	JLabel lb4 = new JLabel("Hobbies");
	Checkbox cb3 = new Checkbox("Reading",true);
	Checkbox cb4 = new Checkbox("Sport", false);
	Checkbox cb5 = new Checkbox("Traveling",false);
	JLabel lb5 = new JLabel("Age Group");
	Choice ch1 = new Choice();
	JButton bt1 = new JButton("OK");
	JButton bt2 = new JButton("Cancel");
	
	GridBagLayout gb;
	GridBagConstraints gbc;
	public GridBagLayoutDemo (String title)
	{
		super (title);
		gb = new GridBagLayout();
		setLayout(gb);
		ch1.addItem("--");
		ch1.addItem("0-10");
		ch1.addItem("10-20");
		ch1.addItem("20-30");
		ch1.addItem("30-40");
		ch1.addItem("above 40");
		gbc = new GridBagConstraints();
		/*addComponent(lb1,0,0,1,1,GridBagConstraints.HORIZONTAL);
		addComponent(tf1,0,1,1,1,GridBagConstraints.HORIZONTAL);
		addComponent(lb2,1,0,1,1,GridBagConstraints.HORIZONTAL);
		addComponent(ta1,1,1,1,1,GridBagConstraints.HORIZONTAL);
		addComponent(lb3,2,0,1,1,GridBagConstraints.HORIZONTAL);
		addComponent(cb1,2,1,1,1,GridBagConstraints.HORIZONTAL);
		int nrow;
		gbc.gridheight = nrow;
		int fill;
		gbc.fill = fill;
		Component c;
		gb.setConstraints(c,gbc);
		add(c);*/
	}
	public static void main(String args[])
	{
		new GridBagLayoutDemo("GridBagLayout Demo");
	}
}
