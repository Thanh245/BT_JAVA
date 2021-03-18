package XuLySuKien;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class MinhHoaPhepToan extends Frame implements ActionListener
{
	Label lb1, lb2,lb3, lb;
	TextField tx1, tx2, tx3;
	Button bt1, bt2, bt3, bt4, bt5, bt6, bt7;
	Panel pn, pn1, pn2, pn3, pn4;
	@SuppressWarnings("deprecation")
	public void GUI()
	{
		lb  = new Label ("Minh Hoa Phep Toan");
		lb1 = new Label ("Nhap so 1: ");
		lb2 = new Label ("Nhap so 2: ");
		lb3 = new Label ("Ket qua: ");
		
		tx1 = new TextField();
		tx2 = new TextField();
		tx3 = new TextField();
		
		bt1 = new Button("+");
		bt2 = new Button("-");
		bt3 = new Button("*");
		bt4 = new Button("/");
		bt5 = new Button("%");
		bt6 = new Button("Reset");
		bt7 = new Button("Exit");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		bt7.addActionListener(this);
		
		pn  = new Panel(new GridLayout(4,1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(3,2));
		pn3 = new Panel(new GridLayout(1,5));
		pn4 = new Panel(new GridLayout(1,2));
		
		pn1.add(lb);
		
		pn2.add(lb1);
		pn2.add(tx1);
		pn2.add(lb2);
		pn2.add(tx2);
		pn2.add(lb3);
		pn2.add(tx3);
		
		pn3.add(bt1);
		pn3.add(bt2);
		pn3.add(bt3);
		pn3.add(bt4);
		pn3.add(bt5);
		
		pn4.add(bt6);
		pn4.add(bt7);
		
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		pn.add(pn4);
		
		add(pn);
		setSize(400,300);
		show();		
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == bt7) System.exit(0);
		int a = Integer.parseInt(tx1.getText());
		int b = Integer.parseInt(tx2.getText());
		if (e.getSource()==bt1) tx3.setText(Float.toString((float)a+b));
		if (e.getSource()==bt2) tx3.setText(Float.toString((float)a-b));
		if (e.getSource()==bt3) tx3.setText(Float.toString((float)a*b));
		if (e.getSource()==bt4)
		{
			if (b == 0) tx3.setText("Loi chia cho 0");
			else tx3.setText(Float.toString((float)a/b));
		}
		if (e.getSource()==bt5)
		{
			if (b == 0) tx3.setText("Loi chia cho 0");
			else tx3.setText(Float.toString((float)a%b));
		}
		if (e.getSource() == bt6)
		{
			tx1.setText("");
			tx2.setText("");
			tx3.setText("");
		}
	}
	public MinhHoaPhepToan(String st)
	{
		super(st);
		GUI();
	}
	public static void main(String[] args)
	{
		new MinhHoaPhepToan(" Minh Hoa Phep Toan");
	}
}
