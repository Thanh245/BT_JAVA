package XuLySuKien;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class DoiCoSo extends Frame implements ActionListener 
{
	Label lb1, lb2, lb3, lb4, lb;
	TextField txt1, txt2, txt3, txt4;
	Button ok, reset, thoat;
	Panel pn, pn1, pn2, pn3;
	@SuppressWarnings("deprecation")
	public void GUI()
	{
		lb  = new Label ("Doi Co So");
		lb1 = new Label ("Nhap n:");
		lb2 = new Label ("Nhi Phan:");
		lb3 = new Label ("Bat Phan: ");
		lb4 = new Label ("Thap Luc Phan Phan: ");
		
		txt1 = new TextField();
		txt2 = new TextField();
		txt3 = new TextField();
		txt4 = new TextField();
		
		ok    = new Button("OK");
		reset = new Button("Reset");
		thoat = new Button("Thoat");
		
		ok.addActionListener(this);
		reset.addActionListener(this);
		thoat.addActionListener(this);
		
		pn  = new Panel(new GridLayout(3,1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(4,2));
		pn3 = new Panel(new GridLayout(1,3));
		
		pn1.add(lb);
		
		pn2.add(lb1);
		pn2.add(txt1);
		pn2.add(lb2);
		pn2.add(txt2);
		pn2.add(lb3);
		pn2.add(txt3);
		pn2.add(lb4);
		pn2.add(txt4);
		
		pn3.add(ok);
		pn3.add(reset);
		pn3.add(thoat);
		
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		
		add(pn);          //add vung tong pn vao frame
		setSize(400,300); //thiet lap kich thuoc
 		show();           //hien thi
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==thoat) System.exit(0);
		else if (e.getSource() == reset)
		{
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
			txt4.setText("");
		}
		else if (e.getSource()==ok)
		{
			long n = 0;
			try
			{
				n = Long.parseLong(txt1.getText());
			}
			catch(NumberFormatException ex)
			{
				return;
			}
			txt2.setText(Long.toBinaryString(n));
			txt3.setText(Long.toOctalString(n));
			txt4.setText(Long.toHexString(n));
		}
	}
	public DoiCoSo(String st)
	{
		super(st);
		GUI();
	}
	public static void main(String[] args)
	{
		new DoiCoSo("Doi Co So");
		
	}
}
