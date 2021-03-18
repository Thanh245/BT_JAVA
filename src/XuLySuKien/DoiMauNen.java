package XuLySuKien;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class DoiMauNen extends Frame implements ActionListener
{
	Label lb;
	Button r, g, b, e;
	Panel pn, pn1, pn2;
	@SuppressWarnings("deprecation")
	public void GUI()
	{
		lb = new Label ("Doi mau nen");
		r = new Button("Red"); 
		g = new Button("Green");
		b = new Button("Blue");
		e = new Button("Exit");
		
		r.addActionListener(this);
		g.addActionListener(this);
		b.addActionListener(this);
		e.addActionListener(this);
		
		pn  = new Panel (new GridLayout(2,1));
		pn1 = new Panel (new FlowLayout());
		pn2 = new Panel (new FlowLayout());
		
		pn1.add(lb);
		
		pn2.add(r);
		pn2.add(g);
		pn2.add(b);
		pn2.add(e);
		
		pn.add(pn1);
		pn.add(pn2);
		
		add(pn);
		setSize(400,200);
		show();
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==r)
		{
			pn1.setBackground(Color.red);
			pn2.setBackground(Color.red);
		}
		if (ae.getSource()==g)
		{
			pn1.setBackground(Color.green); 
			pn2.setBackground(Color.green); 
		}
		if (ae.getSource()==b)
		{
			pn1.setBackground(Color.blue);
			pn2.setBackground(Color.blue);
		}
		if (ae.getSource()==e) System.exit(0);
	}
	
	public DoiMauNen(String st)
	{
		super(st);
		GUI();
	}
	public static void main (String[] args)
	{
		new DoiMauNen("Doi Mau Nen");
	}
}
