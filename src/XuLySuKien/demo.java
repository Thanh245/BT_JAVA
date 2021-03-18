package XuLySuKien;
import java.awt.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.*;
@SuppressWarnings("serial")
public class demo extends JFrame implements ActionListener
{
	JLabel lb1 = new JLabel ("Xử lý xâu");
	JTextArea textArea = new JTextArea();
	JButton btnNewButton = new JButton("Send");
	private Socket socket;
	@SuppressWarnings("unused")
	private JFrame frmXuLyXau;
	private JTextField textField;
	
	
	JPanel pn, pn1, pn2, pn3;
	@SuppressWarnings("deprecation")
	public void GUI()
	{
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea.setBackground(Color.BLACK);
		textArea.setLineWrap(true);
		textArea.setEnabled(false);
		
		


		
		pn  = new JPanel(new GridLayout(3,1));
		pn1 = new JPanel(new FlowLayout());
		pn2 = new JPanel(new GridLayout(1,3));
		pn3 = new JPanel(new GridLayout(2,1));
		
		pn1.add(lb1);

		
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
		try {
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream din = new DataInputStream(socket.getInputStream());
			String text = textField.getText();
			String str = textField.getText();
			if (str.isEmpty()) return;
			dos.writeUTF(str);
			if (text.equalsIgnoreCase("exit")) {
				socket.close();
				System.exit(0);
			}
			textArea.append("\n Xau nhap:" + text);
			textArea.append("\n \tChuoi thuong: " + din.readUTF());
			textArea.append("\n \tChuoi hoa: " + din.readUTF());
			textArea.append("\n \tChuoi hoa thuong: " + din.readUTF());
			textArea.append("\n \tSo tu: " + din.readUTF() + ",so nguyen am: " + din.readUTF());
			textField.setText("");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	public demo(String st)
	{
		super(st);
		GUI();
	}
	public static void main(String[] args)
	{
		new ActionEvenTest("Action Even Test");
	}
}
