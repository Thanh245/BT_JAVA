//<applet code = BorderLayoutapp width = 300 height = 100> </applet>
package ThietKeGiaoDien;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class BorderLayoutDemo extends Applet
{
	public void init()
	{
		JTextField msg = new JTextField ("Hien thi thong bao");
		msg.setEditable(false);
		JButton nutVe = new JButton("Ve");
		Canvas vungVe = new Canvas();
		vungVe.setSize(150,150); //Dat kich thuoc cho vungVe ve tranh
		vungVe.setBackground(Color.white); //Dat mau nen la trang
		Scrollbar sb1 = new Scrollbar(Scrollbar.VERTICAL,0,10,-50,100);
		Scrollbar sb2 = new Scrollbar(Scrollbar.VERTICAL,0,10,-50,100);
		setLayout (new BorderLayout());
		add(nutVe,BorderLayout.NORTH); //Dat nut ve o tren (NORTH)
		add(msg,BorderLayout.SOUTH); //Dat msg o duoi(SOUTH)
		add(vungVe,BorderLayout.CENTER); // Dat vungVe o giua(CENTER)
		add(sb1,BorderLayout.WEST); //Dat sb1 o ben trai(WEST)
		add(sb2,BorderLayout.EAST); //Dat sb2 o ben phai(EAST)
	}
}