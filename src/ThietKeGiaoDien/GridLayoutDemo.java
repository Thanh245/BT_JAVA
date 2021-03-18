package ThietKeGiaoDien;
import java.awt.*;
import java.applet.*;
@SuppressWarnings("serial")
public class GridLayoutDemo extends Applet
{
	public void init()
	{
		//Cread a list of colors
		Label xLabel = new Label("X coordinate: ");
		Label yLabel = new Label("Y coordinate: ");
		TextField xInput = new TextField(5);
		TextField yInput = new TextField(5);
		//Tao ra luoi hinh chu nhat co 4 o va dat layout
		//De sap xep cac thanh phan XLabel, xInput, yLabel, yInput
		setLayout (new GridLayout(2,2));
		add(xLabel); //Dat xlabel vao o thu nhat
		add(xInput); //Dat xInput vao o thu hai
		add(yLabel); //Dat yLabel vao o thu ba
		add(yInput); //Dat yInput vao o thu tu
	}
}
